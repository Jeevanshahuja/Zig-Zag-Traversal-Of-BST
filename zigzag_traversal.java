class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int level=1;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> temp= new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                if(level%2==0){
                    temp.add(0,node.val);
                }
                else{
                    temp.add(node.val);
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            ans.add(temp);
            level++;;
        }
        return ans;
    }
}