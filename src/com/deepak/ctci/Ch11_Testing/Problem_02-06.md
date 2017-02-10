## Problem 02 - Problem 06

**Problem 02 :**
You are given the source to an application which crashes when it runs. After running it 10 times in a debugger, you find it never crashes in the same place. The application is single threaded and uses only C standard library. What programming errors could be causing this crash? How would you test each one?

**Answer :** 
There could be some general cases which may result in such behavior, 
- Random Variable : The application may be using some random variable, like random number generator or a specific time of the day or a user input etc which may be causing this.
 - Uninitialized Variable : May be there is some uninitialized variable, which takes an arbitrary value each time and those values are causing such drastic behavior.
 - Memory Leak : The program may have run out of memory, maybe heap overflow or something.
 - External Dependencies : The program may depend on some other application which is causing this.
 - Other process on machine : Maybe there are some other processes, running on machine causing it.

We can approach this problem by elimination, like close all other applications in the system or use some runtime tools to dig deeper when the problem occurs.

**Problem 03 :**
We have the following method used in the chess game: boolean canMoveTo(int x, int y). This method is part of the Piece class and returns whether or not the piece can move to the point (x, y). Explain how you would test this method?

**Answer :**
There are 2 types of testing involved here, 
 - Testing Type 1 : Extreme Case Validation : We need to ensure program handles bad input gracefully, and that includes, 
	- Negative value of x and y
	- Test with x larger then the width
	- Test with y larger then the height
	- Test with completely full board
	- Test with an empty or nearly empty board
	- Test with more white pieces then black
	- Test with more black pieces then white
	
 - Testing Type 2 : General Testing : We can test each piece against every other piece.

**Problem 04 :**
How would you load test a web page without using any test tools?

**Answer :**
To perform load testing, we need to ensure what all information we need. This information can include, 
 - Response Time
 - Throughput
 - Incoming load in RPS
 - Resource Utilization

In case we don't have any test tools, we can write a multi-threaded java program in which each thread can act as a virtual user and try to load the web page. We can then monitor the response time and data received for each of the user. We can then collect the data from all the user's and compare them with the expected values.

**Problem 05 :**
How would you test a Pen?

**Answer :**
This is a very broad question. Let's make it clear what kind of item we have in hand. This will trigger some questions,
 - What type of pen is it? Is it a ball pen, a Ink pen or something else.
 - What is the age range of people who will be using the product.
 - What kind of work is expected from the pen, i.e writing articles or drawing etc.
 - Where will this pen be used on? Paper, cloth etc?
	
Based on all of these inputs, we can check them step by step, like If tip is working fine or is it comfortable to hold the pen. Is it able to write properly on the intended cloth or paper. How hard is that? Dropping from a certain height on floor should not break it.

**Problem 06 :**
How would you test an ATM in a distributed banking system?

**Answer :**
Let's make the assumptions clear.
 - Who will be using the ATM. General people of blind as well.
 - What all can be done using the ATM. Is it just cash withdrawal and balance enquiry? or advanced features are also there like transfer, cheque deposit etc.
 - Do we have access to just the ATM or the code as well?
	
Now when we know, what all we have, we can test it component by component i.e,
 - Logging in feature
 - Withdrawal
 - Deposit
 - Transfer
 - Logging out
 - Speech feature
 - Camera working fine