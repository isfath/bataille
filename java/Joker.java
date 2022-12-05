public class Joker extends Carte {
    public static final Joker Rouge = new Joker(true);
    public static final Joker Noir = new Joker(false);

    private boolean rouge;

    @Override
    protected int nombre() {
        return 15;
    }

    @Override
    public String toString() {
        return "joker " + (rouge ? "rouge" : "noir");
    }

    @Override
    public String toEmoji() {
        int codePoint = 0x1f0cf + (rouge ? 0 : 16);
        return String.valueOf(Character.toChars(codePoint));
    }

    private Joker(boolean rouge) {
        this.rouge = rouge;
    }
}
