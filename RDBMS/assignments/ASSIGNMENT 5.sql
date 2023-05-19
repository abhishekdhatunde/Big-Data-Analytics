
Q1-Write a query that counts the number of salespeople registering orders for eachday. (If a salesperson has more than one order on a given day, he or she should be
counted only once.).
select snum, odate, count(*) from orders group by snum, odate;

Q2. Write a query on the Customers table that will find the highest rating in each city. Put the output in this form:
For the city (city), the highest rating is : (rating).
select CITY, MAX(RATING) from CUSTOMERS GROUP BY CITY;

Q3 Write a query that totals the orders for each day and places the results in descending order.
SELECT ODATE, COUNT(ODATE) FROM ORDERS GROUP BY ODATE;

Q4. Write a query that selects the total amount in orders for each salesperson for whom this total is greater than the amount of the largest order in the table.
SELECT SNUM, SUM(AMT) TOTAL FROM ORDERS GROUP BY SNUM HAVING SUM(AMT)>(SELECT MAX(AMT) FROM ORDERS);

Q5. Write a query that selects the highest rating in each city.
select CITY, MAX(RATING) from CUSTOMERS GROUP BY CITY;

Q6. Largest order taken by each salesperson with order value more than Rs.3000.
SELECT SNUM, MAX(AMT) FROM ORDERS WHERE AMT> 3000 GROUP BY SNUM;

Q7. Select each customer smallest order.
SELECT CNUM, AMT FROM ORDERS ORDER BY AMT;