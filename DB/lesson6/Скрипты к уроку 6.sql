1 select s.number,  c.name, s.started_at from streams s LEFT JOIN courses c on c.id=s.course_id;
2 select c.name, sum(s.students_amount) as students_amount from streams s LEFT JOIN courses c on c.id=s.course_id GROUP by s.course_id;
3 SELECT t.id, t.surname, t.name, avg(grade) as avg_grade FROM teachers t LEFT JOIN grades g on t.id=g.teacher_id GROUP by t.id;