public class NotenDemo {

    public static void main(String[] args) {
        System.out.println(getNotentext(90));
        System.out.println(getNotentext(50));
        System.out.println(getNotentext(51));
        System.out.println(getNotentext(77));
        System.out.println(getNotentext(89));
    }

    /**
     * Ermittle die Note anhand der gegebenen Punkte
     *
     * @param punkte    erzielte Punkte für die Noteermittlung
     * @return          die erzielte Note als String
     */
    public static String getNotentext(int punkte) {
        if (punkte >= 90) {
            return "Sehr Gut";
        } else if (punkte >= 78) {
            return "Gut";
        } else if (punkte >= 65) {
            return "Befriedigend";
        } else if (punkte >= 51) {
            return "Genügend";
        } else {
            return "Ungenügend";
        }
    }
}
