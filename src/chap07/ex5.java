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
	
public class ex5{
		ArrayList<Student> s = new ArrayList<Student>();
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
				s.add(student); // ArrayList에 삽입
			}			
		}
		
		private void output() { 
			Iterator<Student> it = s.iterator();
			while (it.hasNext()) {
				Student student = it.next();
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
				
				for(int i=0; i<s.size(); i++) { // s에 있는 모든 학생 검색
					Student student = s.get(i); 
					if(student.getName().equals(name)) { 
						System.out.print(student.getName() + ", ");
						System.out.print(student.getMajor() + ", ");
						System.out.print(student.getId() + ", ");
						System.out.println(student.getGrade());
						break; 
					}
				}
			}
		}
		
		public void run() {
			put();
			output();
			search();
		}
		public static void main(String[] args) {
			ex5 st = new ex5();
			st.run();
	}

}
