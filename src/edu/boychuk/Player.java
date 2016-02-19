package edu.boychuk;

/**
 * Created by Sergey on 19-Feb-16.
 */
public class Player {
    int number =0;//здесь хранится вариант числа
    public  void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("Думаю этол число " + number);
    }
}
