package org.example.stats.services;

public class SalesCalculating {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public double allSales(long[] sales) {
        double sumAll = 0;
        for (int i = 0; i < sales.length; i++){
            sumAll += sales[i];
        }
        return sumAll;
    }

    public double averageSales(long[] sales) {
        return allSales(sales) / sales.length;
    }
    public int aboveAverage(long[] sales){ //выше среднего
        int countAbove = 0;
        for (int i = 0; i < sales.length; i++){
            if (sales[i] > averageSales(sales)){
                countAbove += 1;
            }
        }
        return countAbove;
    }
    public int belowAverage(long[] sales){ //ниже среднего
        int countBelow = 0;
        for (int i = 0; i < sales.length; i++){
            if (sales[i] < averageSales(sales)){
                countBelow += 1;
            }
        }
        return countBelow;
    }
}
