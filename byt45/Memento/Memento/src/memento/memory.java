package memento;

import java.util.ArrayList;
import java.util.List;

public class memory {
    private List<NotePadMemento> list;

    public memory() {
       list = new ArrayList<>();

    }
    public void add (NotePadMemento memento){
        list.add(memento);
    }
    public NotePadMemento getLastVersion (){
        if (!list.isEmpty()){
             NotePadMemento lastVersion = list.get(list.size()-1);
             list.remove((lastVersion));
             return lastVersion;}
        else {
            throw new ArrayIndexOutOfBoundsException("installed version not found...");
        }
    }
}
