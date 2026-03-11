class CharacterPatternMap {
    char character;
    String[] pattern;

    // Constructor
    public CharacterPatternMap(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }
}

public class OopsBannerUC7 {

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
            "   ***   ",
            " **   ** ",
			"**     **",
			"**     **",
			"**     **",
			"**     **",
			"**     **",
            " **   ** ",
			"   ***   "
        };

        String[] P = {
            "******   ",
            "**    ** ",
			"**     **",
			"**    ** ",
            "******   ",
            "**       ",
            "**       ",
			"**       ",
			"**       "
        };

        String[] S = {
            "   ***** ",
            " **      ",
            "**       ",
			" **      ",
            "   ***   ",
			"      ** ",
			"       **",
			"      ** ",
            " *****   "
        };

        String[] space = {
            "     ",
            "     ",
            "     ",
            "     ",
			"     ",
			"     ",
			"     ",
			"     ",
            "     "
        };

        CharacterPatternMap[] maps = {
            new CharacterPatternMap('O', O),
            new CharacterPatternMap('P', P),
            new CharacterPatternMap('S', S),
            new CharacterPatternMap(' ', space)
        };

        return maps;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap m : maps) {
            if (m.character == ch) {
                return m.pattern;
            }
        }
        return null;
    }

    public static void printMessage(String message, CharacterPatternMap[] maps) {

        int height = 9;

        for (int row = 0; row < height; row++) {
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, maps);
                if (pattern != null) {
                    System.out.print(pattern[row] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        printMessage("OOPS", maps);
    }
}