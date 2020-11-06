# Challenge Summary
Fizzbuzz Tree

[Code](FizzBuzzTree.java) |
[Tests](../../../../../../challenge401/src/test/java/codechallengestest/FizzBuzzTreeTest.java)

## Challenge Description
Traverse a `k-ary tree`, 
- if divisible by 3 return "Fizz"
- divisible by 5 return "Buzz"
- divisible by both return "FizzBuzz"
- divisible by neither, Stringify

return a new Tree

## Approach & Efficiency
Breadth first traversal, checking each node, adding it to a new Queue.
Iterate through Q, return as a Tree.

## Solution
![whiteboardImg](../../../resources/FizzBuzzTree.jpg)    

### Checklist
 - [x] Top-level README “Table of Contents” is updated
 - [x] Feature tasks for this challenge are completed
 - [x] Unit tests written and passing
     - [x] “Happy Path” - Expected outcome
     - [x] Expected failure
     - [x] Edge Case (if applicable/obvious)
 - [x] README for this challenge is complete
     - [x] Summary, Description, Approach & Efficiency, Solution
     - [x] Link to code
     - [x] Picture of whiteboard