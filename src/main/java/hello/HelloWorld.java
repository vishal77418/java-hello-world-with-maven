package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = new LocalTime();
		  System.out.println("Hello i am Gaurav3");

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
