package company.bootstrap;

import company.entity.Car;
import company.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class DataGenerator implements CommandLineRunner{

    CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car c1 = new Car("C200","Mercedes","Blue");
        Car c2 = new Car("A4","Audi","Black");
        Car c3 = new Car("Superb","Skoda","Gray");
        Car c4 = new Car("A6","Audi","Red");


        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);
        carRepository.save(c4);
    }
}
