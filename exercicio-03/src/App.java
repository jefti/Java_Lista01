import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Insira o número que deseja : ");
        number = input.nextInt();

        for(int i=1; i<=10;i++){
            System.out.printf(" %d x %s = %s%n", number, i, (number*i));
        }
    }
}
