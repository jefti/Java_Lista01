import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int number;
        int cont = 0;
        int first = 1;
        int second = 1;
        int handle;

        System.out.print("Insira o tamanho da sequência :");
        number = input.nextInt();
        while (cont < number){
            if(cont < 3){
               if(cont == 0){
                System.out.println(0);
               } else {
                System.out.println(1);
               }
            } else {
                handle = first + second;
                System.out.println(handle);
                second = first;
                first = handle;
            }
            cont ++;
        }
    }
}
