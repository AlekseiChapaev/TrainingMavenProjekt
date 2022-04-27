import org.apache.commons.lang3.StringUtils;

public class Main {

    public static String getAbbr(String str, int size) {

        return str.substring(0, size - 1) + "...";
    }
}
