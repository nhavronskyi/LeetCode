package year_2023.unsorted.easy;

import org.example.year_2023.june.easy.DesignParkingSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DesignParkingSystemTest {
    @Test
    public void test() {
        int[] parkingRange = {1, 1, 0};

        DesignParkingSystem parkingSystem =
                new DesignParkingSystem(parkingRange[0], parkingRange[1], parkingRange[2]);

        List<Boolean> test = List.of(
                parkingSystem.addCar(1),
                parkingSystem.addCar(2),
                parkingSystem.addCar(3),
                parkingSystem.addCar(1)
        );

        List<Boolean> ans = List.of(
                true, true, false, false
        );

        Assertions.assertEquals(ans, test);
    }
}
