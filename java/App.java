public class App {
    private static char sign(int comparisonResult) {
        return "<=>".charAt(1 + comparisonResult);
    }

    private static String compare(Carte c1, Carte c2) {
        return c1.toEmoji() + sign(c1.compareTo(c2)) + c2.toEmoji();
    }

    public static void main(String[] args) throws Exception {
        Carte c1 = new Carte(Couleur.Carreau, Nombre.N10);
        Carte c2 = new Carte(Couleur.Carreau, Nombre.N2);
        System.out.println(compare(c1, c1));
        System.out.println(compare(c1, c2));
        System.out.println(compare(c2, c1));
        for (Carte c : Paquet.melange())
            System.out.print(c.toEmoji());
        System.out.println();
    }
}
