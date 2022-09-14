package day14092022;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author tatyana.danilova 14.09.2022 11:05
 */
public class MainTest {

    @Test
    public void signPositiveTest() {
        int k = Main.sign(6);
        Assert.assertEquals(1, k);
    }

    @Test
    public void signNegativeTest() {
        int k = Main.sign(-6);
        Assert.assertEquals(-1, k);
    }

    @Test
    public void signZeroTest() {
        int k = Main.sign(0);
        Assert.assertEquals(0, k);
    }
}