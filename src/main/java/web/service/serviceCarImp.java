package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class serviceCarImp implements serviceCar {

    private final CarDao carDao;

    @Autowired
    public serviceCarImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count != null){
            return carDao.getCars(count);
        }else {
            return carDao.getCars();
        }
    }
}
