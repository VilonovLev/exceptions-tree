package MyException;

public abstract class MyArrayException extends Exception{
    public MyArrayException(String massage,Throwable cause) {
        super(massage,cause);
    }

    public MyArrayException(String massage) {
        super(massage);
    }

}
