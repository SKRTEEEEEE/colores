import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);
        String menu1 = """
                Lista de colores!
                ¿Cuantos colores quieres introducir?
                """;
        System.out.println(menu1);
        int numColors = input.nextInt();

        ArrayList<String> colores = new ArrayList<String>();

        for (int i = 1; i <= numColors; i++){
            System.out.println("Introduce el color numero" + i);
             String color = input.next();
             colores.add(color);
        }

        System.out.println("Has introducido los siguientes valores: ");
        for (int i = 0; i < colores.size(); i++){
            System.out.printf("\t" + colores.get(i));
        }


        input.close();



        /*Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }*/
    }
}