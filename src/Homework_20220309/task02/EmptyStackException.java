package Homework_20220309.task02;

public class EmptyStackException extends RuntimeException {
    public EmptyStackException(int index) {
        super("There is no argument at index " + index + " of your array.");
    }
}
