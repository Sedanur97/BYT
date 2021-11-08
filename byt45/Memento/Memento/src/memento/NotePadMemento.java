package memento;

public class NotePadMemento {
    private String string;
    public NotePadMemento( ) {
        string = "";
        }

    public NotePadMemento(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
