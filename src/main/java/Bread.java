public class Bread extends Product implements Food {
    //Open Closed Principle - имплементируют интерфейс Food это добавляет
    // классу функциональности, не изменяя его код

    private final String name = "Хлеб";
    private final int price = 100;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void sold() {
        System.out.println ("Хлеб");

    }

    @Override
    public int getPrice() {
        return price;
    }


}


