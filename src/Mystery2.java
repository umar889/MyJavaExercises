public class Mystery2 {
    public static void main(String[] args) {
        int account = 1;
        while (account <= 10){
            System.out.println(account % 2 == 1 ? "****" : "++++++++");
            ++account;
        }
    }
}
