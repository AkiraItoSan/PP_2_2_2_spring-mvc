package web.services;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList = List.of(new Car("Lada", "P013OX", 2008),
            new Car("Honda", "P412EC", 2011),
            new Car("Kia", "P003PE", 1999),
            new Car("Renault", "P102BT", 2021),
            new Car("Toyota", "P124PP", 2010));

    public CarServiceImpl() {

    }

    @Override
    public List<Car> getCarsList(Integer count) {

        if (count != null && count <= carList.size() && count >= 0) {
            return carList.subList(0, count);
        }

        return carList;
    }
}
