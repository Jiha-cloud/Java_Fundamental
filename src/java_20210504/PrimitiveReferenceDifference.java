package java_20210504;

public class PrimitiveReferenceDifference {
	public static void main(String[] args) {
		int a =10;
		//primitive 변수를 할당하면 값이 할당됨. 참조X
		int b=a;
		b=30;
		System.out.println(a);
		System.out.println(b);
		
		int[] test = {10,20,30,40};
		//reference 변수를 할당하면 같은 객체를 참조함. 값을 할당하는 것이 아니라서 참조하던 변수가 변경되면 그대로 참조함.
		int[] temp = test;
		
		System.out.printf("test[0] : %d , temp[0] : %d\n",test[0],temp[0]);
		System.out.printf("test[1] : %d , temp[1] : %d\n",test[1],temp[1]);
		
		temp[2] = 30000;
		test[1] = 20000;
		
		System.out.printf("test[2] : %d , temp[2] : %d\n",test[2],temp[2]);
		System.out.printf("test[1] : %d , temp[1] : %d\n",test[1],temp[1]);
	}
}
