CREATE TABLE hello (
  id BIGINT PRIMARY KEY,
  message VARCHAR(255) NOT NULL
);


INSERT INTO hello (id, message)
VALUES (1, 'Hello, World!');