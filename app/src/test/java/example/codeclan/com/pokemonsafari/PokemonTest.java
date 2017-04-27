package example.codeclan.com.pokemonsafari;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 27/04/2017.
 */

public class PokemonTest {

    Pokemon pokemon1;
    Pokemon pokemon2;

    @Before
    public void before(){
        pokemon1 = new Lapras("Lapras", "Water", "Female", "Hungry");
        pokemon2 = new Magikarp("Magikarp", "Water", "Male", "Content");
    }

    @Test
    public void pokemonHasNameTest(){
        assertEquals("Lapras", pokemon1.getName());
    }

    @Test
    public void pokemonHasTypeTest(){
        assertEquals("Water", pokemon1.getType());
    }

    @Test
    public void pokemonHasGenderTest(){
        assertEquals("Female", pokemon1.getGender());
    }

    @Test
    public void pokemonHasHungerLevelTest(){
        assertEquals("Hungry", pokemon1.getHungerLevel());
    }

    @Test
    public void pokemonHungerLevelCanChangeToContentTest(){
        pokemon1.eat();
        assertEquals("Content", pokemon1.getHungerLevel());
    }

    @Test
    public void pokemonHungerLevelCanChangeToFullTest(){
        pokemon2.eat();
        assertEquals("Full", pokemon2.getHungerLevel());

    }

}
