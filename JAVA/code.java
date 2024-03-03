public static class code{
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
            /*Initailly we assume that our current Node is leafnode,
             so both of it's children are null*/
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        //System.out.println();
        TreeNode root = new TreeNode(0);
        //USES '.' OPEPRATOR TO ACCCESS PROPERTIES OF CLASS TREENODE
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
/*
        VISUALIZING BINARY TREE  
                   0 - ROOT NODE 
  LEFT SUBTREE - /  \ - RIGHT SUBTREE
                1    2  
              / \   /    
             3  4  5     -LEAFNODES
                                      */
        
        
    }
}