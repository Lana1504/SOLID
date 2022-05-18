public class Juice extends Product implements Drinks {
    //Open Closed Principle - имплементируют интерфейс Drinks, добавляем
    // классу функциональности, не изменяя его код
    private final String name = "Сок";
    private final int price = 100;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void sold() {
        System.out.println ("Сок");
    }


}