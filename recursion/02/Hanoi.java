public class Hanoi {

    public static void towerOfHonoi(int n, String src, String helper, String destination) {
        if(n==1){
            System.out.println("transfer diks " + n + " from " + src +" to " + destination);
            return;
        }
        towerOfHonoi(n - 1, src, destination, helper);
        System.out.println("transfer diks " + n + " from " + src +" to " + destination);
        towerOfHonoi(n - 1, helper, src, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHonoi(n, "S", "H", "D");
    }
}
