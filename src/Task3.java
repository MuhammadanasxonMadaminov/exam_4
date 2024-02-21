import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Pattern p =Pattern.compile("(\\+)(\\d{3})(\\d{2})(\\d{3})(\\d{2})(\\d{2})");

        Matcher m=p.matcher(sc.next());

        if (m.matches()) {
            System.out.println(m.group(0));
        }
    }
}
