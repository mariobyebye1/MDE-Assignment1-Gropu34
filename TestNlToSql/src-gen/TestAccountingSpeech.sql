CREATE TABLE Accounts(
    AccountID INT,
    Premium INT,
    TransactionDate DATE,
);
CREATE TABLE Broker(
    BrokerID INT,
    BrokerName VARCHAR(255),
    Comission VARCHAR(255),
);
DROP TABLE Accounts,Broker
;

DELETE FROM Accounts
;

DELETE FROM Accounts
WHERE AccountID = 12 and Premium <= 120
;

UPDATE Accounts
SET AccountID = 12, TransactionDate = "12/13/2002"
WHERE Premium > 1200
;

INSERT INTO Accounts (AccountID, Premium)
VALUES (13, 3000)
;

SELECT AccountID, BrokerName
FROM Accounts, Broker
WHERE BrokerName = "James" and AccountID = 13
;

SELECT *
FROM Accounts, Broker
;
