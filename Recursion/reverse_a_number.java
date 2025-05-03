// it reverse a number
public class practice {
    public static void main(String[] args) {

        int a = rev(123450 , 0);
        System.out.println(a);
    }

    public static  int rev(int n  , int ans){
        if(n == 0){
            return ans;
        }
        ans = ans * 10 + (n % 10);
        return rev(n / 10 , ans);

    }
}
