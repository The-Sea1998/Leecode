package baidu;

public class Tree {
   int maxdepth=0;
    public static int treeMaxDepth(TreeNode root){
        return traverse(root);
    }
    public static int traverse(TreeNode root){
        if(root==null) return 0;
        int l=traverse(root.left);
        int r=traverse(root.right);

        int maxdepth=Math.max(l,r)+1;
        return maxdepth;
    }
}
