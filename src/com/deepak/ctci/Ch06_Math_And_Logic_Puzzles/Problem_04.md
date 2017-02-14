**Problem Statement :** There are three ants on different vertices of a triangle. What is the probability of collision (between any two or all of them) if they start walking on the sides of triangle? Assume that each ant randomly picks the direction, with either direction being equally likely to be chosen, and that they walk at same speed.
Similarly, find the probability of collision  with n ants on an n-vertex polygon.

**Answer :** The ants will collide only if they are moving in the same direction, i.e either clockwise or anti-clockwise. Since, we have 3 ants and 2 directions to be chosen,
- p (clockwise) = (1/2) ^ 3
- p (anti-clockwise) = (1/2) ^ 3
- p (same direction) = (1/2) ^ 3 + (1/2) ^ 3 => 1/4

Now, probability of collision will be,
p (collision) = 1 - p (same direction) => 1 - 1/4 => 3/4 

Generalizing this case further for **n ants and n-vertex polygon**,
- p (clockwise) = (1/2) ^ n
- p (anti-clockwise) = (1/2) ^ n
- p (same direction) = 2 * (1/2) ^ n => (1/2) ^ n-1

Now, probability of collision will be,
p (collision) = 1 - p (same direction) => 1 - (1/2) ^ n-1