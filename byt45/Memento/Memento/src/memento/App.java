package memento;

public class App {
    public static void main(String[] args) {
        memory mmemory = new memory();
        NotePad notePad = new NotePad();
        notePad.add("S");
        notePad.add("E");
        notePad.add("D");
        notePad.add("A");


        NotePadMemento seda = notePad.register();
        mmemory.add(seda);

        notePad.print();

        notePad.add("NUR");
        registerVersion(mmemory, notePad);


        /** if i wrote someting wrong ?
        SEDANUR?  **/

        notePad.add("?");
        notePad.print();


        /**then program goes back to last save in memory
        and back to SEDANUR **/

        notePad.getback(mmemory.getLastVersion());
        registerVersion(mmemory, notePad);

        notePad.add(" SEVILMISDAL");
        registerVersion(mmemory, notePad);

        /** I made it "SEDANUR SEVILMISDAL!"
         */

        notePad.add("!");
        notePad.print();

        /**
       fix the mistake
         */
        notePad.getback(mmemory.getLastVersion());
        notePad.print();

        notePad.getback(mmemory.getLastVersion());
        notePad.print();

        /**if i will get back it will give an exception

        /*
         notePad.getback(mmemory.getLastVersion());
        notePad.print();
         **/

    }

        private static void registerVersion (memory mmemory, NotePad notePad){
            NotePadMemento memento = notePad.register();
            mmemory.add(memento);

            notePad.print();
        }

}
