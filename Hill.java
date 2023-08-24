import java.util.*;
public class Hill {
    public static void main(String[] args)
    {
      Scanner myobj = new Scanner(System.in);
      /*  N is number of hill
       * U - he can jump Not higher than this 
       * D -he can jump Not lower than this
      */
      int parachute = 1;
      // He can jump lower his current hill height no matter what is the height of next hill IF he has not used his parachute yet(he can use his parachute only one)
      System.out.println("Enter the number of hills");
      int N = myobj.nextInt();
      System.out.println("Enter the highest value it can jump");
      int U = myobj.nextInt();
      System.out.println("Enter the lowest value it can jump");
      int D = myobj.nextInt();
      System.out.println("Enter the heigts of the hill");
      int hill_heights[] = new int[N];
      for(int i =0;i<N;i++)
      {
        hill_heights[i] = myobj.nextInt();
      }
      int jump = 1;
      for(int current_hill=0;current_hill<N-1;current_hill++)
      {
        int next_hill = current_hill  + 1;
        if(hill_heights[current_hill]  == hill_heights[next_hill])
        {
            jump++;
        }
        else if(hill_heights[current_hill] < hill_heights[next_hill])
        {
            if((hill_heights[next_hill] - hill_heights[current_hill]) <= U )
            {
                jump++;
            }
            else
            {
                break;
            }

        }
        else{

            if((hill_heights[current_hill] - hill_heights[next_hill]) >= D)
            {
                jump++;
            }
            else
            {
                if(parachute == 1)
                {
                    jump++;
                    parachute--;
                }
                else
                {
                    break;
                }
                
            }
        }
      }
      System.out.println("right most reachable jump "+jump);
    } 
}
