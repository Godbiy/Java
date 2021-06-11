
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Program2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        byte task;
        boolean check = true;

        while(check)
        {
            System.out.println("Введіть номер завдання: ");
            task = in.nextByte();

            switch(task){
                case 1:
                    task1();
                    System.out.println("Ще одне завдання? true/false");
                    check = in.nextBoolean();
                    break;
                case 2:
                    task2();
                    System.out.println("Ще одне завдання? true/false");
                    check = in.nextBoolean();
                    break;
                
            }

        }
    }
    public static void task1()
    {
        System.out.println("Введіть текст:");
        in.nextLine();
        StringBuilder sbd = new StringBuilder(in.nextLine());
        System.out.println(sbd);
        char t;
        int num = 0, numsentence = 0;
        boolean flag = false;
        String sentence = "";
        for (int i = 0; i < sbd.length(); i++)
        {
            t = sbd.charAt(i);
            if(t==':')flag=true;
            if(flag)sentence+=t;
        }
        System.out.println(sentence);
        for (int i = 0; i < sbd.length(); i++)
        {
            t = sbd.charAt(i);
            if((t==' ')||t=='.')num++;
            if((t=='.')&&(num%2!=0)){
                numsentence++;
                num=0;
            }
        }
        System.out.println("Кількість речень з непарною кількість слів"+numsentence);
       
    }

    public static void task2()
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        File file = new File("C:\\Users\\Toyota\\Desktop\\text.txt");
        Scanner scanner = null;
        String text = "";
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Не вдалося відкрити файл.");
        }
        while(scanner.hasNext()){
            text = scanner.nextLine();
            System.out.println(text); 
            arrayList.add(text.length());
        }
        System.out.println(arrayList);
        scanner.close();
    }
}
