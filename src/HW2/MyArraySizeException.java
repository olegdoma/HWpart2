package HW2;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Размер массива неверный");
    }
}
