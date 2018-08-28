
public interface HumanOperations {

    default void sayHello() {
        System.out.println("Hello everybody");
    }

	boolean isOfAge();

	static void sayHelloFromInterface() {
		System.out.println("Say Hello from Interface");
	}
}
