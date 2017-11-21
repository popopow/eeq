package chap07;

import java.util.*;

public class ex4 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();  //벡터 생성
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			int a = scanner.nextInt();
			v.add(a);   //a삽입
			
			if(a == 0) {    //a가 0이면 그만 
				break;
			}
			else {
				Iterator<Integer> it = v.iterator(); //Iterator 객체 얻기
				int sum = 0;
				for(int i = 0; i < v.size(); i++) {
					int n = it.next();
					System.out.print(n + " ");
					sum += n;
				}
				System.out.println();
				System.out.println("현재 평균 " + sum/v.size());	//출력문
			}
		}
	}
}