package sort;
/*
 * 给定一个二叉树, 检查它是否是镜像对称的
 * 例如以下是镜像对称的
 *      1
 *     / \
 *    2   2
 *   / \ / \
 *  3  4 4  3
 *
 * 下面这个则不是镜像对称的
 *      1
 *     / \
 *    2   2
 *     \   \
 *      3   3
 */
public class mianshi3 {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root){
        if(root==null)
            return true;
            return dfs(root.left,root.rigt);



    }
    public boolean dfs(TreeNode l,TreeNode r){
        if(l==null&&r==null)return true;//空二叉树，完全对称没毛病
        if(l!=null&&r!=null&&l.data==r.data){
            return dfs(l.left,r.rigt)&&dfs(l.rigt,r.left);
        }
        return false;
    }





}
class TreeNode{
    int data;
    TreeNode left;
    TreeNode rigt;

    public TreeNode(int data) {
        this.data = data;
    }
}