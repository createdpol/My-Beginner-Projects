import java.util.Scanner;
import static java.lang.Thread.sleep;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter new Pin code");
        Scanner NewPassword = new Scanner(System.in);
        int Password = NewPassword.nextInt();
        System.out.println("repeat new Pin code");
        Scanner Repeat = new Scanner(System.in);
        int RepeatPassword = Repeat.nextInt();
        if (RepeatPassword == Password) {
            System.out.println("Correct you may continue!");
        }
        else {
            System.out.println("Invalid!");
            System.out.println("Security system turned on!");
            System. exit(0);
        }
        System.out.println("Enter your balance:");
        Scanner EnterBalance = new Scanner(System.in);
        int Balance = EnterBalance.nextInt();
        if (Balance <= 0)
            System.out.println("Sorry You are too Broke for this Bank!");
        else {
            System.out.println("What do you want to do?");
            System.out.println("1 - enter money" + " " + "2 withdraw money" + " " + "3 check balance");
            Scanner num = new Scanner(System.in);
            int money = num.nextInt();
            switch (money) {
                case 1:
                    System.out.println("how much would you like to enter?");
                    Scanner GiveMoney = new Scanner(System.in);
                    int MoneyGiven = GiveMoney.nextInt();
                    int NewBalance = MoneyGiven + Balance;
                    System.out.println("your new balance is" + " " + NewBalance);
                    break;
                case 2:
                    System.out.println("how much would you like to withdraw?");
                    Scanner Withdraw = new Scanner(System.in);
                    int MoneyTaken = Withdraw.nextInt();
                    int NewBalance1 = Balance - MoneyTaken;
                    System.out.println("your new balance is" + " " + NewBalance1);
                    break;
                case 3:
                    System.out.println("your balance is" + " " + Balance);
                    break;
            }
            System.out.println("Would you like to do something else?");
            System.out.println("1 - No ");
            System.out.println("2 - Yes ");
            Scanner SomethingElse = new Scanner(System.in);
            int Answer = SomethingElse.nextInt();
            switch(Answer) {
                case 1:
                    System.out.println("Goodbye!");
                    break;
                case 2:
                { System.out.println("Enter your balance:");
                    Scanner EnterBalance1 = new Scanner(System.in);
                    int NewBalance1 = EnterBalance1.nextInt();
                    if (Balance <= 0)
                        System.out.println("Sorry You are too Broke for this Bank!");
                    else {
                        System.out.println("What do you want to do?");
                        System.out.println("1 - enter money" + " " + "2 withdraw money" + " " + "3 check balance");
                        Scanner num1 = new Scanner(System.in);
                        int money1 = num1.nextInt();
                        switch (money1) {
                            case 1:
                                System.out.println("how much would you like to enter?");
                                Scanner GiveMoney1 = new Scanner(System.in);
                                int MoneyGiven1 = GiveMoney1.nextInt();
                                int HigherBalance1 = MoneyGiven1 + NewBalance1;
                                System.out.println("your new balance is" + " " + HigherBalance1);
                                break;
                            case 2:
                                System.out.println("how much would you like to withdraw?");
                                Scanner Withdraw = new Scanner(System.in);
                                int MoneyTaken1 = Withdraw.nextInt();
                                int LowerBalance1 = NewBalance1 - MoneyTaken1;
                                System.out.println("your new balance is" + " " + LowerBalance1);
                                break;
                            case 3:
                                System.out.println("your balance is" + " " + NewBalance1);
                                break;}
                        System.out.println("GoodBye! Let Other People Use this Bank!");
                    }
                }
            }
        }
    }
}