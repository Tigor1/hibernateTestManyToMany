CREATE TABLE DICK  (
    id serial PRIMARY KEY,
    name VARCHAR (50) NOT NULL,
    owner_name VARCHAR (50) NOT NULL,
    length INT
);

CREATE TABLE PUSSY  (
    id serial PRIMARY KEY,
    name VARCHAR (50) NOT NULL,
    deep INT
);

CREATE TABLE DICK_PUSSY (
    dick_id INT,
    pussy_id INT,
    FOREIGN KEY (dick_id) references DICK(id),
    FOREIGN KEY (pussy_id) references PUSSY(id)
);