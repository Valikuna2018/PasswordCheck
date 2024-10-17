public class NotEnoughLowerCase extends NotEnoughException{

    public NotEnoughLowerCase(int should, int is) {
        super(should, is);
    }

    public String toString() {
        return "NotEnoughLowerCase:\n" + super.toString();
    }

}
