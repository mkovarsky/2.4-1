package ru.netology.stats;

public class StatsService {
    //  Сумма всех продаж
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    // Средняя сумма продаж в месяц
    public long calculateAverage(long[] sales) {
        long average = 0;
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
            average = sum / sales.length;
        }
        return average;
    }

    // Номер месяца, в котором был пик продаж
    public long indexForMaxSales(long[] sales) {
        long index = 0;
        long indexForMax = 0;
        long maxSales = sales[0];
        for (long sale : sales) {
            index = index + 1;
            if (maxSales <= sale) {
                maxSales = sale;
                indexForMax = index;
            }
        }
        return indexForMax;
    }

    // Номер месяца, в котором был минимум продаж
    public long indexForMinSales(long[] sales) {
        long index = 0;
        long indexForMin = 0;
        long minSales = sales[0];
        for (long sale : sales) {
            index = index + 1;
            if (minSales > sale) {
                minSales = sale;
                indexForMin = index;
            }
        }
        return indexForMin;
    }

    // Кол-во месяцев, в которых продажи были ниже среднего
    public long monthsOfSalesBelowAverage(long[] sales) {
        long average = 0;
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
            average = sum / sales.length;
        }
        long numberOfMonths = 0;
        long currentSales;
        for (long sale : sales) {
            currentSales = sale;
            if (currentSales < average)
                numberOfMonths = numberOfMonths + 1;
        }
        return numberOfMonths;
    }

    // Кол-во месяцев, в которых продажи были выше среднего
    public long monthsOfSalesAboveAverage(long[] sales) {
        long average = 0;
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
            average = sum / sales.length;
        }
        long numberOfMonths = 0;
        long currentSales;
        for (long sale : sales) {
            currentSales = sale;
            if (currentSales > average)
                numberOfMonths = numberOfMonths + 1;
        }
        return numberOfMonths;
    }
}