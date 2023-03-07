package dk.kea.superheltev4.dto;

public class SuperpowerDTO {
    private String heroName;
    private String realName;
    private int numberOfSuperpowers;

    public SuperpowerDTO(String heroName, String realName, int numberOfSuperpowers) {
        this.heroName = heroName;
        this.realName = realName;
        this.numberOfSuperpowers = numberOfSuperpowers;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getNumberOfSuperpowers() {
        return numberOfSuperpowers;
    }

    public void setNumberOfSuperpowers(int numberOfSuperpowers) {
        this.numberOfSuperpowers = numberOfSuperpowers;
    }
}
