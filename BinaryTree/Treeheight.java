package BinaryTree;
class TreeNoode{
    int val;
    TreeNoode left;
    TreeNoode right;
    TreeNoode(int val){
        this.val = val;
    }
}
public class Treeheight {
    public static int height(TreeNoode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void main(String[] args) {
        TreeNoode root = new TreeNoode(20);
        root.left = new TreeNoode(23);
        root.left.left = new TreeNoode(45);
        root.left.right = new TreeNoode(56);
        root.right = new TreeNoode(78);
        root.right.left = new TreeNoode(94);
        root.right.right = new TreeNoode(99);
        root.left.left.left = new TreeNoode(97);
        System.out.println("Tree height is "+height(root));
    }
}