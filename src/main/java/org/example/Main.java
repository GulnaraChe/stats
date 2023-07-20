package org.example;

public class Main {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double calculateAverageSales(int[] sales) {
        int totalSales = 0;
        for (int sale : sales) {
            totalSales += sale;
        }
        return (double) totalSales / sales.length;
    }

    public static void Main() {
        int[] sales = {2, 5, 10, 7, 8, 3, 6, 9, 1, 4, 12, 11};
        int sumSales = calculateSum(sales);
        double averageSales = calculateAverageSales(sales);
        int maxSalesIndex = 0;
        int minSalesIndex = 0;
        int belowAverageCount = 0;
        int bigAverageCount = 0;
        int maxSales = sales[0];

        //минимальная продажа
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < sales[minSalesIndex]) {
                minSalesIndex = i;
            }
        }
        //максимальная продажа
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxSalesIndex = i;
            }
        }
        //меньше среднего
        for (int sale : sales) {
            if (sale < averageSales) {
                belowAverageCount++;
            }
        }
        //выше среднего
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                bigAverageCount++;
            }
        }

        int MaxMonthNumber = maxSalesIndex + 1;
        int MinMonthNumber = minSalesIndex + 1;

        System.out.println("Сумма всех продаж равна ");
        System.out.print(sumSales);
        System.out.println("Средняя сумма в месяц равна ");
        System.out.print(averageSales);
        System.out.println("Номер месяца в котором больше всего продаж: ");
        System.out.print(maxSalesIndex);
        System.out.println("Номер месяца в котором меньше всего продаж: ");
        System.out.print(minSalesIndex);
        System.out.println("Месяца которые ниже среднего: ");
        System.out.print(belowAverageCount);
        System.out.println("Месяца которые выше среднего: ");
        System.out.print(bigAverageCount);
    }
}