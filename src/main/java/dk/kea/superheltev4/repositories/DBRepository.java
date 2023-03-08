package dk.kea.superheltev4.repositories;

import dk.kea.superheltev4.dto.HeroCityDTO;
import dk.kea.superheltev4.dto.HeroDTO;
import dk.kea.superheltev4.dto.SuperpowerDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Primary
@Repository
public class DBRepository implements IRepository{
    List<HeroDTO> heroes = new ArrayList<>();
    List<SuperpowerDTO> heroSuperpowers = new ArrayList<>();
    List<HeroCityDTO> heroCityList = new ArrayList<>();
    @Override
    public List<HeroDTO> getHeroesByHeroName(String heroName) {

        try (Connection conn = DBManager.getConnection()) {
            String sql = "SELECT id, heroname, realname, creationdate FROM superhero WHERE heroname = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, heroName);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("heroname");
                String realName = rs.getString("realname");
                LocalDate creationdate = rs.getDate("creationdate").toLocalDate();
                HeroDTO hero = new HeroDTO(id, name, realName, creationdate);
                heroes.add(hero);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return heroes;
    }

    @Override
    public List<HeroDTO> getAllHeroes() {
        try (Connection conn = DBManager.getConnection()) {
            String sql = "SELECT id, heroname, realname, creationdate FROM superhero";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("heroname");
                String realName = rs.getString("realname");
                LocalDate creationdate = rs.getDate("creationdate").toLocalDate();
                HeroDTO hero = new HeroDTO(id, name, realName, creationdate);
                heroes.add(hero);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return heroes;
    }

    @Override
    public List<SuperpowerDTO> getSuperpowersCountByHeroName(String heroName) {
        try (Connection conn = DBManager.getConnection()) {
            String sql = "SELECT id, heroname, realname, superpowers FROM superhero WHERE heroname = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, heroName);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("heroname");
                String realName = rs.getString("realname");
                String superpowers = rs.getString("superpowers");
                SuperpowerDTO hero = new SuperpowerDTO(name,realName,superpowers);
                heroSuperpowers.add(hero);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return heroSuperpowers;
    }

    @Override
    public List<SuperpowerDTO> getSuperpowersCount() {
        try (Connection conn = DBManager.getConnection()) {
            String sql = "SELECT id, heroname, realname, superpowers FROM superhero";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("heroname");
                String realName = rs.getString("realname");
                String superpowers = rs.getString("superpowers");
                SuperpowerDTO hero = new SuperpowerDTO(name,realName,superpowers);
                heroSuperpowers.add(hero);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return heroSuperpowers;
    }

    @Override
    public List<HeroCityDTO> getHeroesAndCityByHeroName(String heroName) {
        try (Connection conn = DBManager.getConnection()) {
            String sql = "SELECT id, heroname, city.name FROM superhero JOIN city ON superhero.id = city.cityid WHERE heroname = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, heroName);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("heroname");
                String cityName = rs.getString("name");
                HeroCityDTO hero = new HeroCityDTO(name,cityName);
                heroCityList.add(hero);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return heroCityList;
    }

    @Override
    public List<HeroCityDTO> getHeroesAndCity() {
        try (Connection conn = DBManager.getConnection()) {
            String sql = "SELECT id, heroname, city.name FROM superhero JOIN city ON superhero.id = city.cityid";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("heroname");
                String cityName = rs.getString("name");
                HeroCityDTO hero = new HeroCityDTO(name,cityName);
                heroCityList.add(hero);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return heroCityList;
    }
}
