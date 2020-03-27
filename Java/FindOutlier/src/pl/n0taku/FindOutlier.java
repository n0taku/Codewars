package pl.n0taku;

public class FindOutlier{
    static int find(int[] integers){
        int even = 0;
        int odd = 0;
        int last_even=0;
        int last_odd=0;
        for (int i:integers){
            if(i%2==0) {
                even++;
                last_even=i;
            }
            else {
                odd++;
                last_odd=i;
            }
            if((even>1||odd>1)&&even>0&&odd>0){
                if (even>1)
                    return last_odd;
                else
                    return last_even;
            }
        }
        return 0;
    }
}