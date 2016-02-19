package edu.boychuk;

/**
 * Created by Sergey on 19-Feb-16.
 */
public class GuessGame {                       //GuessGame содержит три переменных экземпляра
    Player p1;                                 //для трех объектов Player.
    Player p2;
    Player p3;

    public void startGame(){                   //Создаем три объекта Player и присваиваем
        p1 = new Player();                     //их трем переменным экземпляра.
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;                       //Объявляем три переменные для хранения
        int guessp2 = 0;                       //вариантов от каждого игрока.
        int guessp3 = 0;

        boolean p1isRight = false;             //Объявляем три переменные для хранения
        boolean p2isRight = false;             //правильности или неправильности
        boolean p3isRight = false;             //(true или false) ответов игроков.

        int targetNumber = (int) (Math.random() * 10);        //Создаем число, которое игроки
        System.out.println("Я загадываю число от 0 до 9..."); //должны угадать.

        while (true){
            System.out.println("Число которое нужно угадать, - " + targetNumber);

            p1.guess();                        //Вызываем метод guess() из каждого объекта Player
            p2.guess();
            p3.guess();

            guessp1 = p1.number;                                           //Извлекаем варианты
            System.out.println("Первый игрок думает, что это " + guessp1); //каждого игрока
            guessp2 = p2.number;                                           //(результаты работы
            System.out.println("Второй игрок думает, что это " + guessp2); //их методов guess())
            guessp3 = p3.number;                                           //получая доступ к
            System.out.println("Третий игрок думает, что это " + guessp3); //переменным number.

            if (guessp1 == targetNumber){      //Проверяем варианты каждого из игроков
                p1isRight = true;              //на соответствие загаданному числу.
            }                                  //Если игрок угадал, то присваиваем
            if (guessp2 == targetNumber){      //соответствующей переменной значение
                p2isRight = true;              //true.
            }
            if (guessp3 == targetNumber){
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight){ //Если один из игроков угадал

                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + p1isRight);
                System.out.println("Второй игрок угадал? " + p2isRight);
                System.out.println("Третий игрок угадал? " + p3isRight);
                System.out.println("Конец игры");
                break; //Игра окончена, так что прерываем цикл
            } else {
              //Мы должны продолжать, так как никто не угадал.
                System.out.println("Игроки должны попробовать еще раз");
            }//конец if/else
        }//конец цикла
    }//конец метода
}//конец класса
