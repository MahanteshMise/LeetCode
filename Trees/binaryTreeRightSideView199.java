class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root,result,0);
        return result;
    }
    public void rightView(TreeNode curr, List<Integer> result, int CurrD){
        if(curr == null){
            return;
        }
        if(CurrD == result.size()){
            result.add(curr.val);
        }
        rightView(curr.right,result,CurrD+1);
        rightView(curr.left, result, CurrD+1);
    }
}