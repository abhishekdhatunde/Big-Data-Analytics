select title, 
    count(title) 
        from casting
            inner join movie 
                on movieid=movie.id
where yr=1978 
group by title 
order by count(title), title

select title
    from casting
        inner join movie 
            on movieid=movie.id
        inner join actor
            on actorid=actor.id
where yr=1978 
group by title
order by count(actorid), title

select name from casting 
    inner join movie on movieid=movie.id 
    inner join actor on actorid=actor.id
where movieid in 
all (select movieid from casting 
    inner join actor on actorid=actor.id
where name ='Art Garfunkel')