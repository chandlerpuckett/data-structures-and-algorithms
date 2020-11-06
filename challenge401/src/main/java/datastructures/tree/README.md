# Trees
This file implements a Binary Tree, and Binary Search Tree with functions for traversal and
finding a value

[Code](BinaryTree.java) |
[Tests](../../../../../../challenge401/src/test/java/datastructures/BinaryTreeTest.java)

## Challenge
Create and implement a Binary search tree that has the ability to add values, perform
pre-order, in-order, and post-order traversals, and returns a boolean value true or false if 
a key value is found in the tree.

## Approach & Efficiency
Time: O(n) <br>
Space: O(n)

## API
`createTree` - instantiates a tree with pre-set values
`add` - adds a value to the tree
`inOrder` - performs an in order traversal & returns an Array List of integers
`perOrder` - performs a pre order traversal & returns an Array List of integers
`postOrder` - performs a post order traversal & returns an Array List of integers

## Operation
- program is operated in App.java or by instantiating a `BinaryTree` object
- instantiate a tree and add value or use default values with `createTree`
- Tests include: 
1. `emptyTree`
2. `singleRootNode`
3. `leftRightChild`
4. `postOrderTraversal`
5. `inOrderTraversal`
6. `preOrderTraversal`

### Challenges
[Challenge 16 : Max Value in Binary Tree Whiteboard](../../../../../../challenge401/src/main/resources/READMEs/README-findMax.md)<br>
[Challenge 17 : Breadth First Traversal Whiteboard](../../../../../../challenge401/src/main/resources/READMEs/README-breadthFirst.md)<br>
[Challenge 18 : FizzBuzz Tree Whiteboard](../../../../../../challenge401/src/main/java/codechallenges/fizzbuzztree)

### Checklist 
- [x] Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
- [x] Create a BinaryTree class
- [x] Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
- [x] Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.

- [x] Create a BinarySearchTree class
- [x] Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
- [x] Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

**Tests** 
- [x] Can successfully instantiate an empty tree
- [x] Can successfully instantiate a tree with a single root node
- [x] Can successfully add a left child and right child to a single root node
- [x] Can successfully return a collection from a preorder traversal
- [x] Can successfully return a collection from an inorder traversal
- [x] Can successfully return a collection from a postorder traversal

