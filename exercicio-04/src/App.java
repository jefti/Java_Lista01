import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Insiria o número: ");
        number = input.nextInt();

        for(int i = 1; i<= number; i++){
            String msg = "";
            for(int j = 1; j<=i; j++){
                msg += Integer.toString(i);
            }
            System.out.println(msg);
        }
    }
}
