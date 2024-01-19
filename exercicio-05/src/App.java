public class App {
    public static void main(String[] args) {
        String[] lista1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] lista2 = {"Manga", "Caqui", "Morango", "Amora", "Banana"};

        for(int i = 0; i<lista1.length; i++){
            for(int j =0 ; j<lista2.length; j++){
                if(lista1[i] == lista2[j]){
                    System.out.println(lista1[i]);
                    j = lista2.length + 1;
                }
            }
        }
    }
}
