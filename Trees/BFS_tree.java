import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class bfs_traversal{

    class TreeNode {
        int data;

        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

    }
    public  ArrayList<Integer> BFS(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(! queue.isEmpty()){
            TreeNode node = queue.poll();
            res.add(node.data);
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }

        }
        return res;
    }
}