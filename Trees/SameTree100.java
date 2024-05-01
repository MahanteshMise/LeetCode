import java.util.*;
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
       /*
       Recursive method
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    } */
        // Iterative method

        Queue<TreeNode> Qp = new LinkedList<>();
        Queue<TreeNode> Qq = new LinkedList<>();

        Qp.offer(p);
        Qq.offer(q);

        while(!Qp.isEmpty() && !Qq.isEmpty()){
            TreeNode node1 = Qp.poll();
            TreeNode node2 = Qq.poll();
            if(node1 == null && node2 == null){
                continue;
            }
            else if(node1 == null || node2 == null || node1.val!= node2.val){
                return false;
            }
            // Push the left children onto the stacks.
            Qp.offer(node1.left);
            Qq.offer(node2.left);
            // Push the right children onto the stacks.
            Qp.offer(node1.right);
            Qq.offer(node2.right);
        }
        // If no mismatches have been found and both the stacks are empty, return true;
        return Qp.isEmpty() && Qq.isEmpty();
    }
}