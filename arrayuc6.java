public class arrayuc6 {

     public static String[] getOPattern(){
        return new String[]{
            "  ***   " ,
            " *   *  " ,
            " *   *  " ,
            " *   *  " ,
            " *   *  " ,
            " *   *  " ,
            "  ***   " ,
        };
    }
    public static String[] getPPattern(){
        return new String[]{
            " *****  " ,
            " *    * " ,
            " *    * " ,
            " *****  " ,
            " *       ",
            " *       ",
            " *       ",
        };
    }
    public static String[] getSPattern(){
        return new String[]{
            "  ***** ",
            " *      ",
            " *      ",
            "  ***** ",
            "       *",
            "       *",
            "  ***** "
        };
    }
    public static void main(String[] args) {
        // Declare String Arrays to hold patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble each line of the banner to create "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + " " +
                oPattern[i] + " " +
                pPattern[i] + " " +
                sPattern[i]
            );
        }
    }

}