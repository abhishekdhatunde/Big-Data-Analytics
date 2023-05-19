-- use spj;
-- show tables; 
select * from j;
select * from p;
select * from s;
select * from sp;

-- Q1. Display the Supplier name and the Quantity sold.
-- select Sname, QTY from s
-- inner join sp on s.`S#`=sp.`S#`;

-- or

-- select Sname,QTY from s, sp
-- where s.`S#`=sp.`S#`;

-- Q2. Display the Part name and Quantity sold.
-- select distinct QTY, Pname from p, sp
-- where p.`P#`=sp.`P#`;

-- Q3 Display the Job name and Quantity sold.
-- select Jname, QTY from j
-- inner join sp on j.`J#`=sp.`J#`;

-- Q4- Display the Supplier name, Part name, Job name and Quantity sold.
-- select Sname,Pname,Jname,QTY from sp
-- inner join j on j.`J#`=sp.`j#`
-- inner join s on s.`S#`=sp.`S#`
-- inner join p on p.`P#`=sp.`P#`;

-- Q5- Display the Supplier name, Supplying Parts to a Job in the same City.
-- select distinct Sname,s.city from s 
-- inner join p on s.city=p.city
-- order by s.city;

-- Q6- Display the Part name that is ‘Red’ is color, and the Quantity sold.
-- select Pname,QTY from p,sp
-- where p.`p#`=sp.`P#` and p.color="Red"
-- order by sp.QTY desc;

-- or

-- select Pname,QTY from p
-- left join sp on p.`P#`=sp.`P#`
-- where p.color="Red"
-- order by sp.QTY desc;

-- Q7-  Display all the Quantity sold by Suppliers with the Status = 20.
-- select s.Sname,sp.QTY,s.status from s
-- inner join sp on sp.`S#`=s.`S#`
-- where s.status=20;

-- Q8- . Display all the Parts and Quantity with a Weight > 14.
-- select Pname,QTY from p
-- inner join sp on p.`P#`=sp.`P#`
-- where p.weight>14;

-- Q9- Display all the Job names and City, which has bought more than 500 Parts.
-- select j.Jname,j.city from j,sp
-- where sp.`J#`=j.`J#` and QTY>500;

-- Q10- Display all the Part names and Quantity sold that have a Weight less than 15.
-- select Pname,QTY from p
-- inner join sp on p.`P#`=sp.`P#`
-- where p.weight<15;

-- Q11-  Display all the Suppliers with the same Status as the supplier, ‘CLARK’.
-- select Sname from s 
-- where s.status = (select s.status from s where Sname="CLARK");


-- Q12- Display all the Parts which have more Weight than any Red parts.
-- select Pname,weight from p
-- where weight> (select max(weight) from p where color='Red');

-- SELECT MIN(p1.weight), p.pname, p1.color from p CROSS JOIN p p1 WHERE p.weight> p1.weight AND p1.color="Red" GROUP BY p.pname HAVING MIN(p1.weight);

-- Q13- Display all the Jobs going on in the same city as the job ‘TAPE’.
-- select Jname from j
-- where city= (select city from j where Jname='Tape');

-- Q14- Display all the Parts with Weight less than any the Green parts.
-- select Pname from p 
-- where weight < (select min(weight) from p where color='Green');

-- Q15-  Display the name of the Supplier who has sold the maximum Quantity (in onesale).
-- select Sname,QTY from s,sp
-- where s.`S#`=sp.`S#`
-- order by QTY desc
-- limit 1;

-- Q16- Display the name of the Supplier who has sold the maximum overall Quantity
-- (sumof Sales).
select Sname,sum(QTY) from s,sp where s.`S#`=sp.`S#` group by Sname order by sum(QTY) desc limit 1;


  