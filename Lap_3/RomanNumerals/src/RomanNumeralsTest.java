import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

    RomanNumerals converter = new RomanNumerals();

    // ----------- Positive Test Scenarios ------------

    @Test
    void TS01_01_I_ShouldBe1() {
        assertEquals(1, converter.convertRomanNumToInt("I"));
    }

    @Test
    void TS01_02_V_ShouldBe5() {
        assertEquals(5, converter.convertRomanNumToInt("V"));
    }

    @Test
    void TS02_01_IV_ShouldBe4() {
        assertEquals(4, converter.convertRomanNumToInt("IV"));
    }

    @Test
    void TS02_02_IX_ShouldBe9() {
        assertEquals(9, converter.convertRomanNumToInt("IX"));
    }

    @Test
    void TS03_01_VI_ShouldBe6() {
        assertEquals(6, converter.convertRomanNumToInt("VI"));
    }

    @Test
    void TS03_02_CI_ShouldBe101() {
        assertEquals(101, converter.convertRomanNumToInt("CI"));
    }

    @Test
    void TS04_01_II_ShouldBe2() {
        assertEquals(2, converter.convertRomanNumToInt("II"));
    }

    @Test
    void TS04_02_XX_ShouldBe20() {
        assertEquals(20, converter.convertRomanNumToInt("XX"));
    }

    @Test
    void TS05_01_III_ShouldBe3() {
        assertEquals(3, converter.convertRomanNumToInt("III"));
    }

    @Test
    void TS05_02_XXX_ShouldBe30() {
        assertEquals(30, converter.convertRomanNumToInt("XXX"));
    }

    @Test
    void TS06_01_XXVI_ShouldBe26() {
        assertEquals(26, converter.convertRomanNumToInt("XXVI"));
    }

    @Test
    void TS06_02_XXVII_ShouldBe27() {
        assertEquals(27, converter.convertRomanNumToInt("XXVII"));
    }

    @Test
    void TS06_03_LXVII_ShouldBe67() {
        assertEquals(67, converter.convertRomanNumToInt("LXVII"));
    }

    @Test
    void TS07_01_LXXIV_ShouldBe74() {
        assertEquals(74, converter.convertRomanNumToInt("LXXIV"));
    }

    @Test
    void TS07_02_LXXVI_ShouldBe76() {
        assertEquals(76, converter.convertRomanNumToInt("LXXVI"));
    }

    @Test
    void TS07_03_LXXVIII_ShouldBe78() {
        assertEquals(78, converter.convertRomanNumToInt("LXXVIII"));
    }

    @Test
    void TS07_04_LXXXIV_ShouldBe84() {
        assertEquals(84, converter.convertRomanNumToInt("LXXXIV"));
    }

    // ----------- Negative Test Scenarios ------------

    @Test
    void TS08_01_Invalid_J_ShouldThrow() {
        assertThrows(NullPointerException.class, () -> converter.convertRomanNumToInt("J"));
    }

    @Test
    void TS08_02_Invalid_K_ShouldThrow() {
        assertThrows(NullPointerException.class, () -> converter.convertRomanNumToInt("K"));
    }

    @Test
    void TS09_01_VV_NotEquals10() {
        assertNotEquals(10, converter.convertRomanNumToInt("VV"));
    }

    /*@Test
    void TS09_02_LL_Equals100() {
        asserttEquals(100, converter.convertRomanNumToInt("LL"));
    }*/

    @Test
    void TS09_02_LL_NotEquals100() {
        assertNotEquals(100, converter.convertRomanNumToInt("LL"));
    }

    /*@Test
    void TS09_02_LL_Equals100() {
        assertEquals(100, converter.convertRomanNumToInt("LL"));
    }*/

    @Test
    void TS10_01_IIII_NotEquals4() {
        assertNotEquals(4, converter.convertRomanNumToInt("IIII"));
    }

    /*@Test
    void TS10_01_IIII_Equals4() {
        assertEquals(4, converter.convertRomanNumToInt("IIII"));
    }*/

    @Test
    void TS10_02_XXXX_NotEquals40() {
        assertNotEquals(40, converter.convertRomanNumToInt("XXXX"));
    }

    /*@Test
    void TS10_02_XXXX_Equals40() {
        assertEquals(40, converter.convertRomanNumToInt("XXXX"));
    }*/ 

}
