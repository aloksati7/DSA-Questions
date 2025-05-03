
// conver decimal to binary
public class practice {
    public static void main(String[] args) {

        int a = convert(100 , 0);
        System.out.println(a);
    }

    public static  int convert(int n  , int ans){
        if(n == 0){
            return ans;
        }
        int a =   convert(n / 2 ,  ans);
        ans = a * 10 + ( n % 2);
        return ans;
    }
}
