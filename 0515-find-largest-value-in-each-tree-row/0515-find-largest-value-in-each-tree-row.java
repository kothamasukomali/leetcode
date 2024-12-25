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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        
        if(root==null){
            return ans;
        }
        
        Queue<TreeNode>n=new LinkedList<>();
        n.add(root);
        while(!n.isEmpty()){
            List<Integer>l=new ArrayList<>();
            int count=n.size();
            for(int i=0;i<count;i++){
                TreeNode cur=n.poll();
                l.add(cur.val);
                if(cur.left!=null){
                    n.add(cur.left);
                }
                if(cur.right!=null){
                    n.add(cur.right);
                }
                
            }
            
       Integer p=Collections.max(l);
          ans.add(p);
          
        }
        return ans;
    }
}