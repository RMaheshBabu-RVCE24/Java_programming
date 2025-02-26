/* problem constraints = print numbers by input and add the sum of it
  1<=n<=1000 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1 && n<=1000){
            int sum=n*(n+1)/2;
            System.out.println(sum);
        }
        }
}
