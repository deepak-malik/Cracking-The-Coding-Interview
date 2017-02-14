**Problem Statement :** You have a basketball hoop and someone says that you can play one of the 2 games.
**Game 1 :** You get one shot to make the hoop.
**Game 2 :** You get three shots and you have to make two out of them.
If _p_ is the probability of making a particular shot, for which values of _p_ you pick one game or other?

**Answer :** Let's calculate the probability of winning each game,

**Probability of winning game 1 :** 
We have to make 1 out of 1 shot i.e as per problem, probability will be _p_

**Probability of winning game 2 :** 
We have 3 balls and we have to make 2 shots, then probability of winning this will be, either we make 2 out of 3 shots, or all 3 shots. i.e 
- _p(winning) = p(2, 3) + p(3, 3)_

Now, let's check these step by step,
- Probability of making exactly 3 shots is, _p(3, 3) = p^3_
- Probability of making exactly 2 shots is, 
    - _p(2,3) = p(making 1 and 2 and missing 3) + p(making 1 and 3 and missing 2) + p(missing 1 and making 2 and 3)_

It can be calculated as,
_p(2, 3) = [p * p * (1 - p)] + [p * (1 - p) * p] + [(1 - p) * p * p] => 3(1 - p) p^2_

Add both making 3 shots, and making 2 shots, 
_3 (1 - p) p^2 + p^3 => 3 p^2 - 2p^3_

Now, which game to play? We should play game 1 if P(Game 1) > P(Game 2) i.e,
- _p > 3p^2 - 2p^3_
- _1 > 3p - 2P^2_
- _(2p - 1)(p - 1) > 0_

Both terms must be either positive or negative, but we know p < 1. so, both of them are negative, i.e
- 2p - 1 < 0
- 2p < 1
- p < .5

So, we should play **Game 1 if 0 < p < .5** or **Game 2 is .5 < p < 1**. Assuming, we can have value of p as 0, 0.5 or 1, then P (Game 1) = P (Game 2) and it does not matter which game we play.