class Solution {
    public void reverseString(char[] s) {

        rev(s , 0);

    }
    public void rev(char [] s , int i){
        if(i == s.length/2){
            return;
        }
        rev(s , i + 1);
        swap(s , i , s.length - i - 1);
    }
    public void swap(char [] s  , int i , int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}