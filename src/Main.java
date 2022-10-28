import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	ArrayList<Car> list = new ArrayList<>();
    Car mers = new Car("Merc", 300);
    Car bmw = new Car("BMW", 320);
    Car audi = new Car("Audi", 310);
    list.add(mers);
    list.add(bmw);
    list.add(audi);


    for(Car cars: list){
             System.out.println(cars.toString());
        }
    }
}
