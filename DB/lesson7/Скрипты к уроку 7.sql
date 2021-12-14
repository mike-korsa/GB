1 SELECT c.name as course_name, max(s.number) as course_number, avg(g.grade) as avg_grade, max(s.started_at) as started_at 
	FROM courses c 
		LEFT JOIN streams s 
			ON s.course_id=c.id 
		LEFT JOIN grades g 
			ON g.stream_id = s.id
	GROUP by c.id;
2 BEGIN TRANSACTION;
	  DELETE FROM grades WHERE teacher_id=3;
	  DELETE FROM teachers WHERE id=3;
  COMMIT;
  
3 CREATE TRIGGER check_grade BEFORE INSERT
	ON grades
	BEGIN
	  SELECT CASE 
	  WHEN    
		(NEW.grade <= 0 or NEW.grade > 5)
	  THEN
		RAISE(ABORT, 'Wrong grade! Must be 1 - 5.')
	  END;
	END;
4 CREATE TRIGGER check_stream BEFORE INSERT
	ON streams
	BEGIN
	  SELECT CASE 
	  WHEN    
		(NEW.started_at <= (SELECT date('now')))
	  THEN
		RAISE(ABORT, 'Wrong stream (started_at)!')
	  WHEN    
		(NEW.number <= (SELECT max(number) FROM streams))
	  THEN
		RAISE(ABORT, 'Wrong stream (number)!')
	  END;
	END;
	
4.1 CREATE TRIGGER check_stream BEFORE INSERT
	ON streams
	BEGIN
	  SELECT CASE 
	  WHEN    
		(NEW.started_at <= (SELECT date('now')) or NEW.number <= (SELECT max(number) FROM streams))
	  THEN
		RAISE(ABORT, 'Wrong stream!')
	  END;
	END;	