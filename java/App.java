public class App {
    private static char sign(int comparisonResult) {
        return "<=>".charAt(1 + comparisonResult);
    }

    private static String compare(Carte c1, Carte c2) {
        return c1.toString() + sign(c1.compareTo(c2)) + c2;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(Nombre.valueOf(7));
        Carte c1 = new Carte(Couleur.Carreau, Nombre.N10);
        Carte c2 = new Carte(Couleur.Carreau, Nombre.N2);
        System.out.println(compare(c1, c1));
        System.out.println(compare(c1, c2));
        System.out.println(compare(c2, c1));
    }
}
