import codespace.TemperatureConverter;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test {
    private static TemperatureConverter converter;

    @Parameterized.Parameter
    public double expected;
    @Parameterized.Parameter(1)
    public double temperature;

    @Parameterized.Parameters(name = "{index} : convert {1} = {0} }")
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
                {300.2, 27.1},
                {0.0, -273.2},
                {273.2, 0},
                {273.0, -0.2}}
        );
    }

    @BeforeClass
    public static void init() {
        converter = new TemperatureConverter();
    }

    @org.junit.Test
    public void testConertCtoK() {
        double result = converter.convertCtoK(temperature);
        assertEquals(expected, result, 0.01);
    }
}
