public class NotEnoughUpperCase extends NotEnoughException{

    public NotEnoughUpperCase(int should, int is) {
        super(should, is);
    }

    public String toString() {
      return "NotEnoughtUpperCase:\n" + super.toString();
    }

}
