package dk.kea.superheltev4.controllers;

import dk.kea.superheltev4.dto.HeroCityDTO;
import dk.kea.superheltev4.dto.HeroDTO;
import dk.kea.superheltev4.dto.SuperpowerDTO;
import dk.kea.superheltev4.repositories.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("superhero")
public class SuperheroController {

    private IRepository repository;

    @Autowired
    public SuperheroController(IRepository repository){
        this.repository = repository;
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<HeroDTO>> getHeroesByHeroName(@PathVariable String name){
        List<HeroDTO> searchResults = repository.getHeroesByHeroName(name);
        return new ResponseEntity<>(searchResults, HttpStatus.OK);
    }

    @GetMapping("/superpower/count/{name}")
    public ResponseEntity<List<SuperpowerDTO>> getSuperpowersCountByHeroName(@PathVariable String name) {
        List<SuperpowerDTO> superpowers = repository.getSuperpowersCountByHeroName(name);
        return new ResponseEntity<>(superpowers, HttpStatus.OK);
    }

    @GetMapping("/superpower/{name}")
    public ResponseEntity<List<SuperpowerDTO>> getSuperpowersByHeroName(@PathVariable String name) {
        List<SuperpowerDTO> superpowers = repository.getSuperpowersByHeroName(name);
        return new ResponseEntity<>(superpowers, HttpStatus.OK);
    }

    @GetMapping("/city/{name}")
    public ResponseEntity<List<HeroCityDTO>> getCityByHeroName(@PathVariable String name) {
        List<HeroCityDTO> heroesAndCities = repository.getHeroesAndCityByHeroName(name);
        return new ResponseEntity<List<HeroCityDTO>>(heroesAndCities, HttpStatus.OK);
    }
}
