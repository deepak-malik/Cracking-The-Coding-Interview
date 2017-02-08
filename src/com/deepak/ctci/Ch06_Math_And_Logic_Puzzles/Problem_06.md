**Problem Statement :** 
A bunch of people are living on a island. When a visitor comes with a strange order,  all blue eyed people must leave the island as soon as possible. There will be a flight out at 8:00 PM every evening. Each person can see everyone else's eye color, but they do not know there own (nor is anyone allowed to tell them). Additionally they do not know how many people have blue eyes, although they do know that at least one person does.   
How many days it will take the blue eyed people to leave?

**Answer :**
Let's assume there are 100 people on the island.

**Case 1 :** 
When only one person has blue eyes. He will check other 99 and all will have normal eyes.
Since there has to be at least one person with blue eyes. He will know, he is the one with blue. 
So, he will leave the 1st day.

**Case 2 :**
When two persons have blue eyes. Each one of them will check others and the two with blue eyes
will see each other and will think, this is the guy with blue eyes and should leave. Both blue
eyes persons will think the same way and none of them will leave. Next day, they both will see 
each other and then will think, they also have blue eyes because 98 out of 100 doesn't have.
Both will leave on the second day.

**Case N :**
When N people will have blue eyes. Each one of them will keep checking others and expecting them
to leave until Nth day. Then all of them will leave together on Nth day.