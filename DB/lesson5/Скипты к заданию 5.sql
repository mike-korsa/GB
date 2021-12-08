1 SELECT number, (SELECT name FROM courses WHERE id = s.course_id) as course, students_amount FROM streams s where students_amount >= 40;
2 SELECT number, (SELECT name FROM courses WHERE id = s.course_id) course, 
  (SELECT surname || ' ' ||  name FROM teachers where id = (SELECT teacher_id FROM grades WHERE stream_id = s.id ) ) as teacher,
  (select grade from grades where stream_id = s.id) as grade FROM streams s order by grade limit 2;
3 SELECT  teacher_id, avg(grade) as avg_grade FROM grades where teacher_id = (SELECT id FROM teachers WHERE name = 'Николай' and surname = 'Савельев') group by teacher_id;
4 SELECT (SELECT stream_id FROM grades WHERE teacher_id = t.id) as stream_id, surname || ' ' || name  as teacher
  FROM teachers t WHERE name = 'Наталья' and surname = 'Петрова'
  UNION
  SELECT stream_id, (SELECT surname || ' ' || name FROM teachers WHERE id = teacher_id ) as teacher
  FROM grades WHERE grade < 4.8;
5 SELECT(
  (SELECT avg(grade)FROM grades  GROUP by teacher_id 
  HAVING  max(grade) = (SELECT max(grade) FROM grades))
  -
  (SELECT avg(grade)FROM grades  GROUP by teacher_id 
  HAVING  min(grade) = (SELECT min(grade) FROM grades))
  ) as delta;
  