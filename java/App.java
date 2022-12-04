public class App {
    public static void main(String[] args) throws Exception {
        Carte c1 = new Carte(Couleur.Carreau, Nombre.N10);
        Carte c2 = new Carte(Couleur.Carreau, Nombre.N10);
        System.out.println(c1);
        System.out.println(c1.equals(c2));
    }
}
