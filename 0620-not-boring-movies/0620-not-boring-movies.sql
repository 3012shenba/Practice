# Write your MySQL query statement below
SELECT * FROM Cinema
WHERE not id%2=0 and not description="boring"
ORDER BY rating DESC;