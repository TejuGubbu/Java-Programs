import java.util.Scanner;
public class time
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 5
        int a[] = new int[n];  // 8  5  2  7  1
        int t = 0; 
        for (int i = 0 ; i< n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int small = a[0];
        for (int i = 0 ;i<n ;i++)
        {
            for(int j = i+1 ; j<n ;j++)
            {
                if(small>j)
                {
                    if (j==t)
                    {
                        small = j;
                    }
                }
            t = small;
            }
            System.out.print(small+" ");
            small = a[i + 1];
        }
    }
}