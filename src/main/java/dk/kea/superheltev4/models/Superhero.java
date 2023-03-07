package dk.kea.superheltev4.models;

import java.time.LocalDate;

public class Superhero {
    private int id;
    private String heroName;
    private String realName;
    private LocalDate creationDate;
    private boolean isHuman;
    private int cityID;
    private String superpowers;
    private double power;



    public int getId() {
        return id;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getRealName() {
        return realName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public int getCityID() {
        return cityID;
    }

    public String getSuperpowers() {
        return superpowers;
    }

    public double getPower() {
        return power;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public void setSuperpowers(String superpowers) {
        this.superpowers = superpowers;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
