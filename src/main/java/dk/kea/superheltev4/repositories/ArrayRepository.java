package dk.kea.superheltev4.repositories;

import dk.kea.superheltev4.dto.HeroCityDTO;
import dk.kea.superheltev4.dto.HeroDTO;
import dk.kea.superheltev4.dto.SuperpowerDTO;
import dk.kea.superheltev4.models.Superhero;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ArrayRepository implements IRepository {
    private HeroDTO superhero1 = new HeroDTO("Superman", "Clark Kent", LocalDate.now());
    private HeroDTO superhero2 = new HeroDTO("Batman", "Bruce Wayne", LocalDate.now());
    private HeroDTO superhero3 = new HeroDTO("Spider-Man", "Peter Parker", LocalDate.now());

    private SuperpowerDTO superhero4 = new SuperpowerDTO("Superman", "Clark Kent", "Flyve, Stærk");
    private SuperpowerDTO superhero5 = new SuperpowerDTO("Batman", "Bruce Wayne", "Rig");
    private SuperpowerDTO superhero6 = new SuperpowerDTO("Spider-Man", "Peter Parker", "Spinne, spidersense");

    private HeroCityDTO superhero7 = new HeroCityDTO("Batman", "Arkham");
    private HeroCityDTO superhero8 = new HeroCityDTO("Batman", "Arkham");
    private HeroCityDTO superhero9 = new HeroCityDTO("Batman", "Arkham");

    private List<HeroDTO> superheroes = new ArrayList<>(Arrays.asList(superhero1,superhero2,superhero3));
    private List<SuperpowerDTO> superpowers = new ArrayList<>(Arrays.asList(superhero4, superhero5, superhero6));
    private List<HeroCityDTO> heroCities = new ArrayList<>(Arrays.asList(superhero7,superhero8,superhero9));

    public ArrayRepository() {
    }

    @Override
    public List<HeroDTO> getHeroesByHeroName(String heroName) {
        List<HeroDTO> searchResults = new ArrayList<>();

        for (HeroDTO superhero : superheroes) {
            String name = superhero.getHeroName().toLowerCase();
            if (name.contains(heroName.toLowerCase().trim())) {
                searchResults.add(new HeroDTO(superhero.getHeroName(), superhero.getRealName(), superhero.getCreationDate()));
            }
        }
        // return searchResult
        return searchResults;
    }

    @Override
    public List<HeroDTO> getAllHeroes() {
        List<HeroDTO> heroDTOs = new ArrayList<>();
        for (HeroDTO superhero : superheroes) {
            heroDTOs.add(new HeroDTO(superhero.getHeroName(), superhero.getRealName(), superhero.getCreationDate()));
        }
        return heroDTOs;
    }

    @Override
    public List<SuperpowerDTO> getSuperpowersCountByHeroName(String heroName) {
        List<SuperpowerDTO> searchResults = new ArrayList<>();
        for (SuperpowerDTO superpower : superpowers) {
            if (superpower.getHeroName().equals(heroName)) {
                searchResults.add(superpower);
            }
        }
        return searchResults;
    }

    @Override
    public List<SuperpowerDTO> getSuperpowersCount() {
        List<SuperpowerDTO> superpowerDTOs = new ArrayList<>();
        for (SuperpowerDTO superpower : superpowers) {
            superpowerDTOs.add(new SuperpowerDTO(superpower.getHeroName(), superpower.getRealName(), superpower.getSuperpowers()));
        }
        return superpowerDTOs;
    }

    @Override
    public List<SuperpowerDTO> getSuperpowersByHeroName(String heroName) {
        List<SuperpowerDTO> searchResults = new ArrayList<>();
        for (SuperpowerDTO superpower : superpowers) {
            if (superpower.getHeroName().equals(heroName)) {
                searchResults.add(superpower);
            }
        }
        return searchResults;
    }

    @Override
    public List<SuperpowerDTO> getAllSuperpowers() {
        return superpowers;
    }

    @Override
    public List<HeroCityDTO> getHeroesAndCityByHeroName(String heroName) {
        List<HeroCityDTO> searchResult = new ArrayList<>();

        // find heroes with specified name
        for (HeroCityDTO hero : heroCities) {
            if (hero.getHeroName().equals(heroName)) {
                searchResult.add(new HeroCityDTO(hero.getHeroName(), hero.getCityName()));
            }
        }

        return searchResult;
    }
}
