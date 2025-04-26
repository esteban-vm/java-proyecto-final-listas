import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el límite de su tarjeta:");
        double limit = scanner.nextDouble();

        CreditCard creditCard = new CreditCard(limit);

        int exit = 1;

        while (exit != 0) {
            System.out.println("Escriba la descripción de su artículo:");
            String description = scanner.next();

            System.out.println("Escriba el valor de su artículo:");
            double value = Double.parseDouble(scanner.next());

            Item item = new Item(value, description);
            boolean itemChecked = creditCard.checkItem(item);

            if (itemChecked) {
                System.out.println("¡Artículo agregado!");
                System.out.println("Escriba 0 para salir o 1 para continuar:");
                exit = scanner.nextInt();
            } else {
                System.out.println("\n¡Saldo insuficiente!");
                exit = 0;
                scanner.close();
            }
        }

        System.out.println("\n**************************");
        System.out.println("SU FACTURA:");

        for (Item item : creditCard.getCart()) {
            System.out.println(item.getDescription() + " - " + item.getValue());
        }

        System.out.println("**************************\n");
        System.out.println("Saldo actual de su tarjeta: " + creditCard.getBalance());
    }
}
