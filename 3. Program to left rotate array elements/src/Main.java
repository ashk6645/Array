public class Main
{
    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5};
        int n=3;  //number of lest shifting
        System.out.println("Original array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" "); //gives original array
        }

        //Rotate array by n times towards left
        for(int i=0;i<n;i++)
        {
            int j,first;
            first = arr[0]; //store the first element
            for(j=0;j<arr.length-1;j++)
            {
                arr[j] = arr[j+1]; //shift element by one
            }
            arr[j] = first; //first element is added to last
        }
        System.out.println();
        System.out.println("After left rotation: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" "); //resulting array
        }
    }
}