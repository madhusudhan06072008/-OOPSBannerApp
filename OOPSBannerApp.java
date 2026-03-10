import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * UC8 - Use Map for character patterns and render via function
 */
public class OOPSBannerApp {

    public static Map<Character, String[]> createPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[] {
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        });

        patternMap.put('P', new String[] {
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*",
            "*",
            "*"
        });

        patternMap.put('S', new String[] {
            "*****",
            "*",
            "*",
            "*****",
            "    *",
            "    *",
            "*****"
        });

        return patternMap;
    }

    public static void renderBanner(String word, Map<Character, String[]> patternMap) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                }
            }

            System.out.println(line.toString().trim());
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = createPatternMap();
        renderBanner("OOPS", patternMap);
    }
}