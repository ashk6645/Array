import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int temp;
        int[] arr = {2,3,4,5,2,1};

        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if ((arr[i] == arr[j]) && (i!=j))
                {
                    System.out.println("Duplicate element is: "+arr[j]);
                }
            }
        }
    }
}