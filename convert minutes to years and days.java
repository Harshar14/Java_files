public class MyClass {
    public static void main(String args[]) {
      int mins=3456789;
      double years,day;
      years=mins/(60*24*365);
      day= (int)(mins/60/24)%365;
        System.out.println((int)mins + " minutes is approximately " + years + " years and " + day + " days");
    }
}
