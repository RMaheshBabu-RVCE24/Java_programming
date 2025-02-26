/* generate random numbers = 1 to 10
  now it must stop when the number 5 comes */
public class Main {
    public static void main(String[] args) {
      while(true){
          int n=(int)(Math.random()*10+1);
          if(n==5){
              break;
          }
          System.out.print(n+" ");
      }
    }
    }
/* generate random numbers = 1 to 10
  now it must stop when the number 5 comes
  now update problem make sure it must not generate the multiples of 4*/

public class Main {
    public static void main(String[] args) {
      while(true){
          int n=(int)(Math.random()*10+1);
          if(n==5){
              break;
          }
          if(n%4==0){
              continue;
          }
          System.out.print(n+" ");
      }
    }
    }
