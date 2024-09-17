package org.acme.getting.started;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@ApplicationScoped
public class CarService {

    private final Map<String, Car> cars = new HashMap<>();

    public Car createCar(Car car) {
        String id = UUID.randomUUID().toString();
        car.setThingId(id); 
        cars.put(id, car);
        return car;
    }

    public Car findCarById(String id) {
        return cars.get(id);
    }

    public Car updateCar(String id, Car car) {
        if (cars.containsKey(id)) {
            car.setThingId(id); 
            cars.put(id, car);
            return car;
        }
        return null;
    }

    public boolean deleteCar(String id) {
        return cars.remove(id) != null;
    }

    public List<Car> listCars() {
        return new ArrayList<>(cars.values());
    }
}
