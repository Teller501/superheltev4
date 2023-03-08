package dk.kea.superheltev4.repositories;
import dk.kea.superheltev4.dto.*;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IRepository {
    List<HeroDTO> getHeroesByHeroName(String heroName);
    List<HeroDTO> getAllHeroes();
    List<SuperpowerDTO> getSuperpowersCountByHeroName(String heroName);

    List<SuperpowerDTO> getSuperpowersCount();
    List<HeroCityDTO> getHeroesAndCityByHeroName(String heroName);
    List<HeroCityDTO> getHeroesAndCity();

}
