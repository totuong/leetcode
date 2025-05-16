# 181. Employees Earning More Than Their Managers
# Write your MySQL query statement below
 e.name AS Employee
FROM employee e
         JOIN employee em ON e.managerId = em.id
WHERE e.salary > em.salary;
