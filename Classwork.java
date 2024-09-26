public class Classwork
{
  public static void main(String[] args)
  {
    String x = new String("disctionary");
    int n = 1;
    firstLastN(x, n);
  }

  public static void firstLastN(String x, int n)
  {
    int length = x.length();
    String str1 = x.substring(0,n);
    String str2 = x.substring(length - n);
    System.out.print(str1 + str2);
  }


}
