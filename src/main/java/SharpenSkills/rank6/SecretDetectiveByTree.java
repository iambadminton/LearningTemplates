package SharpenSkills.rank6;

import java.util.*;

/**
 * Task:
 * There is a secret string which is unknown to you. Given a collection of random triplets from the string, recover the
 * original string.
 * A triplet here is defined as a sequence of three letters such that each letter occurs somewhere before the next in the
 * given string. "whi" is a triplet for the string "whatisup".
 * As a simplification, you may assume that no letter occurs more than once in the secret string.
 * You can assume nothing about the triplets given to you other than that they are valid triplets and that they contain
 * sufficient information to deduce the original string. In particular, this means that the secret string will never
 * contain letters that do not occur in one of the triplets given to you.
 */

public class SecretDetectiveByTree {

    public String recoverSecret(char[][] triplets) {
        StringBuilder res = new StringBuilder("");
        Tree tree = new Tree();
        for (int i = 0; i < triplets.length; i++) {
            for (int j = 0; j < triplets[i].length; j++) {
                System.out.println("Вставляем " + triplets[i][j]);
                tree.insert(triplets[i][j]);
            }

            tree.displayTree();
        }
        //return res.toString();
        return new String("YES");
    }

    class Node {
        public char Letter;
        public Node leftChild;
        public Node rightChild;
    }


    class Tree {
        private Node root;

        /*public Tree(Node root) {
            this.root = null;
        }*/
        public Tree() {
            root = null;
        }

        public void insert(char c) {
            Node newNode = new Node();
            newNode.Letter = c;

            if (root == null) {
                root = newNode;
            } else {
                Node current = root;
                Node parent;
                while (true) {
                    parent = current;
                    if (c == current.Letter) {
                        // не будем вставлять повторяющиеся ноды
                        return;
                    }
                    if (c < current.Letter) {
                        // идем налево
                        current = current.leftChild;
                        if (current == null) {
                            parent.leftChild = newNode;
                            return;
                        }
                    } else {
                        // идем направо
                        current = current.rightChild;
                        if (current == null) {
                            parent.rightChild = newNode;
                            return;
                        }
                    }
                }
            }

        }

        public void displayTree() {
            Stack globalStack = new Stack();
            globalStack.push(root);
            int nBlanks = 32;
            boolean isRowEmpty = false;
            System.out.println(
                    "......................................................");
            while (isRowEmpty == false) {
                Stack localStack = new Stack();
                isRowEmpty = true;

                for (int j = 0; j < nBlanks; j++)
                    System.out.print(' ');

                while (globalStack.isEmpty() == false) {
                    Node temp = (Node) globalStack.pop();
                    if (temp != null) {
                        System.out.print(temp.Letter);
                        localStack.push(temp.leftChild);
                        localStack.push(temp.rightChild);

                        if (temp.leftChild != null ||
                                temp.rightChild != null)
                            isRowEmpty = false;
                    } else {
                        System.out.print("--");
                        localStack.push(null);
                        localStack.push(null);
                    }
                    for (int j = 0; j < nBlanks * 2 - 2; j++)
                        System.out.print(' ');
                }  // end while globalStack not empty
                System.out.println();
                nBlanks /= 2;
                while (localStack.isEmpty() == false)
                    globalStack.push(localStack.pop());
            }  // end while isRowEmpty is false
            System.out.println(
                    "......................................................");
        }  // end displayTree()

    }


    public static void main(String[] args) {
        SecretDetectiveByTree detective = new SecretDetectiveByTree();
        String result;
        char[][] triplets = {
                {'t', 'u', 'p'},
                {'w', 'h', 'i'},
                {'t', 's', 'u'},
                {'a', 't', 's'},
                {'h', 'a', 'p'},
                {'t', 'i', 's'},
                {'w', 'h', 's'}
        };

        result = detective.recoverSecret(triplets);
        System.out.println(result);


    }


}