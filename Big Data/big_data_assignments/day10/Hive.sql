SELECT m2 FROM movies_corr 
WHERE cor > 0.5
AND cnt > 50
ORDER BY cor;

SELECT * FROM movies_corr 
WHERE cor > 0.5
AND cnt > 50
ORDER BY cor DESC;

SELECT title 
    FROM movies_orc mo
INNER JOIN movies_corr mc ON mc.m2 = mo.id  
WHERE cor > 0.5
AND cnt > 50 
AND mc.m1 = 
ORDER BY cor;

SELECT m.id, m.title, mc.cnt, mc.cor FROM movies_orc m
INNER JOIN movies_corr mc ON (mc.m1 = m.id OR mc.m2 = m.id)
WHERE mc.cnt > 50 AND (mc.m1 = 260 OR mc.m2 = 260) AND (m.id != 260)
AND mc.cor > 0.5
ORDER BY mc.cor DESC
LIMIT 10;

CREATE EXTERNAL TABLE contacts1(
    id INT,
    name STRING,
    emails ARRAY<STRING>,
    addr STRUCT<area:STRING,dist:STRING,pin:INT>,
    phone MAP<STRING, STRING>
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION '/data/contacts/';

CREATE EXTERNAL TABLE contacts2(
    data STRING
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION '/data/contacts/';

CREATE TABLE license(
    line ARRAY<STRING>
);

LOAD DATA LOCAL
INPATH '/home/niranjan/hadoop-3.3.2/LICENSE.txt'
INTO TABLE license;

SELECT word FROM license
LATERAL VIEW EXPLODE(line) v_license AS word
LIMIT 20;

CREATE TABLE licenseArray AS
SELECT word FROM license
LATERAL VIEW EXPLODE(line) v_license AS word;

SHOW TABLES;

SELECT * FROM licensearray LIMIT 10;

SELECT * FROM license LIMIT 10;

SELECT SPLIT(word, ' ') FROM licensearray LIMIT 10;

CREATE VIEW WORDS AS
SELECT SPLIT(word, ' ') FROM licensearray;

SELECT * FROM WORDS LIMIT 50;

CREATE VIEW WORDS_2 AS
SELECT SPLIT(line, ' ') FROM license;

CREATE TABLE WORDS_2 AS
SELECT SPLIT(line, ' ') FROM license;

CREATE TABLE WORDSF(
    words ARRAY<STRING>
)
ROW FORMAT DELIMITED
FIELDS TERMINATED by ',';

INSERT INTO WORDSF
SELECT word FROM licensearray WHERE word <> '';

CREATE TABLE WORDS AS
SELECT SPLIT(word, ' ') FROM licensearray;

SELECT * FROM WORDS LIMIT 10;

INSERT INTO WORDSF
SELECT 1 FROM WORDS WHERE 1 <> '';

CREATE TABLE emp_part_job(
    empno INT,
    ename STRING,
    mgr INT,
    hire STRING,
    sal DOUBLE,
    comm DOUBLE,
    deptno INT
)
PARTITIONED BY (job STRING)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ',';

CREATE TABLE emp_staging(
    empno INT,
    ename STRING,
    job STRING,
    mgr INT,
    hire STRING,
    sal DOUBLE,
    comm DOUBLE,
    deptno INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ',';

LOAD DATA LOCAL
INPATH '/home/niranjan/Desktop/dbda/Hadoop/data/emp.csv'
INTO TABLE emp_staging;

INSERT INTO emp_part_job PARTITION(job)
SELECT empno, ename, mgr, hire, sal, comm, deptno, job FROM emp_staging;


CREATE TABLE license(
    line STRING
);

LOAD DATA LOCAL
INPATH '/home/niranjan/hadoop-3.3.2/LICENSE.txt'
INTO TABLE license;

CREATE TABLE lines(
    word STRING
)
ROW FORMAT DELIMITED
FIELDS TERMINATED by ' ';

INSERT INTO lines
SELECT * FROM license;

SELECT SPLIT(line, ' ') FROM license;

CREATE TABLE WORDS(
    words ARRAY<STRING>
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ',';

INSERT INTO WORDS
SELECT SPLIT(line, ' ') FROM license;

SELECT word FROM WORDS
LATERAL VIEW EXPLODE(words) v_license AS word
LIMIT 50;

SELECT word FROM WORDS
LATERAL VIEW EXPLODE(words) v_license AS word;

CREATE TABLE SINGLE(
    single STRING
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ',';

INSERT INTO SINGLE
SELECT word FROM WORDS
LATERAL VIEW EXPLODE(words) v_license AS word;

SELECT SINGLE FROM SINGLE WHERE LENGTH(SINGLE) > 0;

SELECT SINGLE, COUNT(SINGLE) FROM SINGLE 
GROUP BY SINGLE
ORDER BY 2;

SELECT SINGLE, COUNT(SINGLE) FROM SINGLE 
WHERE SINGLE <> ''
GROUP BY SINGLE
ORDER BY 2 DESC;