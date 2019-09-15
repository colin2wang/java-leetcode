import java.util.regex.Pattern;

public class NameFormater {

    public static String captureName(String str) {
        char[] cs = str.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }

    public static void main(String[] args) {
        String index = "S001";
        String original = "string-to-integer-atoi";

        String elems[] = original.split(Pattern.quote("-"));

        StringBuilder name = new StringBuilder(index);

        for (String elem : elems) {
            name.append("_");
            name.append(captureName(elem));
        }

        System.out.println(name);
    }
}
