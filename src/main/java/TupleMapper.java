import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import java.util.stream.Collectors;


public class TupleMapper {

    private final String[][] romanTable= {{"I","II","III","IV","V","VI","VII","VIII","IX"},
            {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
            {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
            {"M","MM","MMM"}};

    private int[][] brokenNumber;

    public TupleMapper(int[][] brokenNumber) {
        this.brokenNumber = brokenNumber;
    }

    public String getNumber(){
        return stream(brokenNumber).map(s-> romanTable[s[1]][s[0]-1]).reduce("", String::concat);
    }

}
