class demo{
public static void main(Sting[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the value of A:");
  int a = sc.nextInt();
  System.out.println("Enter the value of B:");
  int b = sc.nextInt();
  System.out.println("the values before the swap:"+a+" "+b);
  a=a^b;
  b=b^a;
  a=a^b;
  System.out.println("the values after the swap:"+a+" "+b);
}
}
