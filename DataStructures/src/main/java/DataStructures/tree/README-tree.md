# Trees
This file implements a Binary Tree, and Binary Search Tree with functions for traversal and
finding a value.

## Challenge
Create and implement a Binary search tree that has the ability to add values, perform
pre-order, in-order, and post-order traversals, and returns a boolean value true or false if 
a key value is found in the tree.

## Approach & Efficiency
Time: O(n)
Space: O(n)

## API
`createTree` - instantiates a tree with pre-set values
`add` - adds a value to the tree
`inOrder` - performs an in order traversal & returns an Array List of integers
`perOrder` - performs a pre order traversal & returns an Array List of integers
`postOrder` - performs a post order traversal & returns an Array List of integers

## Operation
- program is operated in App.java
- instantiate a tree and add value or use default values with `createTree`
- Tests include: 
1. `emptyTree`
2. `singleRootNode`
3. `leftRightChild`
4. `postOrderTraversal`
5. `inOrderTraversal`
6. `preOrderTraversal`
