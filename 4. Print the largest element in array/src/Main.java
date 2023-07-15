public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {2,3,8,4,5};
        int max = arr[0]; //Initially max will hold 2
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)  //After that 3 (3>2) then 8 (8>2)
                            // and also(8>4 and 8>5)
            {
                max = arr[i];
            }
        }
        System.out.println("Larget element is: "+max);

    }

}