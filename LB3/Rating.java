
public class Rating {
    private String[] PIB;
    private int[] gradebook;
    private float[] rate;

    Rating (int cnt, String[] PIB, int[] gradebook, float[] rate)
    {

        this.PIB = new String[cnt] ;
        this.gradebook = new int[cnt];
        this.rate = new float[cnt];
        for(int i = 0; i <cnt; i++)
        {
            this.gradebook = gradebook;
            this.rate = rate;
            this.PIB = PIB;
        }
    }

    public float[] GetRate()
    {
        return rate;
    }

    public int stud_lowrate()
    {
        int lich = 0;
        float[] rate = GetRate();
        float ser_rate = ser_rate();
        for(int i = 0; i < rate.length; i++)
        {
            if(rate[i] < ser_rate) lich++;
        }
        return lich;
    }

    public float ser_rate()
    {
        float res = 0;
        float[] temp = GetRate();
        for(int i = 0; i < GetRate().length; i++)
        {
            res +=temp[i];
        }
        return res / temp.length;
    }

    public String[] GetPIB()
    {
        return PIB;
    }

    public static void QuickSort(Rating rating)
    {
        QS(rating,0,rating.GetPIB().length-1);
    }

    private static void QS(Rating rating, int left, int right)
    {
        if(left >= right) return;
        int l = left, r = right;
        float pivot = rating.rate[(right-left)/2];
        while(l<=r)
        {
            while((rating.rate[l] > pivot) && (l < right))  l++;
            while((rating.rate[r] < pivot) && (r < left))  r--;
            if(l<=r)
            {
                String tempP = rating.PIB[l];
                int tempG = rating.gradebook[l];
                float tempR = rating.rate[l];
                rating.rate[l] = rating.rate[r];
                rating.rate[r] = tempR;
                rating.PIB[l] = rating.PIB[r];
                rating.PIB[r] = tempP;
                rating.gradebook[l] = rating.gradebook[r];
                rating.gradebook[r] = tempG;
                l++;
                r--;
            }
            if(left < r) QS(rating, left,r++);
            if(l < right) QS(rating, l, right);
        }
    }
    public void output()
    {
        System.out.printf("%-43s%-17s%-10s%n", "ПІБ","№ залікової","Рейтинг");
        for(int i = 0; i < PIB.length; i++)
        {

            System.out.printf("%-43s%-17d%-10.2f%n",PIB[i],gradebook[i],rate[i]);
        }

    }
}
