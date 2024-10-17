public class NotEnoughspecial extends NotEnoughException{

    public NotEnoughspecial(int should, int is) {
        super(should, is);
    }

    public String toString() {
        return "NotEnoughspecial:\n" + super.toString();
    }

}
