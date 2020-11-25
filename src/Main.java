public class Main {

    public static void main(String[] args) {
        String[][] myArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        MyArrayCheck myArrayCheck = new MyArrayCheck();
        myArrayCheck.calculateArray(myArray);
        myArrayCheck.printInfo(myArray);
    }
}
