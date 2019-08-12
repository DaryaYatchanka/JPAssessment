
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Stack;

public class Main {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;

        String answer;
        while ((line = in.readLine()) != null) {
            isBalance(line);
        }
    }

    public static void isBalance(String line) {
        char[] c = line.toCharArray();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                if ((i != 0 && c[i - 1] != ':') || (i != c.length - 1 && c[i + 1] != ':')) {
                    stack.push(")");

                }
            } else if (')' == (c[i])) {
                if ((i != 0 && c[i - 1] != ':') || (i != c.length - 1 && c[i + 1] != ':')) {
                    if (stack.isEmpty()) {
                        stack.push(")");
                        break;
                    }
                    stack.pop();
                }

            }

        }
        if (stack.empty()) {
            System.out.println("YES");
            stack.clear();
        } else {
            System.out.println("NO");
            stack.clear();
        }


    }

}
