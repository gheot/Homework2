public class Main {
    public static void main(String[] args) {
        byte kengoo = 100;
        short git = 1000;
        int bobo = 100000;
        long vsxo = 394949392L;
        float adto = 5.5f;
        double hert = 432.42342425;


        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float summaOfThem = firstBoxer + secondBoxer;
        System.out.println( "Общий вес двух бойцов: " + summaOfThem + " кг!");
        float differenceOfThem = secondBoxer - firstBoxer;
        System.out.println("Разница между весами бойцов: " + differenceOfThem + " кг!");



        byte bananas = 5;
        short milk = 200;
        byte icecream = 2;
        byte eggs = 4;
        var bananasWeight = bananas * 80;
        var milkWeight = (milk / 100) * 105;
        var icecreamWeight = icecream * 100;
        var eggsWeight = eggs * 70;
        float summaWeight = bananasWeight + icecreamWeight + milkWeight + eggsWeight;
        System.out.println( "Вес завтрака: " + summaWeight + " грамм");
        summaWeight = summaWeight / 1000;
        System.out.println( "Вес завтрака: " + summaWeight + " кг!");



        var athletesWeight = 7;
        athletesWeight = athletesWeight * 1000;
        var daysNumber1 = athletesWeight / 250;
        var daysNumber2 = athletesWeight / 500;
        var approximatelyDays = (daysNumber2 + daysNumber1) / 2;
        System.out.println( " В среднем потребуется " + approximatelyDays + " день для похудения");



        float MashaIncome = 67760;
        float DenisIncome = 83690;
        float KristinaIncome = 76230;
        var annualMashaIncomeBefore = MashaIncome * 12;
        var annualDenisIncomeBefore = DenisIncome * 12;
        var annualKristinaIncomeBefore = KristinaIncome * 12;
        MashaIncome = MashaIncome * 1.1f;
        DenisIncome = DenisIncome * 1.1f;
        KristinaIncome = KristinaIncome * 1.1f;
        var annualMasha = MashaIncome * 12;
        var annualDenis = DenisIncome * 12;
        var annualKristina = KristinaIncome * 12;
        var incomeDifferenceKristina = annualKristina - annualKristinaIncomeBefore;
        var incomeDifferenceDenis = annualDenis - annualDenisIncomeBefore;
        var incomeDifferenceMasha = annualMasha - annualMashaIncomeBefore;
        System.out.println( "Маша теперь получает " + MashaIncome + " рублей. Годовой доход вырос на " + incomeDifferenceMasha + " рублей.");
        System.out.println( "Денис теперь получает " + DenisIncome + " рублей. Годовой доход вырос на " + incomeDifferenceDenis + " рублей.");
        System.out.println( "Маша теперь получает " + KristinaIncome + " рублей. Годовой доход вырос на " + incomeDifferenceKristina + " рублей.");







    }
}



