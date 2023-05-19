1. Display department name and manager first name.
SELECT E.FIRST_NAME, D.DEPARTMENT_NAME FROM DEPARTMENTS AS D INNER JOIN EMPLOYEES AS E ON E.EMPLOYEE_ID = D.MANAGER_ID;

2. Display department name, manager name, and city.
SELECT E.FIRST_NAME, D.DEPARTMENT_NAME, L.CITY FROM DEPARTMENTS AS D INNER JOIN EMPLOYEES AS E ON E.EMPLOYEE_ID = D.MANAGER_ID INNER JOIN LOCATIONS AS L ON L.LOCATION_ID = D.LOCATION_ID;

3. Display country name, city, and department name.
SELECT D.DEPARTMENT_NAME, C.COUNTRY_NAME, L.CITY FROM LOCATIONS AS L INNER JOIN COUNTRIES AS C ON L.COUNTRY_ID = C.COUNTRY_ID INNER JOIN DEPARTMENTS AS D ON D.LOCATION_ID = L.LOCATION_ID ;

4. Display job title, department name, employee last name, starting date for all jobs from 1993 to 1998.
SELECT E.LAST_NAME, D.DEPARTMENT_NAME, J.JOB_TITLE, JH.START_DATE FROM EMPLOYEES AS E INNER JOIN DEPARTMENTS AS D ON E.MANAGER_ID = D.MANAGER_ID INNER JOIN JOBS AS J ON J.JOB_ID = E.JOB_ID INNER JOIN JOB_HISTORY AS JH ON JH.JOB_ID = E.JOB_ID WHERE YEAR(JH.START_DATE) BETWEEN 1993 AND 1998;

5. Display job title and average salary of employees.
SELECT J.JOB_TITLE, AVG(E.SALARY) FROM JOBS AS J LEFT JOIN EMPLOYEES AS E ON J.JOB_ID = E.JOB_ID GROUP BY J.JOB_TITLE;

6. Display job title, employee name, and the difference between maximum salary for the job and salary of the employee.
SELECT E.FIRST_NAME, J.JOB_TITLE, (J.MAX_SALARY-E.SALARY) AS DIFF_SALARY FROM JOBS AS J LEFT JOIN EMPLOYEES AS E ON J.JOB_ID = E.JOB_ID;

7. Display last name, job title of employees who have commission percentage and belongs to department 30.
SELECT E.LAST_NAME, J.JOB_TITLE, E.COMMISSION_PCT FROM EMPLOYEES AS E INNER JOIN JOBS AS J ON J.JOB_ID = E.JOB_ID WHERE E.DEPARTMENT_ID=30;

8. Display details of jobs that were done by any employee who is currently drawing more than 15000 of salary.
SELECT jh.* FROM job_history AS jh JOIN employees e ON (jh.employee_id = e.employee_id) WHERE salary > 15000;

9. Display department name, manager name, and salary of the manager for all managers whose experience is more than 5 years.
SELECT D.DEPARTMENT_NAME, E.FIRST_NAME, E.SALARY FROM departments D JOIN employees E ON (D.MANAGER_ID=E.MANAGER_ID) WHERE ((SYSDATE()-HIRE_DATE) / 365) > 5;

10. Display employee name if the employee joined before his manager.
SELECT DISTINCT E.FIRST_NAME FROM EMPLOYEES AS E LEFT JOIN EMPLOYEES AS E1 ON E.MANAGER_ID = E1.MANAGER_ID WHERE E.HIRE_DATE>E1.HIRE_DATE;

11. Display employee name, job title for the jobs employee did in the past where the job was done less than six months.
SELECT E.FIRST_NAME, J.JOB_TITLE FROM EMPLOYEES AS E INNER JOIN JOB_HISTORY AS JH ON JH.EMPLOYEE_ID = E.EMPLOYEE_ID INNER JOIN JOBS AS J ON JH.JOB_ID = J.JOB_ID WHERE MONTH(JH.END_DATE-JH.START_DATE) < 6;

12. Display employee name and country in which he is working.
SELECT E.FIRST_NAME, C.COUNTRY_NAME FROM EMPLOYEES AS E JOIN DEPARTMENTS AS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID JOIN LOCATIONS AS L ON D.LOCATION_ID = L.LOCATION_ID JOIN COUNTRIES AS C ON L.COUNTRY_ID = C.COUNTRY_ID;

13. Display department name, average salary and number of employees with commission within the department.
SELECT d.department_name, AVG(e.salary), COUNT(e.commission_pct) as count FROM departments as d JOIN employees as e GROUP BY d.department_name, d.department_id;