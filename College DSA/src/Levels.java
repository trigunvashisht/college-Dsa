public class Levels {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            left = right = null;
        }
    }

    // w.a.p to print the nodes at level k ?
    static void printLevel(TreeNode root, int k){
        if(root == null) return;
        if(k == 1){
            System.out.print(root.data + " ");
        }
        else{
            printLevel(root.left, k - 1);
            printLevel(root.right, k - 1);
        }
    }

    // w.a.p to find the maximum value of a node in a binary tree ?
    static int findMax(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    // w.a.p to count the total number of leaf nodes in a binary tree ?
    static int countLeafs(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int leftLeafs = countLeafs(root.left);
        int rightLeafs = countLeafs(root.right);
        return leftLeafs + rightLeafs;
    }

    // w.a.p to count the non leaf nodes in a binary tree ?
    static int countNonLeafs(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;

        int leftKaAns = countNonLeafs(root.left);
        int rightKaAns = countNonLeafs(root.right);

        return leftKaAns + rightKaAns + 1;
    }


    // w.a.p to count the total number of nodes in a binary tree ?
    static int countNodes(TreeNode root){
        if(root == null) return 0;
        int leftKaAns = countNodes(root.left);
        int rightKaAns = countNodes(root.right);

        return leftKaAns + rightKaAns + 1;
    }


    // Task
    // find the total sum of all the node values in a tree
    static int totalSum(TreeNode root){
        if(root == null) return 0;
        return root.data + totalSum(root.left) + totalSum(root.right);
    }


    // traverse a binary tree with postorder (left -> right -> root)
    static void postorder(TreeNode root){
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }


    // insert a new node in the first available position (level-order insertion)

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);

        // printing nodes at level 3
        System.out.println("Nodes at level 3");
        printLevel(root, 3);
        System.out.println();

        // printing the maximum value of a node in a binary tree
        System.out.println("Maximum Node = " + findMax(root));

        // count the number of leaf nodes in a binary tree
        System.out.println("Number of leaf nodes = " + countLeafs(root));

        // count the number of non leaf nodes in a binary tree
        System.out.println("Number of non leaf nodes = " + countNonLeafs(root));

        // count the total number of nodes
        System.out.println("Total number of nodes = " + countNodes(root));

        // find the total sum of node values in a tree
        System.out.println("Total Sum = " + totalSum(root));


        // postorder traversal of binary tree
        System.out.print("Postorder = ");
        postorder(root);
    }
}
