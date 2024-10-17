public class NotEnoughNumber extends NotEnoughException{

    public NotEnoughNumber(int should, int is) {
        super(should, is);
    }

    public String toString() {
        return "NotEnoughNumber:\n" + super.toString();
    }

}
