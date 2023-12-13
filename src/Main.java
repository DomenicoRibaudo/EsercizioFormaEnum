public class Main {
    public static void main(String[] args) {
    Triangolo triangolo = new Triangolo(FormaEnum.TRIANGOLO);
    Rettangolo rettangolo = new Rettangolo(FormaEnum.RETTANGOLO);

        System.out.println(triangolo.calcolArea());
        System.out.println(rettangolo.calcolArea());

    }
}
