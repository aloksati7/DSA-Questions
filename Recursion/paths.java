// matrix find total number of paths
public class paths {
    public static void main(String[] args) {
        System.out.println(path(3 , 3));
    }
    public static int path(int r , int c){
        if(r == 1 || c == 1){
            return 1;
        }
        return path(r , c - 1) + path(r - 1 ,  c);
    }
}
