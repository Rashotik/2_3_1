package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UsersController {

	private final UserService userService;

	public UsersController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping({"", "/", "list"})
	public String showAllUsers(Model model) {
		model.addAttribute("users", userService.getAllUsers());

		return "list";
	}

	@GetMapping(value = "/new")
	public String addUserForm(@ModelAttribute("user") User user) {
		return "form";
	}

	@GetMapping("/edit")
	public String editUserForm(@RequestParam(value = "id", required = true) long id, Model model) {
		model.addAttribute("user", userService.readUser(id));
		return "form";
	}

	@PostMapping()
	public String saveUser(@ModelAttribute("user") User user) {
		userService.createOrUpdateUser(user);
		return "redirect:/users";
	}

	@GetMapping("/delete")
	public String deleteUser(@RequestParam(value = "id", required = true, defaultValue = "") long id) {
		userService.deleteUser(id);
		return "redirect:/users";
	}
}