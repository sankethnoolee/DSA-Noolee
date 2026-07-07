# Write your MySQL query statement below

select p.firstName, p.lastName, a.state, a.city
from Person p
left outer join Address a
on p.personId= a.personId;