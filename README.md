<h1 align="center">Hi there, I'm <a href="" target="_blank">IvanZubenko</a> 
<img src="https://github.com/blackcater/blackcater/raw/main/images/Hi.gif" height="32"/></h1>
<h3 aligh="center">Final Project written in Java using Java {BackEnd} and DataBase {MySQL}.
Bank App Project [Backend] + [Database]
There is a prototype of the BackEnd Bank's Core Services data.
Data consist of clients, accounts, products, accounts, transactions and managers For currency, as well as for rounding, use the BigDecimal class.
</h3>
<img src="https://github.com/1Navigator8/BankApplication/blob/master/project%20diagram.jpg"
<!--  [![Typing SVG](https://readme-typing-svg.herokuapp.com?color=%2336BCF7&lines=*BankApp*+JAVA+BACKEND+DATABASE)](https://git.io/typing-svg) -->
<h1>Database structure</h1>
:white_check_mark:<h2>TABLE CLIENT ( Bank's Clients table )</h2> 


|COLUMN NAME |	TYPE |	DESCRIPTION |
--- | --- | ---
|id	| int |	id key of row - unique, not null, primary key|
manager_id	short	manager id
status	byte	client's status -124 bis 125
tax_code	varchar(20)	client's TAX code (external ID)
first_name	varchar(50)	client's name
last_name	varchar(50)	client's surname
email	varchar(60)	client's e-mail
address	varchar(80)	client's address
phone	varchar(20)	client's phone
created_at	timestamp	timestamp of row creation
updated_at	timestamp	timestamp of last update
