import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TDD {

    @Test
    public void checkElementNameTest() {
        Elements main = new Elements();

        assertEquals(false, main.checkElementName("Segway", "sy"));
        assertEquals(true, main.checkElementName("Sveggjerium", "Ee"));
        assertEquals(true, main.checkElementName("Jeffkanium", "Kn"));
        assertEquals(true, main.checkElementName("Jeffzlot", "Zt"));
        assertEquals(false, main.checkElementName("Jeffntzum", "Nn"));
        assertEquals(false, main.checkElementName("Tuffjeffium", "Ty"));
        assertEquals(false, main.checkElementName("TF", "TF"));

    }

    @Test
    @Ignore
    public void generateElementNameTest() {
        Elements main = new Elements();

        assertEquals("Ai",main.generateElementName("Jeffkanium"));

    }

    @Test
    public void preferenceTest() {
        Elements main = new Elements();
        assertEquals("Hd", main.preference("Hda"));
        assertEquals("Ha", main.preference("Hda"));
        assertEquals("Da", main.preference("Hda"));
        assertEquals("Hy" , main.preference("Hydrogen"));
        assertEquals("Hd" , main.preference("Hydrogen"));
        assertEquals("Ch", main.preference("Chlorine"));
        assertEquals("Cr", main.preference("Chromium"));

    }

    @Test
    public void elementList() {
        Elements main = new Elements();

        assertEquals("Hy", main.preference("Hydrogen"));
        assertEquals("He", main.preference("Helium"));
        assertEquals("Li", main.preference("Lithium"));
        assertEquals("Be", main.preference("Beryllium"));
        assertEquals("Bo", main.preference("Boron"));
        assertEquals("Ca", main.preference("Carbon"));
        assertEquals("Ni", main.preference("Nitrogen"));
        System.out.println(Elements.elements.toString());
    }

}