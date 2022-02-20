package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

	@GetMapping(value = "/cars")
	public String printWelcome(ModelMap model) {
		List<Car> cars = new CarService().listCars();
		model.addAttribute("cars", cars);
		return "cars";
	}
	
}