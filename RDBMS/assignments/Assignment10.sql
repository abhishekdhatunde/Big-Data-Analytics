## ASSIGNMENT10
-- use sales_db;
select * from customers;
select * from orders;
select * from salespeople;


#1. Write a query that uses a subquery to obtain all orders for the customer named Cisneros. Assume you do not know his customer number (cnum).
-- select * from orders where cnum=(select cnum from customers where cname="Cisneros");

#2. Write a query that produces the names and ratings of all customers who have above-average orders.
-- select cname,rating from customers where cnum = any (select cnum from orders where amt> (select avg(amt) from orders));

#3. Write a query that selects the total amount in orders for each salesperson for whom this total is greater than the amount of the largest order in the table.
-- select snum, sum(amt) from orders group by snum having sum(amt)>(select max(amt) from orders);

#4. Write a query that selects all customers whose ratings are equal to or greater than ANY of Serres’.
-- select * from customers where rating= any (select rating from customers where snum=(select snum from salespeople where sname="serres"));

#5. Write a query using ANY or ALL that will find all salespeople who have no customers located in their city.
-- select * from salespeople as s where city != all (select distinct city from customers as c where c.snum = s.snum);

#6. Write a query that selects all orders for amounts greater than any for the customers in London.
 -- select * from orders where amt > any ( select amt from orders where cnum in (select cnum from customers where city="london"));

#7. Extract all the orders of Motika.
-- select * from orders where snum=(select snum from salespeople where sname="motika");

#8. Find all the order attribute to salespeople servicing customers in London.
-- select * from orders where snum in (select snum from customers where city="london");

#9. Find names and numbers of all salesperson who have more than one customer.
-- select snum, sname from salespeople where snum in ( select snum from customers group by snum having count(cnum)>1);

#10. Find salespeople number,name and city who have multiple customers.
-- select snum, sname, city from salespeople where snum in ( select snum from customers group by snum having count(cnum)>1);

#11. Select customers who have a greater rating than any other customer in Rome.
-- select * from customers where rating > any (select rating from customers where city="rome");

#12. Select all orders that had amounts that were greater that atleast one of the orders from ‘1990-10-04’ .
-- select * from orders where amt > any ( select amt from orders where odate="1990-10-04");

#13. Find all orders with amounts smaller than any amount for a customer in San Jose.
-- select * from orders where amt < any ( select amt from orders where cnum in ( select cnum from customers where city="san jose"));

#14. Select those customers whose rating are higher than every customer in Paris.
-- select * from customers where rating > all ( select rating from customers where city="paris");