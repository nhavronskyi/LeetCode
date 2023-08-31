package easy;

import org.example.june.easy.ConvertTheTemperature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertTheTemperatureTest {
    @Test
    public void test() {
        ConvertTheTemperature temperature = new ConvertTheTemperature();

        double test1 = 36.50;
        double test2 = 122.11;


        double[] ans1 = new double[]{309.65000, 97.70000};
        double[] ans2 = new double[]{395.26000, 251.79800};

        Assertions.assertArrayEquals(ans1, temperature.convertTemperature(test1));
        Assertions.assertArrayEquals(ans2, temperature.convertTemperature(test2));
    }
}
