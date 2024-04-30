class Solution {
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dofBinTree(root);
        return maxDiameter;
    }
    public int dofBinTree(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftD = dofBinTree(root.left);
        int rightD = dofBinTree(root.right);
        maxDiameter = Math.max(maxDiameter, leftD+rightD);
        return 1 + Math.max(leftD,rightD);
    }
}