import MyException.MyArrayDataException;
import MyException.MyArrayException;
import MyException.MyArraySizeException;


public class Main {
    public static void main(String[] args) {
        String[][] array = {{"12","23","123","qwe"},{"12","23","123","0"},{"12","23","123","0"},{"12","23","123","0"}};
        try {
            checkLengthArr(5,4,array);
            System.out.println(elementsSum(array));
        } catch (MyArrayException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int elementsSum (String[][] arr) throws MyArrayException {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(e,i,j);
                }
            }
        }
        return result;
    }

    public static void checkLengthArr(int height, int width, String[][] arr) throws MyArraySizeException {
        if (arr.length != height) {
            throw new MyArraySizeException(String.format("input array is not [%d][%d]",height,width));
        }
        for (String[] innerArr:arr) {
            if (innerArr.length != width) {
                throw new MyArraySizeException(String.format("input array is not [%d][%d]",height,width));
            }
        }
    }
}