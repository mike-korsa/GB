ALTER TABLE streams RENAME COLUMN start_date TO started_at;
ALTER TABLE streams ADD COLUMN finished_at TEXT;

INSERT INTO teachers (name,surname,email) values 
('Николай','Савельев','saveliev.n@mai.ru'),
('Наталья','Петрова','petrova.n@yandex.ru'),
('Елена','Малышева','malisheva.e@google.com');

INSERT INTO courses (name) values ('Базы данных'),('Основы Python'), ('Linux. Рабочая станция');

INSERT INTO streams (course_id,number,started_at,students_amount) values 
(3,165,'18.08.2020',34),
(2,178,'02.10.2020',37),
(1,203,'12.11.2020',35),
(1,210,'03.12.2020',41);

INSERT INTO grades (teacher_id,stream_id,grade) values 
(3,1,4.7),
(2,2,4.9),
(1,3,4.8),
(1,4,4.9);