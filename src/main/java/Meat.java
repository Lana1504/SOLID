public class Meat extends Product implements Food {

    //Single Responsibility Principle - класс Meat описывает только мясо, а не все продукты

    private final String name = "Мясо";
    private final int price = 500;

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
        System.out.println ("Мясо продано");
    }


}


