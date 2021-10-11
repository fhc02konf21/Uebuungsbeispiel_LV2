public class WinterreifenpflichtDemo {

    public static void main(String[] args) {
        int temperatur = 12;
        boolean rutschigeFahrbahn = true;

        boolean winterreifenPflicht = isWinterreifenPflicht(temperatur, rutschigeFahrbahn);
        printWinterreifenwahl(winterreifenPflicht);
        // überprüfe kurze Variante der Methode
        boolean winterreifenPflicht2 = isWinterreifenPflicht2(temperatur, rutschigeFahrbahn);
        printWinterreifenwahl(winterreifenPflicht2);

        printWinterreifenwahl(isWinterreifenPflicht(3, false));
        printWinterreifenwahl(isWinterreifenPflicht(6, true));
        printWinterreifenwahl(isWinterreifenPflicht(6, false));
    }

    /**
     * Gibt zurück, ob eine Winterreifenpflicht herrscht
     *
     * @param temperatur        Temperatur
     * @param rutschigeFahrbahn Fahrbahnverhältnis
     * @return                  ob Winterreifenpflicht besteht oder nicht
     */
    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {
        if ((rutschigeFahrbahn && temperatur < 10) || temperatur < 4) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Diese Methode ist die abegekürzte Variante der Methode "isWinterreifenpflicht"
     *
     * @param temperatur        Temperatur
     * @param rutschigeFahrbahn Fahrbahnverhältnis
     * @return                  ob Winterreifenpflicht besteht oder nicht
     */
    public static boolean isWinterreifenPflicht2(int temperatur, boolean rutschigeFahrbahn) {
        return (rutschigeFahrbahn && temperatur < 10) || temperatur < 4;
    }

    /**
     * Textausgabe, ob Winterreifen notwendig sind oder nicht
     * @param isWinterreifenpflicht Ergebnis der Methode isWinterreifenpflicht
     */
    public static void printWinterreifenwahl(boolean isWinterreifenpflicht) {
        if (isWinterreifenpflicht) {
            System.out.println("Bitte Winterreifen verwenden");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich");
        }
    }
}
