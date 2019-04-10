//ex1 영화관 예약 시스템을 만들고 중복되는 자리 입력시 예약좌석일 경우 다시 예약하게 할것

import java.util.Scanner;

class Reservation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int seatNum;
		String [] reservation = new String [10];
		//while문 안에 넣게 되면 반복하면서 초기화 된다.
		
		while (true)//반복시작
		{
			System.out.println("예약하시려는 분의 이름을 입력 : ");
			name = sc.next();

			System.out.println("예약좌석을 입력 (1~10) : ");
			seatNum = sc.nextInt();

			if (reservation[seatNum-1]==null)
			{
				reservation[seatNum-1] = name; //이 부분이 null인지 아닌지 확인
			}else{
				System.out.println("예약좌석입니다.");
			}

			for (int i = 0; i < reservation.length; i++) //length는 배열의 길이
			{
				if (reservation[i] != null)
				{
					System.out.print("[" + reservation[i] + "]");
				}else{
					System.out.print("[  ]");
				}
			}
		}
	}
}


//ex2 이가 100개인 int타입 배열에 정수 1~100를 순차적으로 대입하시오.

class Hundred
{
	public static void main(String[] args) 
	{
		int [] num = new int [100]; //배열을 선언

		for (int i = 0; i<num.length; i++)
		{
			num[i] = i + 1;
			System.out.println("[" + num[i] + "]"); //대입만 하면 되기 때문에 굳이 필요없음 확인용
		}
	}
}


//ex3 길이가 100개인 int타입 배열에 정수 짝수만 순차적으로 대입하시오.

class Hundred2
{
	public static void main(String[] args) 
	{
		int [] num = new int [100];

		for (int i = 0; i<num.length; i+=2)
		{
			num[i] = i + 2; // 정체 출력을 하면 짝수만 출력되지않음
			System.out.println("[" + num[i] + "]");
		}
		/*for (int i = 1; i<101; i++)
		{
			num[i-1) = i*2;
		}*/
	}
}


//ex4 피보나치 수열을 길이가 10인 int 타입의 배열에 순차적으로 대입하시오.


class Fibonacci
{
	public static void main(String[] args) 
	{
		int [] num = new int [10];
		
		num [0] = 1;
		num [1] = 1;

		for (int i = 2; i < num.length; i++)
		{
			num[i] = num[i-1] + num[i-2];
		}
		for (int i = 0; i < num.length; i++)
		{
			System.out.print("[" + num[i] + "]");
		}
	}
}
/*
import java.util.Scanner;

class ArrayTest 
{
	public static void main(String[] args) 
	{
		int [] array=new int[10];
		int a=1,b=1,temp=0;

		for(int i=0;i<10;i++){
			array[i]=a;

			temp=b;
			b=a+b;
			a=temp;
		}

		for(int i=0;i<10;i++){
			System.out.println(array[i]);
		}

		
	}
}*/


/*ex5 길이가 100개인 int타입 배열에 정수 1~100를 순차적으로 대입하시오. 
다만, 3의 배수라면 3333, 5의 배수라면 5555, 3과 5의 공배수라면 3535를 대입하시오.*/


class Hundred3
{
	public static void main(String[] args) 
	{
		int [] num = new int [100];

		for (int i = 0; i<num.length; i++)
		{
			num[i] = i + 1;
			if (num[i]%3==0&&num[i]%5==0)
			{
				num[i] = 3535;
			}
			else if (num[i]%5==0)
			{
				num[i] = 5555;
			}
			else if (num[i]%3==0)
			{
				num[i] = 3333;
			}
			else
			{
				num[i] = i+1;
			}
		}
		for (int i = 0; i < num.length; i++)
		{
			System.out.println(num[i]);
		}
	}
}

