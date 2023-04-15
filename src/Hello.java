import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Word");
        Scanner in = new Scanner(System.in);
        int amount, price;
        System.out.print("please input the amount:");
        amount = in.nextInt();
        System.out.print("please input the price:");
        price = in.nextInt();
//        System.out.println("This is your input:" + in.nextLine());
        System.out.println(amount + "-" + price + "=" + (amount - price));
    }
}
