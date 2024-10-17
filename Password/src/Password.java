public class Password {
    private final int nrUpperShould, nrLowerShould,
            nrNumbersShould, lengthShould;
    private final char[] illegalChars;

    public Password(int nrUpperShould, int nrLowerShould, int nrNumbersShould, int lengthShould, char[] illegalChars) {
        this.nrUpperShould = nrUpperShould;
        this.nrLowerShould = nrLowerShould;
        this.nrNumbersShould = nrNumbersShould;
        this.lengthShould = lengthShould;
        this.illegalChars = illegalChars;
    }

    public static boolean matchesIllegalCharacter(char[] arr, char c) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) return true;
        }
        return false;
    }

    public boolean checkFormat(String pwd) throws Exception {
        int realLength = pwd.length();

        if (realLength < this.lengthShould) throw new NotLongEnough(this.lengthShould,realLength);

        int[] fix = new int[3];

        for (int i = 0; i < realLength; i++) {
            char c = pwd.charAt(i);

            if (matchesIllegalCharacter(this.illegalChars,c)) throw new IllegalCharException(c);

            if (Character.isDigit(c)) fix[0]++;
            if (Character.isLowerCase(c)) fix[1]++;
            if (Character.isUpperCase(c)) fix[2]++;
        }

        if (fix[0] < this.nrNumbersShould) throw new NotEnoughNumber(this.nrNumbersShould,fix[0]);
        if (fix[1] < this.nrLowerShould) throw  new NotEnoughLowerCase(this.nrLowerShould,fix[1]);
        if (fix[2] < this.nrUpperShould) throw  new NotEnoughUpperCase(this.nrUpperShould,fix[2]);


        return true;
    }
}
