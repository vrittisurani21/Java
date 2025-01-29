public class CommandLineArgument {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command-line arguments found.");
            return;
        }

        for (String arg : args) {
            if (!startsWithUppercase(arg)) {
                System.out.println("Error: Argument '" + arg + "' does not start with an uppercase letter.");
                System.exit(1); // Terminate the program with an error code
            }
        }

        System.out.println("All arguments are valid.");
    }

    private static boolean startsWithUppercase(String s) {
        if (s.isEmpty()) {
            return false;
        }
        char firstChar = s.charAt(0);
        return Character.isUpperCase(firstChar);
    }
}