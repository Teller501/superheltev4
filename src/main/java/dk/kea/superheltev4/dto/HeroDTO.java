package dk.kea.superheltev4.dto;

public class HeroDTO {
    private String heroName;
    private String realName;
    private int creationYear;

    public HeroDTO(String heroName, String realName, int creationYear) {
        this.heroName = heroName;
        this.realName = realName;
        this.creationYear = creationYear;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }
}
