public class RomanNumeral {

    private int number;
    private String romanNumeral;

    public RomanNumeral(int number) {
        this.number= number;
        romanNumeral= getNumberInRoman();
    }

    private String getNumberInRoman(){
        return (new TupleMapper(new NumberBreaker(number).breakdown())).getNumber();
    }

    @Override
    public String toString() {
        return romanNumeral;
    }

    public static void main(String[] args) {
        RomanNumeral test = new RomanNumeral(1671);
        System.out.println(test);
    }


}