/*ex6 좌석번호가 1부터 100번인 콘서트장이 있다, 10개의 좌석이 한열이고, 10개의 열이 있다.
핸드폰번호와 좌석번호(행과 열)를 입력하여 예약받는 프로그램을 만드시오.
-전체 좌석 출력시 예약된 자리는 'ㅇ' 로 표시하고, 이미 예약된 자리를 예약하려고 하면, 이미 예약한 사람의 휴대폰 번호를 출력하시오.*/


import java.util.Scanner;

class Seat
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String phone;
        	int row, col;
		String [] seats = new String [100]; //배열의 크기를 설정
		
		while (true) // true값을 통하여 계속해서 반복 입력 받을수 있도록함
		{
			System.out.println("예약자의 핸드폰 번호를 입력 : ");
			phone = sc.next();
			
			System.out.println("예약좌석을 입력 (1~10행) : ");
			row = sc.nextInt();
			
			System.out.println("예약좌석을 입력 (1~10열) : ");
			col = sc.nextInt();

		if (seats[(row-1)*10+(col-1)] == null) //예약확인
		{ //두 수를 입력받기 때문에 순서에 맞는 번호 연산이 필요
			seats[(row-1)*10+(col-1)] = phone; // 연산된 좌석에는 입력받은 번호가 등록
		}
		else
		{
			System.out.println("예약된 좌석입니다."); //if 조건을 만족하지 않는다면 예약된 자리이기 때문
			System.out.println(seats[(row-1)*10+(col-1)]);
		}

		for (int i = 0; i<100; i++)
		{
			if (seats[i] == null)
			{
				System.out.print("[]");
			}
			else
			{
				System.out.print("[o]");
			}
				
			if(((i+1)%10)==0) //좌석을 행과 열로 보이기 위하여 필요
			{
				System.out.println();
			}
		}
		}
	}
}


//ex7 100자리가 다 차면, 종료하게 만드시오.


import java.util.Scanner;

class Seat
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String phone;
        int row, col;
		String [] seats = new String [100];
		
		while (true)
		{
			System.out.println("예약자의 핸드폰 번호를 입력 : ");
			phone = sc.next();
			
			System.out.println("예약좌석을 입력 (1~10행) : ");
			row = sc.nextInt();
			
			System.out.println("예약좌석을 입력 (1~10열) : ");
			col = sc.nextInt();

		if (seats[(row-1)*10+(col-1)] == null)
		{
			seats[(row-1)*10+(col-1)] = phone;
		}
		else
		{
			System.out.println("예약된 좌석입니다.");
			System.out.println(seats[(row-1)*10+(col-1)]);
		}

		for (int i = 0; i<100; i++)
		{
			if (seats[i] == null)
			{
				System.out.print("[]");
			}
			else
			{
				System.out.print("[o]");
			}
			if(((i+1)%10)==0)
			{
				System.out.println();
			}
		}
		if (seats.equals("[o]"))
		{
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
		}
	}
}


//ex8 같은 휴대전화는 예약 하지 못하게 하시오.


/*ex9 철수는 올해 50권의 책을 읽으려고한다. 읽은 책 제목을 입력하면 
String의 배열에 순차적으로 대입이 되며, 한 권 입력시, 한 번 전체 읽은 책 제목들이 출력이 된다. 
프로그램으로 구현하여라.(철수를 위한 프로그램 만들기)*/


import java.util.Scanner;

class Books
{
	public static void main(String[] args) 
	{
		String book;
		String [] books = new String [50];

		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println("책제목을 입력하세요 : ");
			book = sc.next();
//책 제목을 입력받는 것까지 수행 그러나 전체 출력을 못함 
		for (int i = 0; i < 50; i++)
		{
			books[i] = book;
			if (books[i] == null)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.println("[" + books[i] + "]");
			}
		}
		}
	}
}


