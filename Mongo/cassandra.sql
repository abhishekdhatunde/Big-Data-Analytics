describe keyspaces;

create keyspace dbda with replication = {
    'replication_factor': 1,
    'class': 'SimpleStrategy'
};

use dbda;

describe tables;
CREATE TABLE students (
    id INT,
    name_ TEXT,
    marks FLOAT
);-- error primary key needed
CREATE TABLE students (
    id INT PRIMARY KEY,
    name_ TEXT,
    marks FLOAT
);

INSERT INTO students(id,name_,marks) VALUES (
    1,
    'FS',
    85.5
);
INSERT INTO students(id,name_,marks) VALUES (
    2,
    'FSj',
    5.5
);

select name_ from students where id= 2;

select name_ from students where name_ = 'FS';--error primary key is only indexed
select name_ from students where name_ = 'FS' ALLOW FILTERING;

CREATE INDEX idx_name_ ON dbda.students(name_);

alter table students drop INDEX idx_name_ on dbda.students(name_);

select name_ from students where name_ = 'FS';--
