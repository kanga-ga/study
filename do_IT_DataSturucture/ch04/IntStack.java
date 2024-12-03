package study.do_IT_DataSturucture.ch04;

import javax.management.RuntimeErrorException;

public class IntStack {
    private int max;
    private int ptr;
    private int [] stk;

    public class EmptyInStackException extends RuntimeException{
        public EmptyInStackException(){}
    }

    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException() {}
    }
    public IntStack(int capacity){
        ptr = 0;
        max = capacity;
        try{
            stk = new int[max];
        } catch(OutOfMemoryError e){
            max = 0;
        }
    }
    public int push(int x) throws OverflowIntStackException{
        if(ptr >= max)
        throw new OverflowIntStackException();
        return stk[ptr++] =x;
    }
}