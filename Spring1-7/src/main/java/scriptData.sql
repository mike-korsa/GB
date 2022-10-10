
CREATE TABLE `products` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `price` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into products (title, price) values 
('Машина', 5000),
('Колесо', 100),
('Холодилник', 300),
('Книга', 100),
('Кран', 50),
('Флешка', 90),
('Мышка', 50),
('Монитор', 333),
('Компьютер', 444),
('Телефон', 230),
('Утюг', 80),
('Мяч', 20),
('Ракетка', 150),
('Футболка', 30),
('Шапка', 15),
('Маска', 90),
('Лыжи', 350),
('Фуфайка', 70),
('Плита', 600),
('Трубка', 5);


