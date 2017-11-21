package chap07;

 import java.util.ArrayList; 
 import java.util.Scanner; 

 
 public class ex2 { 
 	public static void main(String[] args) { 
 		ArrayList<String> a = new ArrayList<String>();  // ArrayList 생성 
 		 
 		Scanner scanner = new Scanner(System.in); 
 		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>"); 
		int i = 0; 
 		while( i < 6) { 
 		String b = scanner.next(); 
 		a.add(b);  // 컬렉션에 삽입 
 		i++; 
 	} 
 		double sum = 0; 
		double dd = 0;   //각학점마다 점수지정
 		 
 		for(int j = 0; j < 6; j++) { 
 			switch(a.get(j)) { 
 			case "A": 
 				dd = 4.0; 
 				break; 
 			case "B": 
 				dd = 3.0; 
 				break; 
 			case "C": 
 				dd = 2.0; 
 				break; 
 			case "D": 
 				dd = 1.0; 
 				break; 
 			case "F": 
 				dd = 0.0; 
 				break; 
 			} 
 			sum = sum + dd; 
 		} 
 		 
 		double ave = sum / 6; 
 		System.out.println(ave); 
 	} 
 
 
 } 
