public class Classwork
{
  public static void main(String[] args)
  {
    String x1 = new String("Dictionary");
    String x2 = new String("apple");
    String x3 = new String("A moose steak is never a mistake");
    int n = 1;
    firstLastN(x1, n);
    delEnd(x1, n);
    compareLower(x1, x2);
    LengthFirst(x3);
  }

  public static void firstLastN(String x1, int n)
  {
    int L = x1.length();
    String str1 = x1.substring(0,n);
    String str2 = x1.substring(L - n);
    System.out.println(str1 + str2);
  }

  public static void delEnd(String x1, int n)
  {
    int L = x1.length();
    int n1 = (L - n);
    String str1 = x1.substring(0, n1);
    System.out.println(str1);
  }

  public static void compareLower(String x1, String x2)
  {
    String str1 = x1.toLowerCase();
    String str2 = x2.toLowerCase();
    int output = str1.compareTo(str2);
    System.out.println(output);
  }

  public static void LengthFirst(String x3)
  {
    int index = x3.indexOf(" ");
    String output = x3.substring(0, index);
    System.out.print(output);
  }
}
