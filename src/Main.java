import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Управляющие конструкции:
        //Задание №1
        String month = "2";
        switch (month) {case "12", "1", "2" -> System.out.println("Зима");
                         case "3", "4", "5" -> System.out.println("Весна");
                         case "6", "7", "8" -> System.out.println("Лето");
                         case "9", "10", "11" -> System.out.println("Осень");
                         default -> System.out.println("Неверное значение");}

        //Задание №2
//        int qwerty = 7;
//        if (qwerty == 1){System.out.println("Январь");}
//        else if (qwerty == 2){System.out.println("Феврвль");}
//        else if (qwerty == 3){System.out.println("Март");}
//        else if (qwerty == 4){System.out.println("Апрель");}
//        else if (qwerty == 5){System.out.println("Май");}
//        else if (qwerty == 6){System.out.println("Июнь");}
//        else if (qwerty == 7){System.out.println("Июль");}
//        else if (qwerty == 8){System.out.println("Август");}
//        else if (qwerty == 9){System.out.println("Сентябрь");}
//        else if (qwerty == 10){System.out.println("Октябрь");}
//        else if (qwerty == 11){System.out.println("Ноябрь");}
//        else if (qwerty == 12){System.out.println("Декабрь");}
//        else {System.out.println("Месяц не существует");}

        //Задание №3
//        int t = -4;
//        if (t>-5) {System.out.println("Тепло");}
//        else if (t<=-5 && t>-20) {System.out.println("Нормально");}
//        else if (t<=-20) {System.out.println("Холодно");}

        //Задание №4
//        String colour = "4";
//        switch (colour) {case "1" -> System.out.println("Красный");
//                         case "2" -> System.out.println("Оранжевый");
//                         case "3" -> System.out.println("Жёлтый");
//                         case "4" -> System.out.println("Зелёный");
//                         case "5" -> System.out.println("Голубой");
//                         case "6" -> System.out.println("Сидит");
//                         case "7" -> System.out.println("Фазан");
//                         default -> System.out.println("Нет такого цвета");}

        //Циклы
        //Задание №1
//        for (int x=1; x<100; x=x+1){System.out.print(" " + x++);}

        //Задание №2
//        for (int x=5; x>0; ){System.out.println( x--);}

        //Задание №3
//        Scanner userInput = new Scanner(System.in);
//        int N=0;
//        System.out.println("Введите положительное число:" );
//        if(userInput.hasNextInt()){N = userInput.nextInt();}
//        else {System.out.println("Введите положительное число в следующий раз: ");}
//        System.out.println("Результат: " + N*(N+1)/2);
//        userInput.close();

        //Задание №4
//        int q = 7;
//        while(q<98){System.out.print(" " + q);
//           q=q+7;}

        //Задание №5
//        for(int a=0, n=1; n<=10; n++, a=(n-1)*-5){System.out.print(a+", ");}

        //Задание №6
//        for(int x=10; x<=20; x++){
//            int n=x*x;
//            System.out.print(n+" ");}

    }
}



