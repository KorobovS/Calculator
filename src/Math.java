public class Math {
    static int a;
    static int b;
    static int result;

    public static int[] strInt(String[] items, int arabic) throws Exception {
        if (arabic == 2) {
            a = Integer.parseInt(items[0].trim());
            b = Integer.parseInt(items[2].trim());
        } else {
            a = new Translat().romanToArabic(items[0]);
            b = new Translat().romanToArabic(items[2]);
        }

        new Except().from1to10(a, b);

        return new int[] {a, b};
    }

    public static String calculate(String[] items, int arabic) throws Exception {

        String item = items[1];
        strInt(items, arabic);

        switch (item) {
            case "+":
                result = (a + b);
                break;
            case "-":
                result = (a - b);
                break;
            case "*":
                result = (a * b);
                break;
            case "/":
                result = (a / b);
                break;
        }

        String res = Integer.toString(result);

        if (arabic == 0) {
            if (result < 0) {
                throw new Exception("Результатом работы калькулятора с римскими числами могут быть только положительные числа");
            } else {
                res = new Translat().arabicToRoman(result);
            }
        }
        return res;
    }
}
