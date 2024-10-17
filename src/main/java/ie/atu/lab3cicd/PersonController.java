package ie.atu.lab3cicd;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")

public class PersonController {

    @PostMapping("/addPerson")  // Info coming in will be from Person class
    public String addPerson(@RequestBody @Valid Person personRequest){
        return "Details added";
    }
}
