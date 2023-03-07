package dk.kea.superheltev4.controllers;

import dk.kea.superheltev4.repositories.ArrayRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("superhero")
public class SuperheroController {

    private ArrayRepository arrayRepository;
    public SuperheroController(){
        this.arrayRepository = arrayRepository;
    }
}
