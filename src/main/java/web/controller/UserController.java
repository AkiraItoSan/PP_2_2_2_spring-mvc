package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.models.User;
import web.services.UserService;

@Controller
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String printCars(ModelMap model) {
        model.addAttribute(userService.listUsers());
        return "user";
    }

    @PostMapping()
    public String create(@RequestParam("name") String name,
                         @RequestParam("lastName") String lastName,
                         @RequestParam("email") String email) {
        userService.add(new User(name, lastName, email));
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") Long id) {
        model.addAttribute("user", userService.getUserById(id));
        return "edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user,
                         @PathVariable("id") Long id) {

        userService.updateUser(user);

        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@ModelAttribute("user") User user) {

        userService.remove(user);
        return "redirect:/";
    }
}
