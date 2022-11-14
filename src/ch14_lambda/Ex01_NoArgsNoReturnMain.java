package ch14_lambda;

/**
 * No arguments, no return value
 */
public class Ex01_NoArgsNoReturnMain {

	public static void main(String[] args) {
		Ex01_MyFunctionalInterface fi;

		fi = () -> {
			String str = "method call";
			System.out.println(str);
		};
		fi.method();

		fi = () -> { System.out.println("method call"); };
		fi.method();

		fi = () -> System.out.println("method call");
		fi.method();
	}

}