package example.codeclan.com.pokemonsafari;

import java.util.ArrayList;

/**
 * Created by user on 26/04/2017.
 */

public class Area {

    private String type;
    private ArrayList<Pokemon> monsters;

    public Area(String type){
        this.type = type;
        this.monsters = new ArrayList<Pokemon>();
    }

    public String getType() {
        return this.type;
    }

    public int pokemoncount(){
        return monsters.size();
    }

}
