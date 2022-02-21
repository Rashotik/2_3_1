package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarsController {

	@GetMapping(value = "/cars")
	public String printCars(@RequestParam(value = "count") Optional<Integer> count, ModelMap model) {
		List<Car> cars = new CarService().listCars(count.orElse(0));
		model.addAttribute("cars", cars);
		return "cars";
	}
	
}