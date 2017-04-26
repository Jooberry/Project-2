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
        area = new Area("Water");
        pokemon = new Lapras();
    }

    @Test
    public void areaHasTypeTest(){
        assertEquals("Water", area.getType());
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

}
