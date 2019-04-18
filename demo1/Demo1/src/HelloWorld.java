import java.text.DecimalFormat;
public class HelloWorld {

	public static void main(String[] args) {
		DecimalFormat myFormat=new DecimalFormat();
		myFormat.setGroupingUsed(false);
		// TODO Auto-generated method stub
System.out.println("Hello, "+"JAVA 12, current date is "+myFormat.format(20190418));
	}
}
