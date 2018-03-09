package demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class LocationRestController {

    @Value("${zhuo.name}")
    private String name;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting() {
        return "Hello " + name;
    }
}
