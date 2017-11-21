package chap07;

import java.util.*;

class Locations {
	private String city;
	private int longitude;
	private int latitude;
	
	public Locations(String city, int longitude, int latitude) {  //�Ű������� ���� ������
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
			System.out.println("����, �浵, ������ �Է��ϼ���.");	//��¹�
			for (int i=0; i<4; i++) {
				System.out.print(">> ");
				String text = scanner.nextLine();
				StringTokenizer st = new StringTokenizer(text, ",");
				String city = st.nextToken().trim();
				int longitude = Integer.parseInt(st.nextToken().trim());
				int latitude = Integer.parseInt(st.nextToken().trim());
				
				Locations locations = new Locations(city, longitude, latitude);
				s.put(city, locations); //�ؽøʿ� ����
			}			
		}
		
		private void output() {
			Set<String> key = s.keySet();
			Iterator<String> it = key.iterator();
			System.out.println("---------------------------");
			while (it.hasNext()) {
				String city = it.next(); 
				Locations locations = s.get(city); // �ؽø����� Student ��ü ��
				System.out.println(city + "   " + locations.getLongitude() + "   "  + locations.getLatitude());
				System.out.println("�а�:" + locations.getLongitude());
				System.out.println("�й�:" + locations.getLatitude());
			}		
		}

		private void search() {
			while(true) {
				System.out.print("���� �̸� >> ");
				String city = scanner.nextLine(); // �л� �̸� �Է�
				if(city.equals("�׸�"))
					return; 
				
				Locations locations = s.get(city); // �ؽøʿ��� �̸��� Ű�� �˻�
				if(locations == null) { 
					System.out.println(city + "�¾����ϴ�.");
				}
				else { // ã�Ƴ� ��ü student
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
