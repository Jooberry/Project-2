package example.codeclan.com.pokemonsafari;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 26/04/2017.
 */

public class AreaTest {

    Area area;
    Pokemon pokemon;

    @Before
    public void before(){
        area = new Area("Lake");
        pokemon = new Lapras("Lapras", "Water", "Female", "Hungry");
    }

    @Test
    public void areaHasTypeTest(){
        assertEquals("Lake", area.getType());
    }

    @Test
    public void areaStartsEmptyTest(){
        assertEquals(0, area.pokemoncount());
    }

    @Test
    public void addAreaToSafariTest(){
        area.addPokemon(pokemon);
        assertEquals("Lapras", pokemon.getName());
    }

    @Test
    public void removeAllPokemonFromAreaTest(){
        area.addPokemon(pokemon);
        area.removeAll();
        assertEquals(0, area.pokemoncount());
    }

}
