public class Except {
    public static int exceptions(String[] items) throws Exception {

        int arabic = 0;
        int roman = 0;

        if (items.length > 3) {
            throw new Exception("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        if (items.length < 3) {
            throw new Exception("//т.к. строка не является математической операцией");
        }

        for (int i = 0; i < 3; i = i + 2) {
            Boolean item = isNumeric(items[i]);

            if (item) {
                arabic += 1;
            } else {
                roman += 1;
            }
        }

        if (!((arabic == 2) | (roman == 2))) {
            throw new Exception("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно");
        }

        return arabic;
    }

    public static void from1to10(int a, int b) throws Exception {
        if (((a < 1) | (a > 10)) | ((b < 1) | (b > 10))) {
            throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более");
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
