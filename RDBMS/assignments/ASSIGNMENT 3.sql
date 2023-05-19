Q1- Write a query to get unique department ID from employee table.
SELECT DISTINCT DEPARTMENT_ID FROM employees;

Q2-  Write a query to get all employee details from the employee table order by first name,
descending.
SELECT * FROM employees ORDER BY FIRST_NAME DESC;

Q3- Write a query to get the employee ID, names (first_name, last_name), salary in ascending order of salary.
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME,SALARY FROM employees ORDER BY salary;

Q4- Display first name and join date of the employees who is either IT Programmer or
Sales Man.
SELECT FIRST_NAME,HIRE_DATE FROM employees WHERE JOB_ID IN ("IT_PROG","SA_MAN");

Q5- Display details of employee with ID 150 or 160.
SELECT * FROM employees WHERE EMPLOYEE_ID IN (150,160);

Q6- Display first name, salary, commission pct, and hire date for employees with salary less than 10000.
SELECT FIRST_NAME,SALARY,COMMISSION_PCT,HIRE_DATE FROM employees WHERE SALARY<10000;

Q7- Display employees where the first name or last name starts with S.
SELECT * FROM employees WHERE FIRST_NAME LIKE "S%" OR LAST_NAME LIKE "%S";

Q8- Display details of jobs in the descending order of the title.
SELECT JOB_ID,JOB_TITLE FROM jobs WHERE JOB_ID IN (SELECT DISTINCT JOB_ID FROM jobs);

Q9- Display details of the employees where commission percentage is null and salary in
the range 5000 to 10000 and department is 30.
SELECT * FROM employees WHERE COMMISSION_PCT IS NULL AND SALARY BETWEEN 5000 AND 10000 AND DEPARTMENT_ID = 30;

Q10- Display employees first_name,email who are working in “Executive” department.
SELECT FIRST_NAME,EMAIL FROM employees WHERE DEPARTMENT_ID=90;

Q11- Display unique contry_id from locations table.
SELECT DISTINCT COUNTRY_ID FROM locations;

Q12- Display all employees whose have job_id IT_PROG and FI_ACCOUNT.
SELECT * FROM employees WHERE JOB_ID IN ("IT_PROG","FI_ACCOUNT");

Q13- Display all countries in ascending order
SELECT * FROM countries ORDER BY COUNTRY_NAME;