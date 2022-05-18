import java.util.Scanner;

public class Main {

    //Magic Numbers Principle -  используем константы вместо чисел
    public static final char RUB = (char) 0x20BD;


    public static void main(String[] args) {

        //Liskov substitution principle - наследники класса Product, полностью играют роль предка
        Product[] products = {new Bread (), new Meat (), new Juice (), new Bear ()};

        //принцип DRY - повторяющийся вывод списка продуктов на экран, выносим в отдельный метод
        printProducts (products);

        Scanner scanner = new Scanner (System.in);
        while (true) {
            System.out.println ("Введите номер товара и количество через пробел или введите `end` ");
            String input = scanner.nextLine ();
            if ( input.equals ("end") ) break;
            String[] parts = input.split (" ");
            int goodsNumber = Integer.parseInt (parts[0]) - 1;
            products[goodsNumber].setCount (Integer.parseInt (parts[1]));
        }
        printProducts (products);
        printBasket (products);
    }

    private static void printProducts(Product[] products) {
        System.out.println ("Список возможных товаров для покупки: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println ((i + 1) + ". " + products[i]);
        }
    }

    private static void printBasket(Product[] products) {
        int costProducts = 0;
        System.out.println ("Ваша корзина: ");
        for (Product product : products) {
            if ( product.getCount () != 0 ) {
                costProducts += product.getCount () * product.getPrice ();
                System.out.println (product + " 'количество'= " + product.getCount () + " шт."
                        + " 'цена'= " + product.getPrice () + " " + RUB
                        + " 'стоимость'= " + product.getCount () * product.getPrice () + " " + RUB);
            }
        }
        System.out.println ("Итого: " + costProducts + " " + RUB);
    }

}
