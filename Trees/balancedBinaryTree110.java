class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null ){
            return true;
        }
        return checkDepth(root) != -1;
    }

    public int checkDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftD = checkDepth(root.left);
        int rightD = checkDepth(root.right);
        // left,right subtree is unbalanced or cur tree is unbalanced
        if(leftD == -1 || rightD == -1|| Math.abs(leftD - rightD) > 1) return -1;
        return 1+ Math.max(leftD,rightD);
    }
}