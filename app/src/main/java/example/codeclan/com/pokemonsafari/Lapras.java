package example.codeclan.com.pokemonsafari;

/**
 * Created by user on 26/04/2017.
 */

class Lapras extends Pokemon {

    public Lapras(String name, String type, String gender, String hungerLevel){
        super(name);
        super(type);
        super(gender);
        super(hungerLevel);
    }

    public String eat(){
        return "Lapras munches on algae";
    }

}
