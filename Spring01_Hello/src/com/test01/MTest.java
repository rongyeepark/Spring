package com.test01;

public class MTest {
	//MTest는 MessageBean에 <<의존>>하고 있음!!
	//의존하다"의 의미 : 어떤 기능을 실행시키기 위해 다른 클래스가 필요로 할 때. 즉, A가 B에 의존한다는 것은 A가 B객체를 사용한다는 것
	//MTest =>MessageBean객체를 사용한다는 의미!!
	//서로 의존하고 있는 경우는 다른 한 곳이 수정되면 다 같이 수정되어야함!(결합도가 높기때문에!)
	public static void main(String[] args) {
		MessageBean bean = new MessageBean();
		bean.sayHello("Spring");
	}

}
