public class Bear extends Product implements Drinks, Alcohol {

    //Interface Segregation Principle - применяем разные интерфейсы вместо одного большого
    //Dependency Inversion Principle - разделив интерфейсы мы не зависим от их общей функциональности,
    // мы можем поменять один интерфейс на другой

    private final String name = "Пиво";
    private final int price = 120;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void sold() {

    }

    @Override
    public int getPrice() {
        return price;
    }


    @Override
    public void carry() {
        System.out.println("Пиво");
    }
}
