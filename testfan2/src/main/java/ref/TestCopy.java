package ref;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.MethodUtils;

public class TestCopy {
	
	public static void main(String[] args) {
		//Person1 person1= new Person1("zhansan", "男", 20, "test1", "test2", "test3", "test4");
		
		Person1 person1 = null;
		try {
			person1 = ConstructorUtils.invokeConstructor(Person1.class,
			            new Object[] { "zhansan", "男", 20, "test1", "test2", "test3", "test4" });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(person1);
		 
		 
		Person2 person2 = new Person2();
//		person2.setP1(person1.getP1());
//		person2.setP2(person1.getP2());
//		person2.setP3(person1.getP3());
//		person2.setP4(person1.getP4());
		System.out.println(person2);
		System.out.println("person1 ------");
		getFile(person1);
		System.out.println("person2 ------");
		getFile(person2);
		
//		Class clz2= person2.getClass();
//		try {
//			Field field = clz2.getDeclaredField("p1");
//			field.setAccessible(true);
//			field.set(person2, "1234");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("p1", "test1");
		map.put("p2", "test2");
		try {
			 BeanUtils.copyProperties(person2, map);
			 BeanUtils.setProperty(person2, "p5", "1111");
			 System.out.println(BeanUtils.getProperty(person2, "p2"));
			 MethodUtils.invokeMethod(person2, "setP4", "111111111111111");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//copy(person1,person2);
		System.out.println(person2);
	}
	
	public static void getFile(Object object) {
		Class clz=object.getClass();
		Field[] fields = clz.getDeclaredFields();
		for (Field field : fields) {
			try {
				field.setAccessible(true);
				System.out.println(field.getName()+ " value "+ field.get(object));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void copy(Object from, Object to) {
		Class fromClass= from.getClass();
		Class toClass= to.getClass();
		Field[] fields = toClass.getDeclaredFields();
		for (Field field : fields) {
			try {
				field.setAccessible(true);
				System.out.println(field.getName());
				Field fromfield = fromClass.getDeclaredField(field.getName());
				fromfield.setAccessible(true);
				field.set(to, fromfield.get(from));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
