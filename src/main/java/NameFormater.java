import java.util.regex.Pattern;

public class NameFormater {

    public static String captureName(String str) {
        char[] cs = str.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }

    public static String getLengthString(String oriString, int length) {
        String retString = oriString;
        if (oriString.length() == length) {
            return retString;
        } else {
            for (int i = 0; i < length - oriString.length(); i++) {
                retString = "0" + retString;
            }
        }
        return retString;
    }

    public static void main(String[] args) {
        int index = 47;
        String original = "permutations-ii";

        String elems[] = original.split(Pattern.quote("-"));

        StringBuilder name = new StringBuilder("S" + getLengthString(String.valueOf(index), 4));

        for (String elem : elems) {
            name.append("_");
            name.append(captureName(elem));
        }

        System.out.println(name);
    }
}
