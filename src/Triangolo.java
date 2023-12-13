public class Triangolo extends Forma{

    private FormaEnum formaEnum;

    public Triangolo( FormaEnum formaEnum) {
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
        System.out.println("L'area del triangolo è = ");
        return (getFormaEnum().TRIANGOLO.getBase() * getFormaEnum().TRIANGOLO.getAltezza()) / 2;
    }
}
