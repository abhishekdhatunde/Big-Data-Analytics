CREATE TABLE students(
    id int,
    name CHAR(20),
    marks DOUBLE 
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE;

LOAD DATA LOCAL 
INPATH '/home/niranjan/Downloads/newstudents.csv'
INTO TABLE students;



CREATE TABLE contacts(
    id INT,
    name STRING,
    emails ARRAY<STRING>,
    addr STRUCT<area:STRING,dist:STRING,pin:INT>,
    phone MAP<STRING,STRING>
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
COLLECTION ITEMS TERMINATED BY '|'
MAP KEYS TERMINATED BY ':'
STORED AS TEXTFILE;

LOAD DATA LOCAL 
INPATH '/home/niranjan/Desktop/dbda/Hadoop/data/contacts.csv'
INTO TABLE contacts

CREATE TABLE movies_staging(
    id INT,
    title STRING,
    genres STRING
)
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
   "separatorChar" = ',',
   "quoteChar"     = '\"',
   "escapeChar"    = '\\'
)
TBLPROPERTIES('skip.header.line.count'='1');

LOAD DATA LOCAL 
INPATH '/home/niranjan/Desktop/dbda/Hadoop/data/movies/movies.csv'
INTO TABLE contacts

CREATE TABLE tmp(
    a STRING,
    b STRING,
    c STRING
);
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE;

LOAD DATA LOCAL 
INPATH '/home/niranjan/Desktop/dbda/Hadoop/data/movies/movies.csv'
INTO TABLE tmp;