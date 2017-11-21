package chap07;

import java.util.*;

class Student {
	private String name;
	private String major;
	private String id;
	private double grade;
	
	public Student(String name, String major, String id, double grade) {  //�Ű������� ���� ������
		this.name = name;
		this.major = major;
		this.id = id;
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	public void setId(String Id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public Double getGrade() {
		return grade;
	}
	
}
public class ex52 {
	HashMap<String, Student> s = new HashMap<String, Student>();
	Scanner scanner = new Scanner(System.in);
	
	private void put() {
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String id = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, major, id, grade);
			s.put(name, student); //�ؽø��� �̿��� ����
		}			
	}
	
	private void output() {
		Set<String> key = s.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next(); 
			Student student = s.get(name); //  �ؽø����� Student ��ü ��
			System.out.println("---------------------------");
			System.out.println("�̸�:" + student.getName());
			System.out.println("�а�:" + student.getMajor());
			System.out.println("�й�:" + student.getId());
			System.out.println("�������:" + student.getGrade());
		}		
	}

	private void search() {
		while(true) {
			System.out.print("�л� �̸� >> ");
			String name = scanner.nextLine(); // �л� �̸� �Է�
			if(name.equals("�׸�"))
				return; 
			
			Student student = s.get(name); //  �̸��� Ű�� �˻�
			if(student == null) { 
				System.out.println(name + " �л� �����ϴ�.");
			}
			else { // �ؽøʿ��� �˻���  Student ��ü
				System.out.print(student.getName() + ", ");
				System.out.print(student.getMajor() + ", ");
				System.out.print(student.getId() + ", ");
				System.out.println(student.getGrade());
			}
		}
	}
	
	public void run() {
		put();
		output();
		search();
	}
	
	public static void main (String[] args) {
		ex52 st = new ex52();
		st.run();
	}
}
