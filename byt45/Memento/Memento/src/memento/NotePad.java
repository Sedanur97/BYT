package memento;

public class NotePad {

    private String string;

    public NotePad (){
        string = "";
    }


    public NotePad(String string) {
        this.string = string;
    }


    public void add (String addString){
          string += addString;
    }
    public NotePadMemento register () {
         return  new NotePadMemento(string);
    }

    public void getback (NotePadMemento memento ){
        string = memento.getString();
    }
    public void print(){
        System.out.println(string);
    }
}

/**
 * Memento means memory.
 * We can use this method if we want an object to revert to any
 * previous saved state.
 */