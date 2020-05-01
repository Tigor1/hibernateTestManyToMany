DROP TABLE IF EXISTS DICK cascade;
CREATE TABLE DICK  (
    id serial PRIMARY KEY,
    name VARCHAR (50) NOT NULL,
    owner_name VARCHAR (50) NOT NULL,
    length INT
);

DROP TABLE IF EXISTS PUSSY cascade;
CREATE TABLE PUSSY  (
    id serial PRIMARY KEY,
    name VARCHAR (50) NOT NULL,
    owner_name VARCHAR (50) NOT NULL,
    deep INT
);
DROP TABLE  DICK_PUSSY cascade;
CREATE TABLE DICK_PUSSY (
    dick_id INT,
    pussy_id INT,
    FOREIGN KEY (dick_id) references DICK(id),
    FOREIGN KEY (pussy_id) references PUSSY(id)
);

INSERT INTO DICK (name, owner_name, length) VALUES ('Шон', 'Дима', 8);
INSERT INTO DICK (name, owner_name, length) VALUES ('Кот', 'Обама', 32);

INSERT INTO PUSSY (name, owner_name, deep) VALUES ('Гитлир', 'Клеопатра', 17);
INSERT INTO PUSSY (name, owner_name, deep) VALUES ('Касандра', 'Саша Грей', 45);
INSERT INTO PUSSY (name, owner_name, deep) VALUES ('Миллиса', 'Стоя', 7);

INSERT INTO DICK_PUSSY (dick_id, pussy_id) VALUES ((SELECT id from DICK where owner_name = 'Дима'),(SELECT id from PUSSY where owner_name = 'Стоя' ));
INSERT INTO DICK_PUSSY (dick_id, pussy_id) VALUES ((SELECT id from DICK where owner_name = 'Дима'),(SELECT id from PUSSY where owner_name = 'Клеопатра' ));
INSERT INTO DICK_PUSSY (dick_id, pussy_id) VALUES ((SELECT id from DICK where owner_name = 'Обама'),(SELECT id from PUSSY where owner_name = 'Клеопатра' ));
INSERT INTO DICK_PUSSY (dick_id, pussy_id) VALUES ((SELECT id from DICK where owner_name = 'Обама'),(SELECT id from PUSSY where owner_name = 'Саша Грей' ));
INSERT INTO DICK_PUSSY (dick_id, pussy_id) VALUES ((SELECT id from DICK where owner_name = 'Обама'),(SELECT id from PUSSY where owner_name = 'Стоя' ));