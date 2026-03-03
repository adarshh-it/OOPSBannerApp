public class OOPSBannerArray {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

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
    }
}