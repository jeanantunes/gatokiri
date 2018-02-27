CREATE TABLE IF NOT EXISTS USER (
  id int NOT NULL DEFAULT NEXTVAL ('USER_seq'),
  name varchar(50) NOT NULL,
  email varchar(50) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT UK_email UNIQUE (email)
) ;