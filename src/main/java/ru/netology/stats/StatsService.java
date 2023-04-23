package ru.netology.stats;

public class StatsService {

    public int sumOfAllSalles(int[] sale) {
        int sum = 0;

        for (int i = 0; i < sale.length; i++) {
            sum = sum + sale[i];
        }
        return sum;
    }

    public int mediumSumOnMounth(int[] sale) {
        int sum = 0;
        int mediumSum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum = sum + sale[i];
            mediumSum = sum / 12;
        }
        return mediumSum;
    }

    public int maxSale(int[] sale) {
        int maxSale = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxSale]) {
                maxSale = i;
            }
        }
        return maxSale + 1;
    }

    public int minSale(int[] sale) {
        int minSale = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[minSale]) {
                minSale = i;
            }
        }
        return minSale + 1;
    }

    public int belowAverageSales(int[] sale) {
        int minSales = mediumSumOnMounth(sale); //Переменная, которая знает результат существующей функции.
        int belowAverageSales = 0; //количество месяцев, в которых продажи были ниже ср.
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < minSales) {
                belowAverageSales = belowAverageSales + 1;
            }
        }
        return belowAverageSales;
    }

    public int aboveAverageSales(int[] sale) {
        int maxSales = mediumSumOnMounth(sale); //Переменная, которая знает результат существующей функции.
        int aboveAverageSales = 0; //количество месяцев, в которых продажи были выше cр.
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > maxSales) {
                aboveAverageSales = aboveAverageSales + 1;
            }
        }
        return aboveAverageSales;
    }

}
