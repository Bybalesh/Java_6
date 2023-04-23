import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldsumOfAllSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumOfAllSalles(sale);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldMediumsumOfMounth() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        int actualSum = service.mediumSumOnMounth(sale);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldPeakSale() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedPeak = 8;
        int actualPeak = service.maxSale(sale);
        Assertions.assertEquals(expectedPeak, actualPeak);
    }

    @Test
    public void shouldMinSale() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 9;
        int actualMin = service.minSale(sale);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void shouldBelowTheAverage() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowTheAverage = 5;
        int actualBelowTheAverage = service.belowAverageSales(sale);
        Assertions.assertEquals(expectedBelowTheAverage, actualBelowTheAverage);
    }

    @Test
    public void shouldAboveTheAverage() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveTheAverage = 5;
        int actualAboveTheAverage = service.belowAverageSales(sale);
        Assertions.assertEquals(expectedAboveTheAverage, actualAboveTheAverage);
    }
}
