import java.util.Calendar;
class ToDate
{
   public void Test()
    {
        Calendar c=Calendar.getInstance();
        System.out.println(+c.get(Calendar.MILLISECOND)+"MS /"+c.get(Calendar.SECOND)+"S /"+c.get(Calendar.MINUTE)+"MIN /"+c.get(Calendar.HOUR)+"HR /"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
    }
   
   public static void main(String[] args) {
	ToDate a=new ToDate();
	a.Test();

}
}
