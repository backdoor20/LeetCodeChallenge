/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> qu=new LinkedList<>();
        List<Double> list=new ArrayList<>();
        if(root==null)
            return list;
        qu.offer(root);
        while(!qu.isEmpty()){
            double sum=0;
            int count=0;
            int size=qu.size();
            while(size>0){
                TreeNode t=qu.poll();
                if(t.left!=null)
                    qu.offer(t.left);
                if(t.right!=null)
                    qu.offer(t.right);
                count++;
                sum+=t.val;
                size--;
            }
            list.add((sum/count));
        }
        return list;
    }
}