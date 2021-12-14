1 SELECT DISTINCT courses.name, sum(students_amount) OVER(PARTITION BY courses.id) AS students_total
	  FROM streams  
	  LEFT JOIN courses  on courses.id = streams.course_id;
2 SELECT DISTINCT teachers.id , name, surname, avg(grade) OVER(PARTITION BY teachers.id) AS avg_grade
	FROM streams  
	LEFT JOIN grades  on grades.stream_id = streams.id
	LEFT JOIN teachers on teachers.id = grades.teacher_id;


4 SELECT
  surname,
  name,
  number,
  performance
	FROM academic_performance
	  JOIN teachers 
		ON academic_performance.teacher_id = teachers.id
	  JOIN streams
		ON academic_performance.stream_id = streams.id
	WHERE number >= 200;    

Надо создать индекс для поля "number".