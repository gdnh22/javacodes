import java.text.DecimalFormat;//格式化
import java.util.GregorianCalendar;	//日期
import java.text.SimpleDateFormat;	//格式化日期
public class HelloWorld {

	public static void main(String[] args) {
		DecimalFormat myFormat=new DecimalFormat();
		myFormat.setGroupingUsed(false);
		// TODO Auto-generated method stub
		System.out.println("Hello, "+"JAVA 12, current date is "+myFormat.format(20190418));
		GregorianCalendar cln=new GregorianCalendar();	//日期
		SimpleDateFormat sdf=new SimpleDateFormat();
		System.out.println("the real time is "+sdf.format(cln.getTime()));	//当前日期
	}
}
