package example.codeclan.com.pokemonsafari;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 26/04/2017.
 */

public class SafariTest {

    Safari safari;
    Area area;

    @Before
    public void before(){
        safari = new Safari("Jooland", 50);
        area = new Area("Water");
    }

    @Test
    public void safariHasNameTest(){
        assertEquals("Jooland", safari.getName());
    }

    @Test
    public void safariHasEntryfeeTest(){
        assertEquals(50, safari.getEntryfee());
    }

    @Test
    public void safariStartsEmptyTest(){
        assertEquals(0, safari.areacount());
    }

    @Test
    public void addAreaToSafariTest(){
        safari.addArea(area);
        assertEquals("Water", area.getType());
    }

}
