import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HelloWorld {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
		Class<Roslinka> roslinkaClass = (Class<Roslinka>)
										Class.forName("Roslinka");
		
		for(Method m : roslinkaClass.getMethods()){
			System.out.println(m);
		}
		Constructor<Roslinka> roslinkaConstructor = roslinkaClass.getConstructor(double.class);
		Roslinka rosl = roslinkaConstructor.newInstance(1.43);
		System.out.println(rosl);
		
		Roslinka rosl1 = new Roslinka(3);
		rosl1.setWysokosc(23);
		System.out.println(rosl1);
		
	
		
	}

}
