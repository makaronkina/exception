public class MyArrayCheck {

    public void checkedArray(String[][] myArray) {
        if (myArray.length !=4) {
            throw new MyArraySizeException(String.format("Main array length must be directly 4, but now = %s", myArray.length));
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].length != 4) {
                throw new MyArraySizeException(String.format("Internal array #%s length must be directly 4, but now = %s", i, myArray[i].length));
            }
        }
    }

    public void printInfo(String[][] myArray) {
        System.out.println(calculateArray(myArray));
    }

    public int calculateArray(String[][] myArray) {
        checkedArray(myArray);
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(myArray[i][j]);
                    checkedNegative(Integer.parseInt(myArray[i][j]), i, j);
                } catch (NumberFormatException e) {
                    String message = String.format("Value in myArray[%s][%s] is not a digit", i, j);
                    throw new MyArrayDataException(message, e);
                }
            }
        }
        return sum;
    }
    public void checkedNegative(int val, int a, int b) {
        if (val < 0) {
            String message = String.format("Value in myArray[%s][%s] is not a positive", a, b);
            throw new MyArrayNegativeException(message);
        }
    }
}
