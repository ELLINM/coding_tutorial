//ex1


public class Method1
{
  public static void main(String[] args) //mainMethod에서 부터 프로그램이 실행
  {
    addHap2(1, 2); //addHap2( )Method를 호출 메소드 호출구문을 보면 1과 2를 인수로 가짐
    addHap2(3, 4); //addHap2( )Method를 한번더 호출

    int hap = addHap(1 ,2);  //addHap2( )Method를 한번더 실행하고 난뒤 이번엔 addHap( )Method를 호출

    System.out.println(hap);
  }

    int  addHap (int a, int b) //int a와 int b를 인수로 받으며 int형의 반환값
    {
	    int hap = a + b;
	    return hap; //int hap이라는 변수를 선언하고 리턴값을 hap이라는 변수에 받아내는 것
    } 
	void addHap2 (int a, int b)  //addHap2( )Method의 구현부를 보면 int a와 int b를 인수로 받으며 반환값이 없다
	{
		int hap  =  a  +  b;  //addHap2( )Method는 1과 2를 인수로 받아 그 합을 구하고 합을 출력
		System.out.println(a+" 와 "+b+"의 합은" + hap + "입니다."); //리턴값을 받은 hap을 프린트
	} 
}


// ex2


public class Method1 
{
	int a; //Method1 클래스의 객체변수로 선언

	public void vartest(Method1 test) 
	{ //vartest Method는 다음과 같이 Method1클래스의 객체를 입력받아 해당 객체의 객체변수 a의 값을 1만큼 증가시키는 역할
		test.a++;
	}

	public static void main(String[] args)
	{ //main Method에서는 vartest Method에 1이라는 값을 전달하던것을 Method1클래스의 객체인 myTest를 넘김
		Method1 myTest = new Method1(); 
		myTest.a = 1;
		myTest.vartest(myTest);
		System.out.println(myTest.a);
	}//myTest객체의 객체변수 a의 값이 원래는 1이었는데 vartest  Method 실행 후 1만큼 증가되어 2라는 값이 출력
}
/* vartest메소드의 입력 파라미터가 값이 아닌 Method1클래스의 객체라는데 있다. 
이렇게 Method가 객체를 전달 받으면 Method 내의 객체는 전달받은 객체 그 자체로 수행된다. 
따라서 입력으로 전달받은 myTest 객체의 객체변수 a의 값이 증가하게 되는 것이다.
Method의 입력항목이 값인지 객체인지를 구별하는 기준은 입력항목의 자료형이 primitive 자료형인지 아닌지에 따라 나뉜다. 
int 자료형과 같은 primitive 자료형인 경우 값이 전달되는 것이고 그 이외의 경우(reference 자료형)는 객체가 전달된다.*/
