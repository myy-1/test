package sort;

import java.util.ArrayList;
import java.util.List;

public class twotree {
    private Object data;//存放当前节点的数据
    private twotree lChild;//当前节点的左孩子
    private twotree rChild;//当前节点的右孩纸
    private twotree root;//这是根节点

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public twotree getlChild() {
        return lChild;
    }

    public void setlChild(twotree lChild) {
        this.lChild = lChild;
    }

    public twotree getrChild() {
        return rChild;
    }

    public void setrChild(twotree rChild) {
        this.rChild = rChild;
    }

    public twotree getRoot() {
        return root;
    }

    public void setRoot(twotree root) {
        this.root = root;
    }

    public twotree() {
    }

    public twotree(Object data) {
        this.data = data;
    }

    public void created(Object data[]){//初始化二叉树,将传进来的值创建为二叉树
        List<twotree> list=new ArrayList<twotree>();//新建一个list集合，将数据变为各个节点
        for (Object tempdata :data) {
            list.add(new twotree(tempdata));
        }
        root=list.get(0);//将第一个元素设置为根节点
        /**
         * 利用构建完全二叉树的方式构建
         */
        for(int i=0;i<list.size()/2;i++){
            if((i*2+1)<list.size()){
                list.get(i).setlChild(list.get(i*2+1));
            }
            if((i*2+2)<list.size()){

                list.get(i).setrChild(list.get(i*2+2));
            }
        }
        
    }

    public void PreOrder(twotree root){//利用递归实现前序遍历，输出打印结果
        if(root!=null){
            System.out.println(root.getData()+"\t");
            PreOrder(root.getlChild());
            PreOrder(root.getrChild());
        }

    }
    public void midOrder(twotree root){//利用递归实现中序遍历，输出打印结果
        if(root!=null){
            midOrder(root.getlChild());
            System.out.println(root.getData()+"\t");
            midOrder(root.getrChild());

        }


    }

    public void afterOrder(twotree root){//利用递归实现后序遍历，输出打印结果
        if(root!=null){
            midOrder(root.getlChild());
            midOrder(root.getrChild());
            System.out.print(root.getData()+"\t");

        }

    }


    public static void main(String[] args) {
        Object data[]={1,2,3,4,5};
        twotree binTree=new twotree();
        binTree.created(data);//创建二叉树

        System.out.println("前序结果");
        binTree.PreOrder(binTree.getRoot());//前序遍历结果
        System.out.println("中序结果");
        binTree.midOrder(binTree.getRoot());//中序遍历结果
        System.out.println("后序结果");
        binTree.afterOrder(binTree.getRoot());//后序遍历结果



    }

}
