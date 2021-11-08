package Chain;

public class DivideNumbers implements Chain{
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain NextChain) {
        this.nextInChain = NextChain;
    }

    @Override
    public void calculator(Numbers request) {
        if (request.getCalcWanted()== "Divide") {
            System.out.println(request.getNumber1() + "/" + request.getNumber2() +
                    "=" + (request.getNumber1() / request.getNumber2()));
        } else {
            nextInChain.calculator(request);
        }
    }


}