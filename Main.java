public class Main {

    public static void testMoveInstr() {
        String code = ">>>";
        Bfint b = new Bfint(code);
        b.run();
        if (b.getPtr() != 3) {
            System.out.println("> < instructions don't work !");
        } else {
            System.out.println("> < tests passed");
        }
    }

    public static void testAddInstr() {
        String code = "++++--";
        Bfint b = new Bfint(code);
        b.run();
        if (b.getValue() != 2) {
            System.out.println("> < instructions don't work !");
        } else {
            System.out.println("+ - tests passed");
        }
    }

    public static void testIntputInstr() {
        String code = ",,.";
        Bfint b = new Bfint(code);
        b.run();

    }

    public static void testLoopInstr() {
        String code = "+++[-]";
        Bfint b = new Bfint(code);
        b.run();
        if (b.getValue() != 0) {
            System.out.println("[ ] tests failed");
        } else {
            System.out.println("[ ] tests passed.");
        }
    }

    public static void main(String[] args) {
        String code = "+[-[<<[+[--->]-[<<<]]]>>>-]>-.---.>..>.<<<<-.<+.>>>>>.>.<<.<-.";
        Bfint b = new Bfint(code);
        b.run();

    }

}
