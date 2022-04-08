import java.text.NumberFormat;
import java.util.Locale;

public class FormatterObj {
    public static void main(String[] args) {
        double doubleValue = 1_234_334.980;

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(doubleValue)); // this will improve my calc

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormat.format(doubleValue));

        Locale locale = new Locale("eng", "KE");
        NumberFormat localFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(localFormat.format(doubleValue));

//        DecimalFormat df = new DecimalFormat("Ksh");
//        NumberFormat dfFormat = NumberFormat.getCurrencyInstance();
//
//        System.out.println(df(dfFormat.format(doubleValue)));

    }
}
