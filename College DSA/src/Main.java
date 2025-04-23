// Introduction to Trees

public class Main{
    // TreeNode class
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int value){
            this.data = value;
            left = right = null;
        }
    }

    // Problem 1.
    // print the inorder traversal of the binary tree ?
    static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Problem 2.
    // print the preorder traversal of the binary tree ?
    static void preorder(TreeNode root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Problem 3.
    // print the postorder traversal of the binary tree ?
    static void postorder(TreeNode root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Problem 4.
    // find the height / maximum depth of the binary tree ?
    static int height(TreeNode root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Problem 5.
    // calculate the total number of nodes in a binary tree ?
    static int numberOfNodes(TreeNode root){
        if(root == null) return 0;
        return 1 + numberOfNodes(root.left) + numberOfNodes(root.right);
    }

    // Problem 6.
    // Search Node in a tree
    // check if the given value k of the Node exists in the tree or not ?
    static boolean search(TreeNode root, int k){
        if(root == null) return false;
        if(root.data == k) return true;

        return search(root.left, k) || search(root.right, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Print / Traversal (Tree)
        // inorder
        System.out.print("Inorder Traversal = ");
        inorder(root);

        System.out.println();

        // postorder
        System.out.print("Postorder Traversal = ");
        postorder(root);

        System.out.println();

        // preorder
        System.out.print("Preorder Traversal = ");
        preorder(root);

        System.out.println();

        // Height of tree
        System.out.println("Height of tree = " + height(root));

        // Count the number of nodes
        System.out.println("Total Number of nodes = " + numberOfNodes(root));

        // Search Node in a Tree
        System.out.println("Is 3 in tree: " + search(root, 3));
        System.out.println("Is 11 in tree: " + search(root, 11));
    }
}