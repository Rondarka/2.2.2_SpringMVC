package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars; {
        cars = new ArrayList<>();
        cars.add(new Car(2020, "BMW X5", "Black"));
        cars.add(new Car(2021, "Mercedes-Benz C-Class", "White"));
        cars.add(new Car(2019, "Audi Q7", "Silver"));
        cars.add(new Car(2022, "Tesla Model S", "Red"));
        cars.add(new Car(2018, "Toyota Camry", "Blue"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null) {
            count = cars.size();
        }
        Stream<Car> carsStream = cars.stream().limit(count);
        return carsStream.toList();
    }
}
