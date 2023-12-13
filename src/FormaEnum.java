public enum FormaEnum {
    TRIANGOLO("Triangolo", 2, 4),
    RETTANGOLO("Rettangolo", 3, 4);

    private final String nome;

    private final int base;

    private final int altezza;

    FormaEnum(String nome, int base, int altezza) {
        this.nome = nome;
        this.base = base;
        this.altezza = altezza;
    }

    public String getNome() {
        return nome;
    }

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }
}
