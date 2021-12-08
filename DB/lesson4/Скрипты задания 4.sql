1 UPDATE streams SET started_at = SUBSTR(started_at, 7, 4) || '-' || SUBSTR(started_at, 4, 2) || '-' || SUBSTR(started_at, 1, 2);
2 SELECT id, number FROM streams ORDER by	started_at DESC LIMIT 1;
3 SELECT DISTINCT substr(started_at,1,4) as year FROM streams;
4 SELECT count(*) as total_teachers FROM teachers;
5 SELECT started_at FROM streams ORDER by started_at DESC LIMIT 2;
6 SELECT avg(grade) as avg_grade FROM grades WHERE teacher_id=1;
7 SELECT teacher_id, avg(grade) as avg_grade FROM grades GROUP by teacher_id HAVING avg_grade < 4.8;
