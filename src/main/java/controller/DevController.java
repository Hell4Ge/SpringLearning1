package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("dev")
public class DevController extends Controller {
    // Do not use "/" unless you want to distinguish between /dev and /dev/
    // (No, you don't want to)
    @RequestMapping("")
    String index() {
        return "Welcome to dev controller, this place is your sandbox. Please, remove me before production-level deploy";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DevController.class, args);
    }
}
