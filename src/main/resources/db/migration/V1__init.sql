CREATE TABLE IF NOT EXISTS "USER" (
  id bigserial NOT NULL,
  name varchar(50) NOT NULL,
  email varchar(50) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT UK_email UNIQUE (email)
) ;