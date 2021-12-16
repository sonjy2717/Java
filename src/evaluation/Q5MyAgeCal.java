package evaluation;

import java.util.Calendar;

/*
-birthYear : 태어난 년도 1994를 대입한다.
-nowYear : 현재 년도를 대입한다. 
	단, Calendar클래스를 사용해야 한다.
-myAge : 현재 년도에서 태어난 년도의 차를 구해 대입한다.
 */
public class Q5MyAgeCal {
	
    public static void main(String[] args) {
    	
    	Calendar c = Calendar.getInstance();
    	
        int birthYear = 1996;
        int nowYear = c.get(Calendar.YEAR);
        int myAge = nowYear-birthYear+1;
        System.out.println("내 나이는 " + myAge + "살 입니다.");
    }
}
