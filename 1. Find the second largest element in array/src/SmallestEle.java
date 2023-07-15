import java.util.Scanner;
public class SmallestEle
{
    public static void main(String[] args)
    {
        int temp,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        int[] a = {2,3,4,5,1,6};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Smallest element at index "+num+" is: "+a[num]);
    }
}
