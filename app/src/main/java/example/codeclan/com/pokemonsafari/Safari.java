package example.codeclan.com.pokemonsafari;

import java.util.ArrayList;

/**
 * Created by user on 26/04/2017.
 */

public class Safari {

    private String name;
    private int entryfee;
    private ArrayList<Area> enclosures;

    public Safari(String name, int entryfee){
        this.name = name;
        this.entryfee = entryfee;
        this.enclosures = new ArrayList<Area>();
    }

    public String getName(){
        return this.name;
    }

    public int getEntryfee(){
        return this.entryfee;
    }

    public void addArea(Area area){
        enclosures.add(area);
    }

    public int areacount(){
        return enclosures.size();
    }
}
