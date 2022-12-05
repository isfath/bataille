public class App {
    private static char sign(int comparisonResult) {
        return "<=>".charAt(1 + comparisonResult);
    }

    private static String compare(SimpleCarte c1, SimpleCarte c2) {
        return c1.toEmoji() + sign(c1.compareTo(c2)) + c2.toEmoji();
    }

    public static void main(String[] args) throws Exception {
        SimpleCarte c1 = new SimpleCarte(Couleur.Carreau, Point.N10);
        SimpleCarte c2 = new SimpleCarte(Couleur.Carreau, Point.N2);
        System.out.println(compare(c1, c1));
        System.out.println(compare(c1, c2));
        System.out.println(compare(c2, c1));
        for (SimpleCarte c : Paquet.melange())
            System.out.print(c.toEmoji());
        System.out.println();
    }
}
