public class Translat {

    public static String components(int item) {
        return (arabicToRoman(item - item % 10) + arabicToRoman(item % 10));
    }
    public static String arabicToRoman(int item) {
        int arabic = item;
        String result = switch (arabic) {
            case 1:
                yield Roman.I.name();
            case 2:
                yield Roman.II.name();
            case 3:
                yield Roman.III.name();
            case 4:
                yield Roman.IV.name();
            case 5:
                yield Roman.V.name();
            case 6:
                yield Roman.VI.name();
            case 7:
                yield Roman.VII.name();
            case 8:
                yield Roman.VIII.name();
            case 9:
                yield Roman.IX.name();
            case 10:
                yield Roman.X.name();
            case 20:
                yield Roman.XX.name();
            case 30:
                yield Roman.XXX.name();
            case 40:
                yield Roman.XL.name();
            case 50:
                yield Roman.L.name();
            case 60:
                yield Roman.LX.name();
            case 70:
                yield Roman.LXX.name();
            case 80:
                yield Roman.LXXX.name();
            case 90:
                yield Roman.XC.name();
            case 100:
                yield Roman.C.name();
            default:
                yield components(item);
        };
        return result;
    }

    public static int romanToArabic(String item) {
        String roman = item;
        int result = switch (roman) {
            case "I":
                yield Roman.I.getData();
            case "II":
                yield Roman.II.getData();
            case "III":
                yield Roman.III.getData();
            case "IV":
                yield Roman.IV.getData();
            case "V":
                yield Roman.V.getData();
            case "VI":
                yield Roman.VI.getData();
            case "VII":
                yield Roman.VII.getData();
            case "VIII":
                yield Roman.VIII.getData();
            case "IX":
                yield Roman.IX.getData();
            case "X":
                yield Roman.X.getData();
            default:
                yield 0;
        };
        return result;
    }
}
