-- https://leetcode.com/problems/bank-account-summary-ii/

select Users.name, sum(Transactions.amount) as balance
from Users
         inner join Transactions
                    on Users.account = Transactions.account
group by users.name
having balance > 10000;