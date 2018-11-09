CREATE TABLE body (
  id_body SERIAL PRIMARY KEY,
  name VARCHAR(255),
  address VARCHAR(255),
  time VARCHAR(255)
);

CREATE TABLE room (
  id_room SERIAL PRIMARY KEY,
  id_body INTEGER REFERENCES body
);

CREATE TABLE department (
  number SERIAL PRIMARY KEY,
  desctiprion VARCHAR(255),
  id_body INTEGER REFERENCES body,
  work_time VARCHAR(255),
  phone VARCHAR(255)
);

CREATE TABLE position (
  id_position SERIAL PRIMARY KEY,
  name VARCHAR(255)
);

CREATE TABLE worker (
  id_worker SERIAL PRIMARY KEY,
  surname VARCHAR(255),
  name VARCHAR(255),
  paronic VARCHAR(255),
  id_position INTEGER REFERENCES position,
  id_department INTEGER REFERENCES department,
  work_time VARCHAR(255),
  email VARCHAR(255),
  phone VARCHAR(255),
  password VARCHAR(255),
  group_lead_id INTEGER REFERENCES worker
);

CREATE TABLE news (
  id_new SERIAL PRIMARY KEY,
  id_creator INTEGER REFERENCES worker,
  description VARCHAR(255),
  id_department INTEGER REFERENCES department,
  creating_time TIMESTAMP,
  target_time TIMESTAMP
);

INSERT into position VALUES(1, 'Программист');
INSERT into position VALUES(2, 'Библиотерарь');
INSERT into position VALUES(3, 'Директор');

INSERT into body VALUES(1, 'Главный штаб', 'Ул. Название, дом 14', 'пн,ср,пт 12:00-18:00');
INSERT into body VALUES(2, 'Дворец Меншикова', 'Ул. Name, дом 1', 'пн, пт 14:00-18:00');

INSERT into room VALUES(1, 1);
INSERT into room VALUES(2, 1);

INSERT into department VALUES(11, 'Отдел тех поддержки', 1, 'каждый день 10:00-12:00', '8-981-721-22-40');
INSERT into department VALUES(22, 'Бух. учёт', 1, 'каждый день 10:00-14:00', '8-981-721-22-40');

INSERT into worker VALUES(1, 'ne Иванов', 'ne Иван', 'ne Иванович', 1, 11, 'каждый день 10:00-12:00', 'mail@mail.com', '8-981-721-22-40', 'password', NULL);
INSERT into worker VALUES(2, 'Иванов', 'Иван', 'Иванович', 3, 11, 'каждый день 10:00-12:00', 'mail@mail.com', '8-22-40', 'password', 1);
INSERT into worker VALUES(3, 'Петрова', 'Мария', 'Иванович', 2, 22, 'каждый день 10:00-12:00', 'mail@mail.com', '8-981-721-40-41', 'password', 1);

INSERT into news VALUES(1, 1, 'Добавить новое лого', 11, '2011-05-16 15:36:38', '2011-05-26 15:36:38');
INSERT into news VALUES(2, 1, 'Описание новости', 22, '2011-05-16 15:36:38', '2011-05-26 15:36:38');
