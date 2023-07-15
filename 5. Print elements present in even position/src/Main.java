public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {2,3,4,5,6,7,8,9,10};
        System.out.println("Elements present at even position: ");
        for(int i=1;i<arr.length;i=i+2) //ele at index[1] is even position(2)
        {
            System.out.println(arr[i]);
        }
    }
}