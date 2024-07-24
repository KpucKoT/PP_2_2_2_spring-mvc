package service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl {

    public List<Car> carList(int i) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Volvo", "red"));
        cars.add(new Car(2, "BMW", "blue"));
        cars.add(new Car(3,"Ford", "green"));
        cars.add(new Car(4, "Honda", "yellow"));
        cars.add(new Car(5, "Volga", "white"));
        return cars.stream().limit(i).collect(Collectors.toList());
    }

}


