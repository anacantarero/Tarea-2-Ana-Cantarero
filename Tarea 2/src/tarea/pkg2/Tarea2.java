package tarea.pkg2;
import java.util.Scanner;
public class Tarea2 {
    public static void main(String[] args) {
Scanner scanString = new Scanner(System.in);
        System.out.print("Ingrese una operacion matematica separando los numeros y el operador con un espacio. Ejemplo: 3 + 2 o 6 * 3.\n");
        String opcion = scanString.nextLine();
        opcion+=" ";
        Scanner div = new Scanner(opcion);
        int numero1 = div.nextInt();
        String operador = div.next();
        int numero2 = div.nextInt();

        switch (operador.charAt(0)) {
            case '+' -> System.out.printf("%s= %d", opcion, (numero1 + numero2));
            case '-' -> System.out.printf("%s= %d", opcion, (numero1 - numero2));
            case '*' -> System.out.printf("%s= %d", opcion, (numero1 * numero2));
            case '/' -> System.out.printf("%s= %d", opcion, (numero1 / numero2));
        }
        scanString.close();
        div.close();
    }    
}
