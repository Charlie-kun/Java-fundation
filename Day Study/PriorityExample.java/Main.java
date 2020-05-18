public class Main {
  public static void main(String[] args) {
    for (int i = 0; i <= 10; i++)   //According to Computer CPU Number of core and threads so, need to different input number for i.
    {
      Thread thread = new CalcThread("thread" + i);
      if (i!=10) {
        thread.setPriority(Thread.MIN_PRIORITY);
      } else {
        thread.setPriority(Thread.MAX_PRIORITY);
      }
      thread.start();
    }
  }
}
