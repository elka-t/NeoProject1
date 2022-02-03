CREATE DATABASE pojo;

CREATE TABLE customer
(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 name CHAR(40) NOT NULL,
  contact INT);

CREATE TABLE salesman
(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 sName CHAR(40) NOT NULL);

CREATE TABLE products
(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 pName CHAR(40) NOT NULL,
  price FLOAT NOT NULL);

CREATE TABLE cart
(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 productID INT NOT NULL,
  total_price DOUBLE ,
  amount INT NOT NULL,
FOREIGN KEY(productID) REFERENCES products(id));
