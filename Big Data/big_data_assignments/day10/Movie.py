from pyhive import hive

# hive config
host_name = 'localhost'
port = 10000
user = ''
password = ''
db_name = 'dbda'

# get hive connection
conn = hive.Connection(host=host_name, port=port, username=user, password=password, database=db_name, auth='CUSTOM')

# name = input('Movie : ')
name = 'Snatch (2000)'
# get the cursor object
cur = conn.cursor()

# execute the sql query using cursor
sql = "SELECT id FROM movies_orc WHERE title = '" + name + "'"
cur.execute(sql)

movie_id = cur.fetchall()[0]
movie_id = str(movie_id)
conn.close()

cur = conn.cursor()
sql = """
    SELECT m.id FROM movie_orc m INNER JOIN movies_corr mc ON (mc.m1 = m.id OR mc.m2 = m.id) WHERE mc.cnt > 50 AND 
    (mc.m1 = 
    """
    '" + movie_id + "' OR mc.m2 = '" + movie_id + "') AND (m.id != '" + movie_id + "')
    AND mc.cor > 0.5 ORDER BY mc.cor DESC LIMIT 10"""
        
cur.execute(sql)
# collect/process result
result = cur.fetchall()
for row in result:
    print(row)

# close the connection
conn.close()