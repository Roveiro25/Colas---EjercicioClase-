import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue <Integer> c = new LinkedList<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el numero");
            c.offer((int)(Math.random() * 200 + 1));
            System.out.println("Desea continuar 1) si , 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                System.out.println("Hasta luego");
                continuar = false;
                
            }
        }
        System.out.println(c);
        System.out.println("tope" + c.peek());
        System.out.println("vamos a eliminar el tope ");
        c.remove();
        System.out.println(c);
    }
}