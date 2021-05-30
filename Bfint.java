import java.util.Scanner;

class Bfint {

    private String code = "";
    private byte[] memory = new byte[30_000];
    private int ptr = 0;
    private Scanner sc = new Scanner(System.in);

    Bfint(String input) {
        code = input;
    }

    public int getPtr() {
        return ptr;
    }

    public char getValue() {
        return (char)memory[ptr];
    }

    public void run() {

        for (int i = 0; i < code.length(); i++) {

            switch (code.charAt(i)) {

                case '>':
                    ptr = ptr == code.length() ? 0 : ptr + 1;
                    break;
                case '<':
                    ptr = ptr == 0 ? code.length() : ptr - 1;
                    break;
                case '+':
                    memory[ptr]++;
                    break;
                case '-':
                    memory[ptr]--;
                    break;
                case '.':
                    System.out.print(getValue());
                    break;
                case ',':
                    memory[ptr] = sc.nextByte();
                    break;
                case '[':
                    int counter = 0;
                    if (memory[ptr] == 0) {
                        i++;
                        while (code.charAt(i) != ']' || counter > 0) {

                            if (code.charAt(i) == '[') {
                                counter++;
                            }
                            if (code.charAt(i) == ']') {
                                counter--;
                            }
                            i++;

                        }

                    }
                    break;

                case ']':
                    int flag = 0;
                    if (memory[ptr] != 0) {
                        i--;
                        while (code.charAt(i) != '[' || flag > 0) {

                            if (code.charAt(i) == '[') {
                                flag--;
                            }
                            if (code.charAt(i) == ']') {
                                flag++;
                            }
                            i--;

                        }
                        i--;
                    }
                    break;
            }

        }
        // sc.close();
    }
}