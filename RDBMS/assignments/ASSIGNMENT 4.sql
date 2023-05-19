Q1-  Display first name and last name after converting the first letter of each name to
upper case and the rest to lower case.
SELECT CONCAT(UPPER(LEFT(FIRST_NAME,1)),SUBSTRING(FIRST_NAME,2)) AS FIRST_NAME FROM employees;

Q2- Display the first word in job title.
 select job_title, substring(job_title,1, instr(job_title, " ")-1) from jobs;

Q3- Display the length of first name for employees where last name contain character ‘b’
after 3rd position.
SELECT LENGTH(FIRST_NAME) FROM employees WHERE (LAST_NAME LIKE "___b%");

Q4- Display first name in upper case and email address in lower case for employees
where the first name and email address are same irrespective of the case
SELECT UPPER(FIRST_NAME) AS FIRST_NAME, LOWER(EMAIL) AS EMAIL FROM employees WHERE NOT STRCMP(FIRST_NAME,EMAIL);

Q5- Display first name, salary, and round the salary to thousands.
SELECT FIRST_NAME,ROUND(SALARY,4) AS SALARY FROM employees;

Q6- Display employee ID and the date on which he ended his previous job.
SELECT EMPLOYEE_ID,END_DATE FROM job_history;

Q7- Display first name and date of first salary of the employees.
(Consider 1st day of month as salary day) HINT: LAST_DAY.
SELECT FIRST_NAME,DATE_ADD(LAST_DAY(HIRE_DATE), INTERVAL 1 DAY) AS SALARY_DAY FROM employees;

Q8- Display first name and experience of the employees.
SELECT FIRST_NAME,CONCAT(TIMESTAMPDIFF(YEAR,HIRE_DATE,NOW())," YEARS ", TIMESTAMPDIFF(MONTH,HIRE_DATE,NOW())%12," MONTHS") AS EXPERIENCE FROM employees;

Q9- Display first name of employees who joined in 2001.
select first_name from employees where year(hire_date)='2001';

Q10- Display employees who joined in the current year.
select first_name from employees where date(hire_date)=date(now());

Q11- Display the number of days between system date and 1st January 2011.
select datediff(now(),2011-01-01);

Q12- Display number of employees joined after 15th of the month.
SELECT COUNT(HIRE_DATE) FROM employees WHERE DAY(HIRE_DATE)>'15';

Q13- Display third highest salary of employees.
select distinct salary from employees order by salary desc limit 2,1;
