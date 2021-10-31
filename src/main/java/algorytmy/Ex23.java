package algorytmy;

public class Ex23 {
    public static void main(String[] args) {

        double cm = 4.44;
        double cm1 = 32.21;
        double cm2 = 153.65;
        double cm3 = 672175.12;

        System.out.println(convertToBritishMetricSystem("inch", cm));
        System.out.println(convertToBritishMetricSystem("foot", cm1));
        System.out.println(convertToBritishMetricSystem("yard", cm2));
        System.out.println(convertToBritishMetricSystem("mile", cm3));
    }

    public static double convertToBritishMetricSystem(String convertTo, double centimeter) {

        double result = 0;

        if (convertTo.equals("inch")) {
            result = centimeter / 2.54;                                   //przelicznik na cale
        } else if (convertTo.equals("foot")) {
            result = (centimeter / 2.54) / 12;                          //przelicznik na stopy
        } else if (convertTo.equals("yard")) {
            result = ((centimeter / 2.54) / 12) / 3;                  //przelicznik na jardy
        } else if (convertTo.equals("mile")) {
            result = (((centimeter / 2.54) / 12) / 3) / 1760;       //przelicznik na mile
        } else {
            result = centimeter;                                  //jesli zaden z przelicznikow nie jest podany zwracamy centymetry
        }

        return result;
    }
}

//23. Napisz program zamieniajacy długosc z metrów na jednostki z wysp Brytyjskich (stopy,
//cale, jardy i mile).
// 1 cal = 2.54 cm
// 1 stopa = 12 cali
// 1 jard = 3 stopy
// 1 mila = 1760 jardów