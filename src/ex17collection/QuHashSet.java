package ex17collection;
/*
컬렉션 set에 저장된 객체를 이름으로 검색하자. 
해당 정보가 있으면 해당 어벤져스의 정보를 출력하고 
없으면 "해당 영웅은 없어요ㅜㅜ" 라는 메시지 출력해야 한다. 
검색 부분은 Iterator를 통해 구현하도록 한다.
set계열의 컬렉션은 기본적으로 중복저장을 허용하지 않는다. 
그러나 아래와 같이 새롭게 정의한 클래스에 대해서는 
equals(), hashCode() 메소드를 적절히 오버라이딩 처리해야 
중복을 제거할 수 있다. 메소드 오버라이딩을 통해 hero4 는 
입력되지 않도록 Avengers 클래스를 업데이트 하시오.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Avengers {
	String name;
	String heroName;
	String weapon;
	
	public Avengers(String name, String heroName, String weapon) {
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}
	
	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}
	
	/*
	@Override
	public int hashCode() {
		return Objects.hash(heroName, name, weapon);
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("중복 제거용 equals()메서드 호출");
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Avengers)) {
			return false;
		}
		Avengers other = (Avengers) obj;
		return Objects.equals(heroName, other.heroName) 
				&& Objects.equals(name, other.name)
				&& Objects.equals(weapon, other.weapon);
	}
	*/
	
	@Override
	public int hashCode() {
		// 각 멤버변수의 hashCode값을 얻어온다. 반환타입은 int형이다.
		int nameHCode = this.name.hashCode();
		int heroHCode = this.heroName.hashCode();
		int weaponHCode = this.weapon.hashCode();
		System.out.println("hashCode()호출됨 " + nameHCode);
		// 멤버변수가 2개 이상이라면 고유한 주소 값을 더해서 반환하면 된다.
		return nameHCode + heroHCode + weaponHCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() 호출됨");
		// 매개변수로 전달된 객체를 Avengers타입으로 다운캐스팅한다.
		Avengers avengers = (Avengers)obj;
		// 각각의 멤버변수가 가진 값에 대한 비교를 진행한다.
		if(this.name.equals(avengers.name)
				&& this.heroName.equals(avengers.heroName)
				&& this.weapon.equals(avengers.weapon)) {
			return true; // 값이 동일할때 true반환
		}
		else {
			return false;
		}
	}
}

public class QuHashSet {
	
	public static void main(String[] args) {
		
		HashSet<Avengers> set = new HashSet<Avengers>();
		
		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 
		
		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set) {
			System.out.println(av.toString());			
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("검색할 이름을 입력하세욤:");
		String search = scan.nextLine();
		boolean check = false;
		
		Iterator<Avengers> iter = set.iterator();
		while (iter.hasNext()) {
			Avengers a = iter.next();
			
			if (a.name.equals(search)) {
				System.out.println(a);
				check = true;
			}
		}
		
		if (check) {
			System.out.println("요청하신 정보를 찾았습니다");
		}
		else {
			System.out.println("해당 영웅은 없어요 ㅠㅠ");
		}
		scan.close();
	}
}

