class Solution {

    public int towerOfHanoi(int n, int from, int to, int aux) {
        // Your code here
        int [] moves = new int[1];

        moveDisk(n , from , to , aux , moves);
        return moves[0];

    }
    public void moveDisk(int n, int from, int to, int aux , int [] moves){
        if(n == 0){
            return;
        }

        moves[0]++;

        moveDisk(n - 1 , from , to , aux , moves);


        System.out.println("move disk " + n + "from rod" + from + " to rod" + to);

        moveDisk(n - 1 , aux  , to , from,  moves);
    }
}
