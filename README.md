# Arbitrage
Currency Arbitrage Problem 
Arbitrage is the process of using discrepancies in currency exchange values to earn profit.
Consider a person who starts with some amount of currency X, goes through a series of exchanges and finally ends up with more amount of X(than he initially had).
Given n currencies and a table (nxn) of exchange rates, devise an algorithm that a person should use to avail maximum profit assuming that he doesn't perform one exchange more than once.
<a href="https://stackoverflow.com/questions/2282427/interesting-problem-currency-arbitrage" >From Here</a>
Algorithm:
We can use BellMan-Ford algorithm to solve this problem <a href="https://courses.csail.mit.edu/6.046/spring04/handouts/ps7sol.pdf" >From Here</a> problem 7.1
To run you need JDK and JRE installed and then you can run it by javac main.java and java main in ubuntu terminal 
Or you can open it with some graphical applications like NetBeans or Eclipse.
You need to make an adjancency matrix in a txt file and copy filepath into main method (Example is available in project)
