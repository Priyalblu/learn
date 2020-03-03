class newWork
{
  public static void main(String args[])
  {
    System.out.println("New to GitHub!");
    newWork n=new newWork();
    n.newFunc();
    n.secondFunc();
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
  void remoteFunc()
  {
    System.out.println("This is the function i am creating remotly");
    int a=10, b=5;
    int c=a/b;
    System.out.println("The division is: "+c);
  }
  void NewremoteFunc()
  {
    System.out.println("This is the function i am creating in the remote branch, remotly");
    int a=10, b=5;
    int c=a-b;
    System.out.println("The substraction is: "+c);
  }
}
//done with this versoin too
//done with this version