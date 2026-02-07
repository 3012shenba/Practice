SELECT email as Email FROM Person
group by email
having count(email)>=2;
