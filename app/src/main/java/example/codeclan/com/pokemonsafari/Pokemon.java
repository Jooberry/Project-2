package example.codeclan.com.pokemonsafari;

/**
 * Created by user on 26/04/2017.
 */

public abstract class Pokemon {

    private String name;
    private String type;
    private String gender;
    private String hungerLevel;

    public abstract String eat();

    public Pokemon(String name, String type, String gender, String hungerLevel){
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.hungerLevel = hungerLevel;
    }


    public String getName() {
        return this.name;
    }
}
