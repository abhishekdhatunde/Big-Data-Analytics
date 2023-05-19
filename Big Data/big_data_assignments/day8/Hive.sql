CREATE TABLE books_staging(
    id INT,
    title STRING,
    author STRING,
    category STRING,
    price DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
STORED AS TEXTFILE;

LOAD DATA LOCAL
INPATH '/home/niranjan/Desktop/dbda/Hadoop/data/books.csv'
INTO TABLE books_staging;

CREATE TABLE books_orc(
    id INT,
    title STRING,
    author STRING,
    category STRING,
    price DOUBLE
)
STORED AS ORC
TBLPROPERTIES('transactional'='true');

INSERT INTO books_orc
SELECT * FROM books_staging;

CREATE MATERIALIZED VIEW mv_books AS 
SELECT category, AVG(price) 
    FROM books_orc
GROUP BY category; 

SELECT *
    FROM mv_books
ORDER BY 2 DESC;

LOAD DATA LOCAL
INPATH '/home/niranjan/Desktop/dbda/Hadoop/data/newbooks.csv'
INTO TABLE  books_staging;

INSERT INTO books_orc
SELECT * 
    FROM books_staging 
WHERE category = 'Novel';

ALTER MATERIALIZED VIEW mv_books REBUILD;

UPDATE books_orc
    SET price = price * 1.1
WHERE category = 'Java Programming';

SELECT *
    FROM mv_books
ORDER BY 2 DESC;

DELETE 
    FROM books_orc
WHERE category = 'Java Programming';

DELETE 
    FROM books_staging
WHERE category = 'Java Programming';