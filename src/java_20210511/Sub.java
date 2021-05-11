package java_20210511;

public class Sub extends Super {
	String chicken;

	public void goToSchool() {
		System.out.println("Sub goToSchool() 호출");
	}

	// overiding : 부모의 메서드 재정의
	// 작성규칙
	// 1. 반환형, 메서드 이름, 매개변수 일치
	// 2. 접근 한정자는 부모보다 자식이 상위이거나 일치 e.g. 부모 protected / 자식 protected or public
	public void play(String starcraft) {
		// super play("badook");
		System.out.println("sub play(~) 호출");
	}
	public String toString() {
		return "재정의되었습니다";
	}
}
