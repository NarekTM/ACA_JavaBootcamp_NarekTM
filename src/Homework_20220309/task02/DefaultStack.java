package Homework_20220309.task02;

public class DefaultStack implements Stack {
    private final int[] nums;
    private int index;
    private static final int MAX_SIZE = 5;

    public DefaultStack() {
        nums = new int[MAX_SIZE];
    }

    @Override
    public void push(int val) {
        if (index < MAX_SIZE) {
            nums[index] = val;
            index++;

        } else {
            throw new StackIndexOutOfBoundsException(index);
        }
    }

    @Override
    public int pop() {
        int num;
        if (index <= MAX_SIZE && index > 0) {
            num = nums[index - 1];
            nums[index - 1] = 0;
            index--;

        } else {
            throw new EmptyStackException(index);
        }
        return num;
    }
}
