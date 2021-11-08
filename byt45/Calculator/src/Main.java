import Chain.*;
/***************************************
 Chain of Responsibility BYT Project
 ***************************************/

public class Main {
    public static void main(String[] args) {
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new SubtractNumbers();
        Chain chainCal3 = new DivideNumbers();
        Chain chainCal4 = new MultNumbers();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);
        chainCal3.setNextChain(chainCal4);

        /*****************************
         for multiply write;   mult
         for Divide write  ;   divide
         for subtract wirte;   subt
         for add write     ;   add

         ******************************/

       Numbers request = new Numbers(8,3, "mult");
       chainCal1.calculator(request);

    }
}
