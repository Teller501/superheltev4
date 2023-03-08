package dk.kea.superheltev4.repositories;
import dk.kea.superheltev4.dto.*;

import java.util.List;

public interface IRepository {
    List<HeroDTO> getHeroesByHeroName(String heroName);
    List<HeroDTO> getAllHeroes();
    List<SuperpowerDTO> getSuperpowersByHeroName(String heroName);
    List<SuperpowerDTO> getSuperpowers();
    List<HeroCityDTO> getHeroesAndCityByHeroName(String heroName);
    List<HeroCityDTO> getHeroesAndCity();

}
