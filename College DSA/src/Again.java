public class Again{
    // TreeNode
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            left = right = null;
        }
    }

    // inorder tree traversal
    static void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // preorder tree traversal
    static void preorder(TreeNode root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // postorder tree traversal
    static void postorder(TreeNode root){
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // find the height / maximum depth of the binary tree
    static int height(TreeNode root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // find the number of nodes in a binary tree
    static int countNodes(TreeNode root){
        if(root == null) return 0;
        int leftKaAns = countNodes(root.left);
        int rightKaAns = countNodes(root.right);
        return leftKaAns + rightKaAns + 1;
    }

    // check whether the given value k of the node is present in the binary tree or not ?
    static boolean search(TreeNode root, int k){
        if(root == null) return false;
        if(root.data == k) return true;

        boolean leftKaAns = search(root.left, k);
        boolean rightKaAns = search(root.right, k);

        return leftKaAns || rightKaAns;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Tree Traversals
        System.out.print("Inorder = ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder = ");
        postorder(root);
        System.out.println();

        System.out.print("Preorder = ");
        postorder(root);
        System.out.println();

        System.out.println("Height of binary tree = " + height(root));

        System.out.println("Number of nodes = " + countNodes(root));


        System.out.println("Is 3 present in the tree = " + search(root, 3));
    }
}
