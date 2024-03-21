package BinaryTree;

class TreeNoode{
    int val;
    TreeNoode left;
    TreeNoode right;
    TreeNoode(int val){
        this.val = val;
    }
}

public class LevelOrderTraversel {

    public static boolean printOrder(TreeNoode root,int level){
        if (root==null) {
            return false;
        }
        if (level==1) {
            System.out.println(root.val+" ");
            return true;
        }
        boolean left = printOrder(root.left, level-1);
        boolean right = printOrder(root.right, level-1);

        return (true||false);
    }

    public static void levelOrdertraversel(TreeNoode root){
        int level = 1;
        while (printOrder(root,level)) {
            level++;
        }
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
        root.left.left.right = new TreeNoode(79);
        levelOrdertraversel(root);
        //root.left.left.right = new TreeNoode(79);
    }
}
