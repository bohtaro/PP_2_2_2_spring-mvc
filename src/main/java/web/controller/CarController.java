package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String getCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> carList = carService.getListCar(count);
        model.addAttribute("cars", carList);
        return "cars";

    }

}
