CREATE TABLE emp_bucket(
    empno INT,
    ename STRING,
    job STRING,
    mgr INT,
    hire STRING,
    sal DOUBLE,
    comm DOUBLE,
    deptno INT
)
CLUSTERED BY (empno) INTO 2 BUCKETS
ROW FORMAT ORC;

INSERT INTO emp
SELECT * FROM emp_staging;