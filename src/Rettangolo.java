public class Rettangolo extends Forma {

    private FormaEnum formaEnum;

    public Rettangolo(FormaEnum formaEnum) {
        super(formaEnum.getNome());
        this.formaEnum = formaEnum;
    }

    public FormaEnum getFormaEnum() {
        return formaEnum;
    }

    public void setFormaEnum(FormaEnum formaEnum) {
        this.formaEnum = formaEnum;
    }

    @Override
    public double calcolArea() {
        System.out.println("L'area del rettangolo è = ");
        return (formaEnum.RETTANGOLO.getBase() * formaEnum.RETTANGOLO.getAltezza());
    }


}
