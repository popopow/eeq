package chap07;

import java.util.*;

class Locations {
	private String city;
	private int longitude;
	private int latitude;
	
	public Locations(String city, int longitude, int latitude) {  //매개변수를 가진 생성자
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLatitude() {
		return latitude;
	}
	
}
public class ex6 {
		HashMap<String, Locations> s = new HashMap<String, Locations>();
		Scanner scanner = new Scanner(System.in);
		
		private void put() {
			System.out.println("도시, 경도, 위도를 입력하세요.");	//출력문
			for (int i=0; i<4; i++) {
				System.out.print(">> ");
				String text = scanner.nextLine();
				StringTokenizer st = new StringTokenizer(text, ",");
				String city = st.nextToken().trim();
				int longitude = Integer.parseInt(st.nextToken().trim());
				int latitude = Integer.parseInt(st.nextToken().trim());
				
				Locations locations = new Locations(city, longitude, latitude);
				s.put(city, locations); //해시맵에 저장
			}			
		}
		
		private void output() {
			Set<String> key = s.keySet();
			Iterator<String> it = key.iterator();
			System.out.println("---------------------------");
			while (it.hasNext()) {
				String city = it.next(); 
				Locations locations = s.get(city); // 해시맵으로 Student 객체 얻어냄
				System.out.println(city + "   " + locations.getLongitude() + "   "  + locations.getLatitude());
				System.out.println("학과:" + locations.getLongitude());
				System.out.println("학번:" + locations.getLatitude());
			}		
		}

		private void search() {
			while(true) {
				System.out.print("도시 이름 >> ");
				String city = scanner.nextLine(); // 학생 이름 입력
				if(city.equals("그만"))
					return; 
				
				Locations locations = s.get(city); // 해시맵에서 이름을 키로 검색
				if(locations == null) { 
					System.out.println(city + "는없습니다.");
				}
				else { // 찾아낸 객체 student
					System.out.print(locations.getCity() + "   ");
					System.out.print(locations.getLongitude() + "   ");
					System.out.println(locations.getLatitude() + "   ");
				}
			}
		}
		
		public void run() {
			put();
			output();
			search();
		}
		public static void main(String[] args) {
			ex6 st = new ex6();
			st.run();
	}

}
