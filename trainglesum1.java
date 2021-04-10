
public class trainglesum1 
{
   public static void main(String[] args)
   {
    int x[][]={{3,5,4},{4,7,2},{2,4,6}};
    TriangleSum1(x);
     
   }   
    }
  
   public  static int TriangleSum1(int a[][])
   {
       int s=0;
        for(int i=0;i<a.length;i++)
        {
           for(int j=0;j<i;j++) 
           {
               s+=a[i][j];
           }
        }
     System.out.println(s);
   }
