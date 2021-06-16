//package chapterthreeExercise;
//
//import java.util.Scanner;
//
//public class AccountApp {
//    private static Object Account;
//
//    public static void main(String[] args) {
//        Scanner Scanner = new Scanner(System.in);
//
//        Account nuelAccount = new Account();
//        String account = """
//                Enter 1 for deposit
//                Enter 2 for withdraw
//                Enter 3 to change pin
//                Enter 4 to check balance
//                Enter 5 to exit
//                """;
//        System.out.println("Enter pin ");
//        String pin = Scanner.nextLine();
//
//        if (pin.equals(nuelAccount.getaccountPIN())){
//            System.out.println(Account);
//            while (true){
//
//                System.out.println(Account);
//                int botton = Scanner.nextInt();
//                if (button>0 && button <= 5){
//                    switch (button){
//
//                        case 1: nuelAccount.deposit(Scanner.nextInt());
//                            System.out.println(nuelAccount.getAccountBalance());
//                        break;
//
//                        case 2: int withdraw = Scanner.nextInt();
//                            String Pin = nuelAccount.getAccountPIN();
//                            nuelAccount.withdraw(withdraw, pin);
//                            System.out.println(nuelAccount.getAccountBalance());
//                            break;
//
//                        case 3:
//                            Scanner.nextInt();
//                            String pin2 = Scanner.nextLine();
//                            nuelAccount.setAccountPIN(pin2);
//                            break;
//
//                        case 4:
//                            nuelAccount.getMyAccountBalance();
//                            System.out.println(nuelAccount.getMyAccountBalance());
//                            break;
//                        default:
//                            System.out.println("End of Transaction");
//                    }
//                }
//            }
//        }
//    }

