public enum Figure implements Valeur {
    Valet,
    Dame,
    Roi,
    As;

    @Override
    public String toString() {
        return super.toString().substring(0, 1);
    }
}
