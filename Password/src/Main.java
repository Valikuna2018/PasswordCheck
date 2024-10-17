public class Main {
    public static void main(String[] args) throws Exception {

        char[] arr = {'*','!','?'};

        Password password = new Password(2,4,0,1,arr);

        System.out.println(password.checkFormat("Password"));

    }
}