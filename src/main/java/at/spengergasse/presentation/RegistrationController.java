package at.spengergasse.presentation;

import at.spengergasse.domain.User;
import at.spengergasse.domain.form.RegistrationForm;
import at.spengergasse.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
@Slf4j

public class RegistrationController {

    private final UserService userService;

    @GetMapping("/registration")
    public String login(Model model) {
        model.addAttribute("regform", new RegistrationForm());
        return "registration";
    }

    @PostMapping("registration")
    public String registerUser(@Valid @ModelAttribute("regform") RegistrationForm registrationForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            for (ObjectError objectError : bindingResult.getAllErrors()) {
                log.info(((FieldError) objectError).getField());
                model.addAttribute(((FieldError) objectError).getField() + "error", true);
            }
            model.addAttribute("regform", registrationForm);
            return "registration";
        }

        userService.saveUser(new User(registrationForm.getUsername(), registrationForm.getPassword(),registrationForm.getFirstname(),registrationForm.getLastname(),registrationForm.getEmail()));
        return "redirect:/login";
    }
}
