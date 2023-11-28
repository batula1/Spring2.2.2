package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    private List<Car> list;

        public CarDaoImp(){
        list = new ArrayList<>();
        list.add(new Car("RED", "Ferarri", 121));
        list.add(new Car("BAKLADJAN", "VAZ", 2172));
        list.add(new Car("BLACK", "LAND CRUSER", 200));
        list.add(new Car("SILVER", "PORSHE", 911));
        list.add(new Car("YELLOW", "lamborghini", 350));
    }
    @Override
    public List<Car> getCars(Integer count) {
        if (count > 0 && count < list.size()){
            return list.subList(0,count);
        }else {
            return list;
        }

    }

    @Override
    public List<Car> getCars() {
        return list;
    }
}
