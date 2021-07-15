package JavaA4;

public class Question1 {

	public static void main(String[] args) {
		LambdaFunction lambdaFunction1=(int a,int b) -> a+b;
		LambdaFunction lambdaFunction2=(int a,int b) -> a-b;
		LambdaFunction lambdaFunction3=(int a,int b) -> a*b;
		LambdaFunction lambdaFunction4=(int a,int b) -> a/b;

		System.out.println(lambdaFunction1.lambda(22,201));
		System.out.println(lambdaFunction2.lambda(55,15));
		System.out.println(lambdaFunction3.lambda(12,3));
		System.out.println(lambdaFunction4.lambda(100,4));

	}

}
interface LambdaFunction{
	int lambda(int x,int y);

	}


