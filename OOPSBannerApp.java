/**
 * OOPSBannerApp
 * UC4 - Store banner lines in array and print using loop
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] banner = {
            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*"),
            String.join(" ", "*   *", "*   *", "*   *", "*"),
            String.join(" ", "*   *", "*   *", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*", "    *"),
            String.join(" ", "*   *", "*   *", "*", "    *"),
            String.join(" ", "*****", "*****", "*", "*****")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}