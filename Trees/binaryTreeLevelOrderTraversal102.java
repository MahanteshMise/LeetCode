class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> tempVal = new ArrayList<>();
        if(root == null){
            return tempVal;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            List<Integer> subArray = new ArrayList<>();
            int size = que.size();
            for(int i=0 ; i<size;i++){
                TreeNode treeVal = que.poll();
                subArray.add(treeVal.val);
                if(treeVal.left != null) que.add(treeVal.left);
                if(treeVal.right != null) que.add(treeVal.right);
            }
            tempVal.add(subArray);
        }
        return tempVal;
    }
}