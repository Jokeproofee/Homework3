public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        byte lesson = 8;
        System.out.println("Уроков " + lesson);
        short course = 9;
        System.out.println("Курсов " + course);
        int months = 11;
        System.out.println("Месяцев " + months);
        long year = 365L;
        System.out.println("Дней в году " + year);
        float hour = 1.5f;
        System.out.println("Длительность урока " + hour + " Часа");
        double pi = 3.1415926535;
        System.out.println("Число ПИ " + pi);

        // Задача 2
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987_678_965_549L;
        System.out.println(b);
        byte c = 2;
        System.out.println(c);
        short d = 786;
        System.out.println(d);
        boolean e = c > 10;
        System.out.println(e);
        short f = 569;
        System.out.println(f);
        short g = -159;
        System.out.println(g);
        short h = 27897;
        System.out.println(h);
        byte i = 67;
        System.out.println(i);

        // Задача 3
        System.out.println("Задача 3");
        byte lyudmilaStudents = 23;
        byte annaStudents = 27;
        byte ekaterinaStudents = 30;
        short totalPaper = 480;
        System.out.println("На каждого ученика рассчитано " + totalPaper / (lyudmilaStudents + annaStudents + ekaterinaStudents) + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        byte machinePerformance2Min = 16;
        byte machinePerformance1Min = (byte) (machinePerformance2Min / 2);
        byte min20 = 20;
        System.out.println("За " + min20 + " минут машина произвела бутылок " + (machinePerformance1Min * min20) + " штук");

        byte minInHour = 60;
        byte hourInDay = 24;
        byte dayInMonth = 30;
        short machinePerformanceInHour = (short) (minInHour * machinePerformance1Min);
        short machinePerformanceInDay = (short) (machinePerformanceInHour * hourInDay);
        System.out.println("За сутки машина произвела бутылок " + machinePerformanceInDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + (machinePerformanceInDay * 3) + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + (machinePerformanceInDay * dayInMonth) + " штук");

        // Задача 5
        System.out.println("Задача 5");
        byte totalPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte totalClasses = (byte) (totalPaint / (whitePaint + brownPaint));
        byte totalWhitePaint = (byte) (totalClasses * whitePaint);
        byte totalBrownPaint = (byte) (totalClasses * brownPaint);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte rawEggs = 4;

        int bananasWeight = bananas * 80;
        int milkWeight = milk / 100 * 105;
        int iceCreamWeight = iceCream * 100;
        int rawEggsWeight = rawEggs * 70;
        float gramInKg = 1000f;

        int totalWeightGram = bananasWeight + milkWeight + iceCreamWeight + rawEggsWeight;
        System.out.println("Общий вес завтрака (гр) - " + totalWeightGram + " грамм");
        float totalWeightKg = totalWeightGram / gramInKg;
        System.out.println("Общий все завтрака (кг) - " + totalWeightKg + " килограмм");

        // Задача 7
        System.out.println("Задача 7");
        byte weightLoss = 7;
        int weightGram250 = weightLoss * 1000 / 250;
        System.out.println("Если худеть по 250 грамм в день,понадобится - " + weightGram250 + " дней");
        int weightGram500 = weightLoss * 1000 / 500;
        System.out.println("Если худеть по 500 грамм в день,понадобится - " + weightGram500 + " дней");
        int sumDays = weightGram250 + weightGram500;
        int averageDays = sumDays / 2;
        System.out.println("В среднем для похудения потребуется - " + averageDays + " день");

        // Задача 8
        System.out.println("Задача 8");
        int mashaGets = 67_760;
        int denisGets = 83_690;
        int kristinaGets = 76_230;

        int mashaRaising = (int) (mashaGets + (mashaGets * 0.10));
        int mashaDifference = mashaRaising - mashaGets;
        System.out.println("Маша теперь получает - " + mashaRaising + " рублей." + "Годовой доход вырос на - " + mashaDifference + " рублей.");

        int denisRaising = (int) (denisGets + (denisGets * 0.10));
        int denisDifference = denisRaising - denisGets;
        System.out.println("Денис теперь получает - " + denisRaising + " рублей." + "Годовой доход вырос на - " + denisDifference + " рублей.");

        int kristinaRaising = (int) (kristinaGets + (kristinaGets * 0.10));
        int kristinaDifference = kristinaRaising - kristinaGets;
        System.out.println("Кристина теперь получает - " + kristinaRaising + " рублей." + "Годовой доход вырос на - " + kristinaDifference + " рублей.");
    }
}