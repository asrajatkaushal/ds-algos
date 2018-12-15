public class TowersOfHanoi {
    public int towerOfHanoi(int n, String from, String to, String temp, int moves){
        if(n == 1){
            System.out.println("Move disk " + n + " from " + from + " to peg " + to);
            return ++moves;
        } else {
            towerOfHanoi(n - 1, from, temp, to, ++moves);
            System.out.println("Move disk " + n + " from " + from + " to peg " + to);
            towerOfHanoi(n - 1, temp, to, from, ++moves);
            return ++moves;
        }
    }
}
