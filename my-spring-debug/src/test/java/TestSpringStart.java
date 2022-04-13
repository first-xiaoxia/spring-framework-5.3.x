import com.nj.MyClassXmlPathApplicationContext;
import org.springframework.context.ApplicationContext;

public class TestSpringStart {
	public static void main(String[] args) {
		ApplicationContext context = new MyClassXmlPathApplicationContext("classpath:spring-bean-configuration.xml");
		System.out.println("启动spring了");
	}
}
