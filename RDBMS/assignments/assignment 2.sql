Q1- 1. Write a query that produces all rows from the Customers table for which the
salesperson’s number is 1001.
select * from customers where snum=1001;

Q2- 2. Write a select command that produces the rating followed by the name of each
customer in San Jose.
select rating,cname from customers where city="San Jose";

Q3- Write a query that will produce the snum values of all salespeople from the Orders
table (with the duplicate values suppressed).
select unique snum from orders;

Q4- Write a query that will give you all orders for more than Rs. 1,000.
SELECT * FROM orders WHERE amt>1000;

Q5- Write a query that will give you the names and cities of all salespeople in London with
a commission above 0.10.
SELECT * FROM salespeople WHERE city="London" AND comm>0.10;

Q6-  Write a query on the Customers table whose output will exclude all customers with a
rating <= 100, unless they are located in Rome
SELECT * FROM customers WHERE rating>100 OR city="Rome";


Q7- What will be the output from the following query?
Select * from Orders
where (amt < 1000 OR
NOT (odate = ‘1990-10-03’
AND cnum > 2003));


Q8- What will be the output of the following query?
Select * from Orders
where NOT ((odate = ‘1990-10-03’ OR snum >1006) AND amt >= 1500);


Q9- What is a simpler way to write this query?
Select snum, sname, city, comm from Salespeople Where (comm >= .12 or comm <= .14);
 SELECT * FROM Salespeople where comm BETWEEN 0.12 AND  0.14;


Q10- Write a query that selects all of the customers serviced by Peel or Motika.
(Hint:the snum field relates the two tables to one another).
select * from customers where snum in (select snum from salespeople where sname="Peel" OR sname="Motika");

Q11- Write a query that selects all orders except those with zeroes or NULLs in the amt
field.
select * from orders where amt != 0 OR amt <> NULL;