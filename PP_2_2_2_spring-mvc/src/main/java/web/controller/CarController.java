package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;


@Controller
@RequestMapping
public class CarController {



    @GetMapping("/cars")
        public String cars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
            CarServiceImpl carServiceImpl = new CarServiceImpl();
            model.addAttribute("cars", carServiceImpl.carList(count));
            return "cars";

        }
}
