import java.io.File;	//文件
import java.text.DecimalFormat;//格式化
import java.util.GregorianCalendar;	//日期
import java.text.SimpleDateFormat;	//格式化日期
public class HelloWorld {

	public static void main(String[] args) {
		File file=new File("demo1.txt");//创建文件，如果不加路径，默认工程目录下
		if(file.exists())
		{
			file.delete();
			System.out.println("文件已存在，删除成功！");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("新文件已建立。");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		DecimalFormat myFormat=new DecimalFormat();
		myFormat.setGroupingUsed(false);
		// TODO Auto-generated method stub
		System.out.println("Hello, "+"JAVA 12, current date is "+myFormat.format(20190418));
		GregorianCalendar cln=new GregorianCalendar();	//日期
		SimpleDateFormat sdf=new SimpleDateFormat();
		System.out.println("the real time is "+sdf.format(cln.getTime()));	//当前日期
	}
}
