class Main 
{
  public static void main(String[] args) 
  {
    Thread mainThread=Thread.currentThread();
    System.out.println("Program thread name : " +mainThread.getName());

    ThreadA threadA=new ThreadA();    //Create threadA
    System.out.println("Working thread name : " +threadA.getName());    //get thread name and display
    threadA.start();    //threadA start

    ThreadB threadB=new ThreadB();    //Create threadB
    System.out.println("Working thread name : " +threadB.getName());
    threadB.start();    //threadB start
  }
}
