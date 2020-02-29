class newWork
{
  public static void main(String args[])
  {
    System.out.println("New to GitHub!");
    newWork n=new newWork();
    n.newFunc();
  }
  void newFunc()
  {
    System.out.println("This is a new function and a new commit");
    int a=10, b=5;
    int c=a*b;
    System.out.println("The multiplication is: "+c);
  }
  void secondFunc()
  {
    System.out.println("This is the 2nd function and a new branch");
    int a=10, b=5;
    int c=a+b;
    System.out.println("The addition is: "+c);
  }
}
