package Chain;

public class Numbers {
    private int number1;
    private int number2;

    private String calculationWanted;

    public Numbers (int newnumber1, int newNumbers2, String calcWanted) {
        number1 = newnumber1;
        number2 = newNumbers2;
        calculationWanted= calcWanted;
    }

    public int getNumber1 () { return number1; }
    public int getNumber2 () { return number2; }
    public String getCalcWanted () { return calculationWanted; }

}
