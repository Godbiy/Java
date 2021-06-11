
import java.util.Scanner;

public class Progaram {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        zavd1();
        zavd2_1();
        zavd2_2();
        zavd3_A1();
      
    }
    

    static void zavd3_A1()
    {
        System.out.println("Завдання 3.1(А)");
        byte n = 0;
        int count = 0,dobutok = 1;
        boolean flag = false;
        while(n<=0) {
            System.out.print("Введіть розмірність масиву(1 - 127): ");
            while (!in.hasNextByte()) {
                System.out.print("Введіть розмірність масиву(1 - 127): ");
                in.next();
            }
            n = in.nextByte();
        }
        int[] array = new int[n];
        for(int i = 0; i < n;i++)
        {
            System.out.print("Введіть "+ (i+1) +" елемент масиву:  ");
                while (!in.hasNextInt()) {
                    in.next();
                }
            array[i] = in.nextByte();
            
        }
        for(int i = 0; i<n;i++){
            if(i+1<n){
            if((Math.abs(array[i]) > Math.abs(array[i+1]))) count = array[i] ;
            else{
                
                count = array[i+1] ;
            }
        }
        }
        System.out.println("Максимальний елемент по модулю = " + count);
        for(int i = 0; i<n;i++){
            if(array[i]>0)flag=true;
            if(flag)dobutok=dobutok * array[i];
        }
        System.out.println("Добуток після першого додатнього числа = " + dobutok);
    }

    static void zavd2_1()//while_do
    {
        in.next();
        System.out.println("Завдання 2(1)");
        double a = -Math.PI ,dx = Math.PI/30;
        double b = Math.PI;
        System.out.println("x\t\t|\ty=cos(x)*sin(x)");
        while (a<b)
        {

            System.out.printf("%.3f\t|\t%.3f\n", a, Math.cos(a)*Math.sin(a) );
            a+=dx;
        }
    }
    static void zavd2_2()//do_while
    {
        in.next();
        System.out.println("Завдання 2(2)");
        double a = -Math.PI ,dx = Math.PI/30;
        double b = Math.PI;
        System.out.println("x\t\t|\ty=cos(x)*sin(x)");
        do
        {

            System.out.printf("%.3f\t|\t%.3f\n", a, Math.cos(a)*Math.sin(a) );
            a+=dx;
        }
        while (a<b);
    }

    static void zavd1()
    {
        int n;
        boolean check = false ;
        System.out.println("Завдання 1.\nВведіть номер місяця:");
        n = in.nextInt();
        while(!check){
            switch (n) {
                case 1 : {
                    System.out.println("Зима)\n");
                    check = true;
                }break;
                case 2 : {
                    System.out.println("Тоже зима\n");
                    check = true;
                }break;
                case 3 : {
                    System.out.println("Це вже весна)\n");
                    check = true;
                }break;
                case 4 : {
                    System.out.println("ДА ЦЕ ВЕСНА\n");
                    check = true;
                }break;
                case 5 : {
                    System.out.println("Теж весна\n");
                    check = true;
                }break;
                case 6 : {
                    System.out.println("О літо тут моє др)))))))\n");
                    check = true;
                }break;
                case 7 : {
                    System.out.println("ЛІТО\n");
                    check = true;
                }break;
                case 8 : {
                    System.out.println("Кінець літа скоро школа(\n");
                    check = true;
                }break;
                case 9 : {
                    System.out.println("ЦЕ вже осінь школа там да\n");
                    check = true;
                }break;
                case 10 : {
                    System.out.println("До сих пір осінь *я ж не вкшолі як добре)))\n");
                    check = true;
                }break;
                case 11 : {
                    System.out.println("Типу кінець осені холодно да \n");
                    check = true;
                }break;
                case 12 : {
                    System.out.println("ЗИМА ЛИЖІ\n");
                    check = true;
                }break;
                default : {
                    System.out.println("Місяця з номером  " + n + " немає.Ну давай подумай і введи ще раз)");
                    n = in.nextInt();
                }
                break;
            }
        }
    }
}