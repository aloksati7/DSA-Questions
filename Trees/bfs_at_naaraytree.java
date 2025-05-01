import java.util.*;

public class bfs_at_naaraytree {
    
    class Node {
         
        int data;
        ArrayList<Node> childern;
        Node(int data){
            this.data = data;
            childern = new ArrayList<>();
        }
    }

    public ArrayList<Integer> BFS(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(! queue.isEmpty()){
            Node node = queue.poll();
            res.add(node.data);
            for(Node child : node.childern){
                if(child != null){
                    queue.offer(child);
                }
            }
        }
        return res;

    }
}
