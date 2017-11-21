package chap07;

import java.util.*;

class Student {
	private String name;
	private String major;
	private String id;
	private double grade;
	
	public Student(String name, String major, String id, double grade) {  //매개변수를 가진 생성자
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
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String id = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, major, id, grade);
			s.put(name, student); //해시맵을 이용한 저장
		}			
	}
	
	private void output() {
		Set<String> key = s.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next(); 
			Student student = s.get(name); //  해시맵으로 Student 객체 얻어냄
			System.out.println("---------------------------");
			System.out.println("이름:" + student.getName());
			System.out.println("학과:" + student.getMajor());
			System.out.println("학번:" + student.getId());
			System.out.println("학점평균:" + student.getGrade());
		}		
	}

	private void search() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.nextLine(); // 학생 이름 입력
			if(name.equals("그만"))
				return; 
			
			Student student = s.get(name); //  이름을 키로 검색
			if(student == null) { 
				System.out.println(name + " 학생 없습니다.");
			}
			else { // 해시맵에서 검색된  Student 객체
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
