DROP TABLE IF EXISTS bookstore;

CREATE TABLE bookstore (
  id INT NOT NULL AUTO_INCREMENT,
  book_cat VARCHAR(45) NULL,
  bookstorecol VARCHAR(45) NULL,
  book_name VARCHAR(45) NULL,
  details VARCHAR(45) NULL,
  language VARCHAR(45) NULL,
  price FLOAT NULL,
  PRIMARY KEY (`id`));
