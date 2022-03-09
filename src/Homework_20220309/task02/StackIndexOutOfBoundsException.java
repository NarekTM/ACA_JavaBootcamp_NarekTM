package Homework_20220309.task02;

public class StackIndexOutOfBoundsException extends RuntimeException {
    public StackIndexOutOfBoundsException(int index) {
        super("Your array doesn't have index " + index);
    }
}
