package MyException;

public class MyArrayDataException extends MyArrayException{
    int x;
    int y;

    public MyArrayDataException(Exception e,int x , int y) {
        super(String.format("incorrect data in the cell [%d][%d]",x,y),e);
        this.x = x;
        this.y = y;
    }

}
