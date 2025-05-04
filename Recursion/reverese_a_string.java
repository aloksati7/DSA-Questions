public class practice {
    public static void main(String[] args) {


        System.out.println( rev("012345" , 0 , ""));
    }

    public static  String rev(String s , int i , String res){
        if(i == s.length()){
            return res;
        }
        res =  rev(s , i + 1 , res ) + s.charAt(i);
        return res;


    }
}