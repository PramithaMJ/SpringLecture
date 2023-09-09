CREATE TABLE employee ("id" int IDENTITY (1,1) PRIMARY KEY,
"first_name" varchar(45) DEFAULT NULL, 
"last_name" varchar(45) DEFAULT NULL, 
"email" varchar(45) DEFAULT NULL, 
) 
-- Data for table 'employee' 
INSERT INTO "employee" VALUES 
('Harry','Styles','Harry@gmail.com'),
 ('Emma','Watson','Emma@gmail.com'), 
 ('Sansa','Stark','Sansa@gmail.com'),
  ('Frodo','Baggins','Frodo@gmail.com'), 
  ('Emilia','Clarke','Emilia@gmail.com');