
SELECT p.FirstName as FirstName,  p.LastName AS LastName, A.City as City, A.State as State FROM Person AS p left join Address A on p.PersonId = A.PersonId