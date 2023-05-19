1. Write a query that lists each order number followed by the name of the customer who made the order.
select c.cname, o.onum, o.amt, o.odate from customers as c left join orders as o on c.cnum = o.cnum;

2. Write a query that gives the names of both the salesperson and the customer for each order along with the order number.
select c.cname, o.onum, s.sname, o.amt, o.odate from customers as c left join orders as o on c.cnum = o.cnum left join salespeople as s on o.snum = s.snum;

3. Write a query that produces all customers serviced by salespeople with a commission above 12%. Output the customer’s name, the salesperson’s name, and the salesperson’s rate of commission.
select c.cname, s.sname, s.comm from customers as c inner join salespeople as s on c.snum = s.snum where s.comm>0.12;

4. Write a query that calculates the amount of the salesperson’s commission on each order by a customer with a rating above 100.
select c.cname, o.amt, s.comm, (o.amt*s.comm) Amount from customers as c inner join orders as o on c.cnum = o.cnum inner join salespeople as s on o.snum = s.snum where c.rating>100;
or another way
select a.amt,a.cnum,b.rating,b.snum,c.sname,c.comm,a.amt*c.comm from orders a,customers b,salespeople c where a.cnum=b.cnum and b.snum=c.snum and b.rating>100;

5. Write a query that produces all pairs of salespeople who are living in the same city.Exclude combinations of salespeople with themselves as well as duplicate rows with the order reversed.
Select s.sname, s1.sname, s1.city from salespeople s, salespeople s1 where s.snum > s1.snum and s.city = s1.city;