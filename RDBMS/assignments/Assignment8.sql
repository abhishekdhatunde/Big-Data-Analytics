1. Give UPDATE privilages on BOOKS table to sunbeam.
GRANT UPDATE ON CLASSWORK_DB.BOOKS TO SUNBEAM;

2. Give sunbeam the right to SELECT the data from BOOKS,EMP,DEPT tables.
GRANT SELECT ON CLASSWORK_DB.BOOKS TO SUNBEAM;
GRANT SELECT ON CLASSWORK_DB.DEPT TO SUNBEAM;
GRANT SELECT ON CLASSWORK_DB.EMP TO SUNBEAM;

3. Give INSERT privilage on EMP table to sunbeam
GRANT INSERT ON CLASSWORK_DB.EMP TO SUNBEAM;

4. Give DELETE privileges on DEPT table to sunbeam
GRANT DELETE ON CLASSWORK_DB.DEPT TO SUNBEAM;

5. Take the UPDATE privilege on BOOKS table away from sunbeam.
REVOKE UPDATE ON CLASSWORK_DB.BOOKS FROM SUNBEAM;

6. Take the INSERT privilege on EMP table away from sunbeam.
REVOKE INSERT ON CLASSWORK_DB.EMP FROM SUNBEAM;

7. Take the DELETE privilege on DEPT table away from sunbeam.
REVOKE DELETE ON CLASSWORK_DB.DEPT FROM SUNBEAM;

8. Take the SELECT privilege on BOOKS,EMP,DEPT tables away from sunbeam
REVOKE SELECT ON CLASSWORK_DB.DEPT FROM SUNBEAM;
REVOKE SELECT ON CLASSWORK_DB.EMP FROM SUNBEAM;
REVOKE SELECT ON CLASSWORK_DB.BOOKS FROM SUNBEAM;