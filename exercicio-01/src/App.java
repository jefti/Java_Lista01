import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input =  new Scanner(System.in);
        
        int number;
        String classification;
        String position;

        System.out.print("Insira um número qualquer:");
        number = input.nextInt();
        if(number<0){
            position = "negativo";
        } else{
            position = "positivo";
        }

        if(number%2 == 0){
            classification = "par";
        } else {
            classification = "ímpar";
        }

        System.out.printf("O número é %d, %s e %s%n", number, position, classification);
    }
}

