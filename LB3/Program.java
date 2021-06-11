
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Program {
    static Scanner in = new Scanner(System.in);
    public static void main(String[]args)
    {
        Archive archive = new Archive();
        archive.Enter();
        archive.Enter();
        archive.Enter();
        archive.Print();
        archive.Delete();
        archive.Print();
        /*Rating group531 = input();
        group531.output();
        Rating.QuickSort(group531);
        System.out.println("--------------------------------------------------------------------------------------");
        group531.output();
        float ser_rate = group531.ser_rate();
        System.out.printf("Середній рейтинг групи = %.2f\n", ser_rate);
        int cnt_lowRateStud = group531.stud_lowrate();
        System.out.println("Кількість студентів з рейтингом нижче середнього = " + cnt_lowRateStud);
*/
    }
    static Rating input()
    {
        Integer cnt = null;
        System.out.print("Введіть кількість студентів: ");
        try
        {
            cnt = in.nextInt();
        }
        catch (InputMismatchException e)
        {
            while(!in.hasNextInt())
            {
                System.out.print("Введено не вірний формат. Введіть число студентів: ");
                in.nextLine();

            }
            cnt = in.nextInt();
        }
        String[] PIB = new String[cnt]; int[] gradebook = new int[cnt]; float[] rate = new float[cnt];
        for(int i = 0; i < cnt; i++)
        {
            System.out.print("Введіть ПІБ студента: ");
            in.nextLine();
            PIB[i] = in.nextLine();
            while(gradebook[i] < 1)
            {
                System.out.print("Введіть номер залікової книжки: ");
                while(!in.hasNextInt())
                {
                    System.out.print("Введіть номер залікової книжки: ");
                    in.nextLine();
                }
                gradebook[i] = in.nextInt();
            }
            while(100 > rate[i] && rate[i] < 1)
            {
                System.out.print("Введіть рейтинг студента по 100 бальній шкалі: ");
                while(!in.hasNextFloat())
                {
                    in.nextLine();
                }
                rate[i] = in.nextFloat();
            }
        }
        Rating rating = new Rating(cnt,PIB,gradebook,rate);
        return rating;
    }
}
