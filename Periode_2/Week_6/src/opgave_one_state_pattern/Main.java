package opgave_one_state_pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Scanner scanner = new Scanner(System.in);
        char command;
        do {
            System.out.println("0. Quit");
            System.out.println("1. Print alle producten");
            System.out.println("2. Add product");
            System.out.println("3. Remove product");
            System.out.println("4. Get amount");
            System.out.println("5. Pay");
            System.out.println("6. Return");
            System.out.println("7. Sent");
            System.out.println("8. Refund");
            System.out.print("Enter action (0..7): ");
            String s = scanner.nextLine().trim();
            System.out.println();
            command = (s.length() == 1) ? s.charAt(0) : '\0';

            if (command == '1') {
                order.print();
            }

            if (command == '2') {
                System.out.print("Enter name of product: ");
                String name = scanner.nextLine();
                System.out.print("Enter price: ");
                try {
                    int price = Integer.parseInt(scanner.nextLine());
                    order.addProduct(name, price);
                } catch (NumberFormatException e) {
                }
            }

            if (command == '3') {
                System.out.print("Enter name of product: ");
                String name = scanner.nextLine();
                order.removeProduct(name);
            }

            if (command == '4') {
                order.getAmount();
            }

            if (command == '5') {
                order.payOrder();
            }

            if (command == '6') {
                order.returnOrder();
            }
            if (command == '7') {
                order.sendOrder();
            }
            if (command == '8') {
                order.refundOrder();
            }

            System.out.println();
        } while (command != '0');
    }
}
