public class LargEle
{
    public static void main(String[] args)
    {
        int temp;
        int[] a = {2,3,4,5,6};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i:a)
        {
            System.out.println(i);
        }
        System.out.println("Second largest element is:"+a[1]);
    }
}