/*ex10 D제약회사 제품 품질 관리에서는 1000개의 총 제품 수 중에 10개의 제품을 랜덤 샘플 품질 실험을 하여  
2개가 품질 불합격을 받는 다면 1000개의 제품을 모두 폐기 하고 있다. 
10개의 제품 품질 정보를 입력하여 모두 폐기할지, 납품할지 출력하는 프로그램을 만들어라. 프로세스는 반복 될 수 있다.

예시)

1번째 제품 품질 입력 (1.합격/2.불합격) : 1
2번째 제품 품질 입력 (1.합격/2.불합격) : 1
3번째 제품 품질 입력 (1.합격/2.불합격) : 1
4번째 제품 품질 입력 (1.합격/2.불합격) : 2
5번째 제품 품질 입력 (1.합격/2.불합격) : 1
6번째 제품 품질 입력 (1.합격/2.불합격) : 1
7번째 제품 품질 입력 (1.합격/2.불합격) : 1
8번째 제품 품질 입력 (1.합격/2.불합격) : 2
9번째 제품 품질 입력 (1.합격/2.불합격) : 1
10번째 제품 품질 입력 (1.합격/2.불합격) : 1
결과: 10개의 제품중 2개가 불합격입니다. 1000개 모두 폐기합니다.

1번째 제품 품질 입력 (1.합격/2.불합격) : 1
2번째 제품 품질 입력 (1.합격/2.불합격) : 1
3번째 제품 품질 입력 (1.합격/2.불합격) : 1
4번째 제품 품질 입력 (1.합격/2.불합격) : 1
5번째 제품 품질 입력 (1.합격/2.불합격) : 1
6번째 제품 품질 입력 (1.합격/2.불합격) : 1
7번째 제품 품질 입력 (1.합격/2.불합격) : 1
8번째 제품 품질 입력 (1.합격/2.불합격) : 2
9번째 제품 품질 입력 (1.합격/2.불합격) : 1
10번째 제품 품질 입력 (1.합격/2.불합격) : 1
결과: 10개의 제품중 1개가 불합격입니다. 납품 합니다.

배열로 푼다면 1000개의 index를 보유한 배열을 만들고 값을 입력받는다*/


import java.util.Scanner;

class Medic
{
	public static void main(String[] args) 
	{
		int [] medic = new int [10];
		int counter = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < medic.length; i++)
		{
			System.out.printf("%d번째 제품 품질 입력 (1.합격/2.불합격) : ",i+1);
			medic[i] = sc.nextInt();

			if (medic[i] == 2)
			{
				counter++;
				if (counter >= 2)
				{
					System.out.printf("결과: 10개의 제품중 %d개가 불합격입니다. 1000개 모두 폐기합니다.",counter);
				}
				System.out.printf("결과: 10개의 제품중 %d개가 불합격입니다. 납품 합니다.",counter);
			}
		}
	}
}//입력을 받고 출력을 할 수 있으나 중간에 2를 입력할 경우 문구가 뜨면서 예시처럼 되지 



/*ex11 한 반에 30명인 학급이 있다. 각 학생의 점수를 입력받아, 학급의 평균을 구하는 프로그램을 만드시오. 
매년 학생 수가 달라 질 수 있는데, 어떻게 하면 가장 적게 수고하여 매년 프로그램을 운영 할 수 있을지 고민하시오.*/



/*ex12
지금 까지 배운 것들을 합쳐 소극장 예약 프로그램을 매뉴화 시켜 만들어보자.
(배열과 switch를 사용한다.)
제일 먼저 사용자에게 메뉴를 보여준다.
================
1. 좌석 예약
2. 좌석 예약 취소
3. 좌석 정보 보기
4. 좌석 전체 
5. 좌석 초기화
6. 프로그램 종료
================

1. 좌석 예약 선택시 : 

1-1)먼저 좌석을 보여 준다.
[ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] 

1-2)좌석 번호와 이름을 입력 받는다.
좌석 입력 : 1
예약자 이름 : 홍길동

2. 좌석 전체 출력 선택시 : 
[O] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] */

