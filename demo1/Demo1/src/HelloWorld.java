import java.io.File;	//�ļ�
import java.text.DecimalFormat;//��ʽ��
import java.util.GregorianCalendar;	//����
import java.text.SimpleDateFormat;	//��ʽ������
public class HelloWorld {

	public static void main(String[] args) {
		File file=new File("demo1.txt");//�����ļ����������·����Ĭ�Ϲ���Ŀ¼��
		if(file.exists())
		{
			file.delete();
			System.out.println("�ļ��Ѵ��ڣ�ɾ���ɹ���");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("���ļ��ѽ�����");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		DecimalFormat myFormat=new DecimalFormat();
		myFormat.setGroupingUsed(false);
		// TODO Auto-generated method stub
		System.out.println("Hello, "+"JAVA 12, current date is "+myFormat.format(20190418));
		GregorianCalendar cln=new GregorianCalendar();	//����
		SimpleDateFormat sdf=new SimpleDateFormat();
		System.out.println("the real time is "+sdf.format(cln.getTime()));	//��ǰ����
	}
}
