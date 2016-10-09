## Introduction to Bit Manipulation

The direct manipulation of bits or often called as **Bit twiddling** is often necessary while building softwares.

**Bitwise Operators**
- Individual and blocks of bits in _integer_ and _byte_ variables can be modified with bitwise operators, which are, 

<img width="361" alt="screen shot 2016-10-08 at 5 28 24 pm" src="https://cloud.githubusercontent.com/assets/3439029/19216713/aee07c52-8d7c-11e6-8e7a-7af27705be7a.png">

**Bitwise AND**
This is represented as single ampersand, **&** and marks a resulting bit as _1_ when both the bits are _1_. Think about it as _THIS_ **AND** _THIS_ has to be 1 i.e both has to be true. Here is a sample, 
```
01001000 & 
10111000 = 
--------
00001000
```

**Bitwise OR**
This is represented as single pipe symbol, **|** and marks a resulting bit as _1_ when either of the bits is _1_. Think about it as _THIS_ **OR** _THIS_ has to be 1 i.e one of them has to be true. Here is a sample, 
```
01001000 | 
10111000 = 
--------
11111000
```

**Bitwise Exclusive OR (XOR)**
This is represented as, **^** and marks a resulting bit as _1_ when either of the bits is _1_ but NOT if both are. XOR of 2 same bits is 0. Here is a sample, 
```
01110010 ^
10101010 
--------
11011000
```
Suppose, we have some bit, either 1 or 0, that we'll call Z. When we take Z XOR 0, then we always get Z back: if Z is 1, we get 1, and if Z is 0, we get 0. On the other hand, when we take Z XOR 1, we flip Z. If Z is 0, we get 1; if Z is 1, we get 0:

**myBits ^ 0** : No change
**myBits ^ 1** : Flip 
It's a kind of selective twiddle(~)..
So, if we do XOR against 111...1111, all the bits of myBits flipped. It's equivalent of doing twiddle(~)..

Another interesting trick using the XOR: It does in place swap of integers.
If we apply the XOR operation twice -- say we have a bit, A, and another bit B, and we set C equal to A XOR B, and then take C XOR B: we get A XOR B XOR B, which essentially either flips every bit of A twice, or never flips the bit, so we just get back A. (We can also think of B XOR B as cancelling out.) 
