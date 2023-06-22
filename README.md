<h1 align="center">Hi there, I'm <a href="" target="_blank">IvanZubenko</a> 
<img src="https://github.com/blackcater/blackcater/raw/main/images/Hi.gif" height="32"/></h1>
<h3 aligh="center">Bank App Project written in Java[Backend] + DataBase [MySQL]
There is a prototype of the BackEnd Bank's Core Services data.
Data consist of clients, accounts, products, accounts, transactions and managers For currency, as well as for rounding, use the BigDecimal class.
</h3>
<img src="https://github.com/1Navigator8/BankApplication/blob/master/project%20diagram.jpg"
 [![Typing SVG](https://readme-typing-svg.herokuapp.com?color=%2336BCF7&lines=*BankApp*+JAVA+BACKEND+DATABASE)](https://git.io/typing-svg)
<h1>Database structure</h1>
:white_check_mark:

## TABLE MANAGER (Bank's managers) 

|COLUMN NAME |	TYPE |	DESCRIPTION |
--- | --- | ---
|id|	short|	id key of row - unique, not null, primary key
|first_name|	varchar(50)|	manager's name
|last_name|	varchar(50)|	manager's surname
|status|	byte|	manager's status -124 bis 125
|description|	varchar(255)|	description of transaction
|created_at|	timestamp|	timestamp of row creation

## TABLE CLIENT (Bank's Clients table) 

|COLUMN NAME |	TYPE |	DESCRIPTION |
--- | --- | ---
|id	| int |	id key of row - unique, not null, primary key|
|manager_id |	short |	manager id |
|status|	byte|	client's status -124 bis 125
|tax_code|	varchar(20)|	client's TAX code (external ID)
|first_name|	varchar(50)|	client's name
|last_name|	varchar(50)|	client's surname
|email|	varchar(60)|	client's e-mail
|address|	varchar(80)|	client's address
|phone|	varchar(20)|	client's phone
|created_at|	timestamp|	timestamp of row creation
|updated_at|	timestamp|	timestamp of last update


## TABLE ACCOUNT (Bank's accounts table)
|COLUMN NAME |	TYPE |	DESCRIPTION |
--- | --- | ---
|id|	int|	id key of row - unique, not null, primary key
|client_tax_code|	varchar(20)|	client's TAX code
|account_name|	varchar(100)|	a name of account
|type	|byte|	account type -124 bis 125
|status|	byte|	status of tne account -124 bis 125
|balance|	numeric(15,2)|	balance of the account in currency.
|currency_code|	short|	account currency code
|created_at|	timestamp|	timestamp of row creation
|updated_at|	timestamp|	timestamp of last update

## TABLE PRODUCT (Sets of Bank's available Products) 


|COLUMN NAME |	TYPE |	DESCRIPTION |
:--- | :--- | :---
|id	|int|	id key of row - unique, not null, primary key
|manager_id|	short|	manager id
|product_name|	varchar(70)|	product's name
|status|	byte|	product's status
|currency_code|	schort|	currency of product
|interest_rate|	numeric(6,4)|	interest rate of product
|limit_credit|	numeric(15,2)|	limit of credit a product ( 0 - no limit, 0 < - limit which can be used)
|created_at|	timestamp|	timestamp of row creation
|updated_at|	timestamp|	timestamp of last update


## TABLE AGREEMENT (Bank's - Client's Agreement table) 

|COLUMN NAME |	TYPE |	DESCRIPTION |
--- | --- | ---
|id|	int|	id key of row - unique, not null, primary key
|account_id|	int|	client's account
|product_id|	int|	product id (table product)
|interest_rate|	numeric(6,4)|	current interest rate of agreement
|status|	byte|	agreement's status -124 bis 125
|sum|	numeric(15,2)|	amount of agreement
|created_at|	timestamp|	timestamp of row creation
|updated_at|	timestamp|	timestamp of last update


## TABLE TRANSACTION (Bank's Product table) 

|COLUMN NAME |	TYPE |	DESCRIPTION |
--- | --- | ---
|id|	int|	id key of row - unique, not null, primary key
|debit_account_id|	int|	transaction's debit account
|credit_account_id|	int|	transaction's credit account
|type|	byte|	transaction type -124 bis 125
|amount|	numeric(15,2)|	transaction amount in the account currency
|description|	varchar(255)|	description of transaction
|created_at|	timestamp|	timestamp of row creation


