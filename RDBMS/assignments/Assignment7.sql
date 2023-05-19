1. Display the Supplier name and the Quantity sold.
select s.sname, SUM(sp.qty) from s inner join sp on s.`s#` = sp.`s#` GROUP BY SNAME;

2. Display the Part name and Quantity sold.
select p.pname, SUM(sp.qty) from p inner join sp on p.`p#` = sp.`p#` GROUP BY PNAME;

3. Display the Job name and Quantity sold.
select j.jname, SUM(sp.qty) from j inner join sp on j.`j#` = sp.`j#` GROUP BY JNAME;

4. Display the Supplier name, Part name, Job name and Quantity sold.
select s.sname, j.jname, p.pname, sp.qty from sp inner join s on s.`s#` = sp.`s#` inner join p on p.`p#` = sp.`p#` inner join j on j.`j#` = sp.`j#`;

5. Display the Supplier name, Supplying Parts to a Job in the same City.
select distinct s.sname, p.city from s left join p on s.city = p.city where p.city=s.city;

6. Display the Part name that is ‘Red’ is color, and the Quantity sold.
 select p.pname, sp.qty from p inner join sp on p.`p#` = sp.`p#` where color='RED';

7. Display all the Quantity sold by Suppliers with the Status = 20.
select s.sname, sp.qty from s inner join sp on s.`s#` = sp.`s#` WHERE S.STATUS=20;

8. Display all the Parts and Quantity with a Weight > 14.
select p.pname, sp.qty from p inner join sp on p.`p#` = sp.`p#` where WEIGHT>14;

9. Display all the Job names and City, which has bought more than 500 Parts.
select j.jname, J.CITY from j inner join sp on j.`j#` = sp.`j#`WHERE SP.QTY>500 ;

10. Display all the Part names and Quantity sold that have a Weight less than 15.
select p.pname, sp.qty from p inner join sp on p.`p#` = sp.`p#` where WEIGHT<15;

11. Display all the Suppliers with the same Status as the supplier, ‘CLARK’.
SELECT SNAME FROM S WHERE STATUS=(SELECT STATUS FROM S WHERE SNAME='CLARK');

12. Display all the Parts which have more Weight than any Red parts.
select Pname, weight from p where weight> (select min(weight) from p where color='Red') and color!="red";

13. Display all the Jobs going on in the same city as the job ‘TAPE’.
 SELECT JNAME FROM J WHERE CITY=(SELECT CITY FROM J WHERE JNAME='TAPE');

14. Display all the Parts with Weight less than any the Green parts.
SELECT PNAME FROM P WHERE WEIGHT<(SELECT WEIGHT FROM P WHERE COLOR="GREEN");

15. Display the name of the Supplier who has sold the maximum Quantity (in onesale).
SELECT S.SNAME FROM S INNER JOIN SP ON S.`S#` = SP.`S#` WHERE QTY=(SELECT MAX(QTY) FROM SP);

16. Display the name of the Supplier who has sold the maximum overall Quantity (sumof Sales).
select S.Sname,sum(SP.QTY) from s INNER JOIN sp ON S.`S#`=SP.`S#` where s.`S#`=sp.`S#` group by Sname order by sum(QTY) desc limit 1;
