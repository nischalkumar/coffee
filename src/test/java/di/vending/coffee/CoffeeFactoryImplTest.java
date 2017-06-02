package di.vending.coffee;

import di.vending.coffee.coffee.CoffeeType;
import di.vending.coffee.exception.PriceLessException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by nischal.k on 02/06/17.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class CoffeeFactoryImplTest {
    private final CoffeeFactory coffeeFactory = new CoffeeFactoryImpl();

    @Test
    public void vend() {
        int change = (int)coffeeFactory.vend(CoffeeType.black, 10000);
        Assert.assertEquals(9950, change);
    }

    @Test(expected = PriceLessException.class)
    public void vendExpectPriceLes() throws Exception {
        coffeeFactory.vend(CoffeeType.black, 5);
    }

}