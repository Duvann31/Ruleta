import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int deposito=0,r=0,v=0, ck=5000, dk=10000, vk=20000, cik=50000,opcion=0, cuenta=0, op=1;
        int apuesta = 0;
        Scanner lector = new Scanner(System.in);
        while(op==1) {
            System.out.println("Cuanto desea apostar?");
            System.out.println("Elija una opcion: ");
            System.out.println("""
                    1. Para 5000
                    2. Para 10000
                    3. Para 20000
                    4. Para 50000
                    5. Para ingresar otro valor
                    6. Continuar a jugar
                    """);
            opcion = lector.nextInt();
            if (opcion == 1) {
                cuenta+=ck;
                System.out.println("Deposito 5000");
                System.out.println("Tiene: ");
                System.out.println(cuenta);
            }
            if (opcion == 2) {
                cuenta+=dk;
                System.out.println("Deposito 10000");
                System.out.println("Tiene: ");
                System.out.println(cuenta);
            }
            if (opcion == 3) {
                cuenta+=vk;
                System.out.println("Deposito 20000");
                System.out.println("Tiene: ");
                System.out.println(cuenta);
            }
            if (opcion == 4) {
                cuenta+=cik;
                System.out.println("Deposito 50000");
                System.out.println("Tiene: ");
                System.out.println(cuenta);
            }
            if (opcion == 5) {
                System.out.println("Ingrese el valor que desee depositar: ");
                deposito= lector.nextInt();
                cuenta+=deposito;
                System.out.println("Deposito: " + deposito);
                System.out.println("Tiene: ");
                System.out.println(cuenta);
            }
            if (opcion == 5) {
                System.out.println("Ingrese el valor que desee depositar: ");
            System.out.println("Cuanto desea apostar?");
            apuesta = lector.nextInt();
            }







    }
}}