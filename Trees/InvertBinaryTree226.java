public class binaryTreeReversal226 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTreeInversion {

        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            // Recursively invert left and right subtrees
            invertTree(root.left);
            invertTree(root.right);
            // Swap left and right subtrees
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            return root;
        }
        // Using Iterative method.
        /*public TreeNode invertTree(TreeNode root) {
            if(root == null){
                return null;
            }
            LinkedList<TreeNode> tempQ = new LinkedList<>();
            tempQ.add(root);

            while(!tempQ.isEmpty()){
                TreeNode tempVal = tempQ.poll();
                if(tempVal.left != null){
                    tempQ.add(tempVal.left);
                }
                if(tempVal.right != null){
                    tempQ.add(tempVal.right);
                }
                //Swapping the values of left and right tree.
                TreeNode swapNode = tempVal.left;
                tempVal.left = tempVal.right;
                tempVal.right = swapNode;
            }
            return root;
        }*/

        public void printTreeInorder(TreeNode root) {
            if (root != null) {
                printTreeInorder(root.left);
                System.out.print(root.val + " ");
                printTreeInorder(root.right);
            }
        }

        public static void main(String[] args) {
            BinaryTreeInversion solution = new BinaryTreeInversion();

            // Construct a binary tree
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);

            // Print the original tree (Inorder traversal)
            System.out.println("Original tree (Inorder traversal):");
            solution.printTreeInorder(root);
            System.out.println();

            // Invert the binary tree
            solution.invertTree(root);

            // Print the inverted tree (Inorder traversal)
            System.out.println("Inverted tree (Inorder traversal):");
            solution.printTreeInorder(root);
        }
    }
}

