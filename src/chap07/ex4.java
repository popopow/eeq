package chap07;

import java.util.*;

public class ex4 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();  //���� ����
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����) >> ");
			int a = scanner.nextInt();
			v.add(a);   //a����
			
			if(a == 0) {    //a�� 0�̸� �׸� 
				break;
			}
			else {
				Iterator<Integer> it = v.iterator(); //Iterator ��ü ���
				int sum = 0;
				for(int i = 0; i < v.size(); i++) {
					int n = it.next();
					System.out.print(n + " ");
					sum += n;
				}
				System.out.println();
				System.out.println("���� ��� " + sum/v.size());	//��¹�
			}
		}
	}
}