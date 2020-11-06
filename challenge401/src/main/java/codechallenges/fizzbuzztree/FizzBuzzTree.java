package codechallenges.fizzbuzztree;

public class FizzBuzzTree {
    public static Tree<String> fizzBuzzTree(Tree<Integer> inputTree) {
        Tree<String> outputTree = new Tree<String>();

        if (inputTree.getRoot() == null)
            return outputTree;

        outputTree.setRoot(fizzBuzzer(inputTree.getRoot()));
        return outputTree;
    }

    private static Node<String> fizzBuzzer(Node<Integer> current) {
        Node<String> newNode = new Node<>(fizzBuzzConverter(current.getValue()));
        for (Node<Integer> child : current.getChildren()) {
            newNode.addChild(fizzBuzzer(child));
        }
        return newNode;
    }

    private static String fizzBuzzConverter(int value) {
        if (value % 3 == 0 && value % 5 == 0) return "FizzBuzz";
        if (value % 3 == 0) return "Fizz";
        if (value % 5 == 0) return "Buzz";
        return Integer.toString(value);
    }
}
