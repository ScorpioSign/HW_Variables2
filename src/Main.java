public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
         int i = 43600;
         byte b = -100;
         short sh = -25600;
         long l = 1234567894238L;
         float f = 1.2356f;
         double d = 25.1234568654;
        System.out.println("Значение переменной i с типом int равно "+ i);
        System.out.println("Значение переменной b с типом byte равно "+ b);
        System.out.println("Значение переменной sh с типом short равно "+ sh);
        System.out.println("Значение переменной l с типом long равно "+ l);
        System.out.println("Значение переменной f с типом float равно "+ f);
        System.out.println("Значение переменной d с типом double равно "+ d);
    }

    public static void task2 () {
        System.out.println("Задача 2");
         float f = 27.12f;
         long l = 987678965549L;
         double d = 2.786;
         short sh1 = 569;
         short sh = -159;
         int i = 27897;
         byte b = 67;


    }
    public static void task3 () {
        System.out.println("Задача 3");
        int studentsLP = 23;
        int studentsAS = 27;
        int studentsEA = 30;
        int allSheets = 480;
        int oneStudentSheets = allSheets / (studentsLP + studentsAS + studentsEA);
        System.out.println("На каждого ученика рассчитано " + oneStudentSheets+" листов бумаги");


    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte time = 2;
        byte bottles2min = 16;
        int speed = bottles2min / time;
        int numIn20min = speed * 20;
        int numInDay = speed * 60 * 24;
        int numIn3Days = numInDay * 3;
        int numInMonth = numInDay * 30;
        System.out.println("За 20 минут машина произвела " + numIn20min + " штук бутылок");
        System.out.println("За сутки машина произвела " + numInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + numIn3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + numInMonth + " штук бутылок");

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int generalNumPainting = 120;
        int whitePaintingForClass = 2;
        int brownPaintingForClass = 4;
        int numberClasses = generalNumPainting / (whitePaintingForClass + brownPaintingForClass);
        int sumWhitePainting = whitePaintingForClass * numberClasses;
        int sumBrownPainting = brownPaintingForClass * numberClasses;
        System.out.println("В школе, где " + numberClasses +" классов, нужно " + sumWhitePainting + "банок белой краски и " + sumBrownPainting +" банок коричневой краски");

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int numBananas = 5;
        int bananaMass = 80;
        int volumeMilk = 200;
        int milkMass_100ml = 105;
        int numIce_cream = 2;
        int ice_creamMass = 100;
        int numEggs = 4;
        int eggMass =70;
        int milkMass = milkMass_100ml * volumeMilk/100;
        float breakfastWeight_G = numBananas * bananaMass + milkMass + numIce_cream * ice_creamMass + numEggs * eggMass;
        float breakfastWeight_KG = breakfastWeight_G / 1000;

        System.out.println("Вес завтрака в граммах: " + breakfastWeight_G + " г");
        System.out.println("Вес завтрака в килограммах: " + breakfastWeight_KG + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int redundantWeight = 7;
        int lossWeight1 = 250;
        int lossWeight2 = 500;
        int grPerKg = 1000;
        float lossWeight_1 = lossWeight1/(float)grPerKg;
        float lossWeight_2 = lossWeight2/(float)grPerKg;
        float daysOnDiet1 = redundantWeight / lossWeight_1;
        float daysOnDiet2 = redundantWeight / lossWeight_2;
        float lossOnAverage = (lossWeight_1 + lossWeight_2) / 2;
        float daysOnAverage = redundantWeight / lossOnAverage;
        System.out.println("При потере веса 250г в день потребуется " + daysOnDiet1 + " дней диеты");
        System.out.println("При потере веса 500г в день потребуется " + daysOnDiet2 + " дней диеты");
        System.out.println("В среднем потребуется " + daysOnAverage + " дней диеты");

    }
    public static void task8 () {
        System.out.println("Задача 8");
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;
        double newSalaryMasha = salaryMasha * 1.1;
        double newSalaryDenis = salaryDenis * 1.1;
        double newSalaryKristina = salaryKristina * 1.1;
        double incomeIncreaseMashaPerYear = (newSalaryMasha - salaryMasha) * 12;
        double incomeIncreaseDenisPerYear = (newSalaryDenis - salaryDenis) * 12;
        double incomeIncreaseKristinaPerYear = (newSalaryKristina - salaryKristina) * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + incomeIncreaseMashaPerYear + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + incomeIncreaseDenisPerYear + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + incomeIncreaseKristinaPerYear + " рублей");
    }
}