import java.text.DecimalFormat;//��ʽ��
import java.util.GregorianCalendar;	//����
import java.text.SimpleDateFormat;	//��ʽ������
public class HelloWorld {

	public static void main(String[] args) {
		DecimalFormat myFormat=new DecimalFormat();
		myFormat.setGroupingUsed(false);
		// TODO Auto-generated method stub
		System.out.println("Hello, "+"JAVA 12, current date is "+myFormat.format(20190418));
		GregorianCalendar cln=new GregorianCalendar();	//����
		SimpleDateFormat sdf=new SimpleDateFormat();
		System.out.println("the real time is "+sdf.format(cln.getTime()));	//��ǰ����
	}
}
