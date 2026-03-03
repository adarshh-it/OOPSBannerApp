public class OOPSBannerStatic {

    public static void main(String[] args) {
        printWord("OOPS");
    }

    public static void printWord(String word) {

        if (word.equals("OOPS")) {

            String[] banner = {

                    String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
                    String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                    String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                    String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                    String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                    String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                    String.join("   ", " ***** ", " ***** ", " ***** ", " ***** ")

            };

            for (String line : banner) {
                System.out.println(line);
            }

        } else {
            System.out.println("Banner not available for this word.");
        }
    }
}