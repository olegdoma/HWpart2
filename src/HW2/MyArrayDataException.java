package HW2;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(String mess) {
        super("Данные неверны "+mess);
    }

}
