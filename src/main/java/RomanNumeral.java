public class RomanNumeral {

    private int number;

    public RomanNumeral(int number) {
        this.number= number;

    }

    public String toRoman() throws Exception {
        return (new TupleMapper(new NumberBreaker(number).breakdown())).getRomanNumber();
    }


}
