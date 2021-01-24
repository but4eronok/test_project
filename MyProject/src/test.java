public class test {

	public static void main(String[] args) {
		int day = 3;
	    String season;
	    switch (day) {
	        case 1:  season = "Понедельник";
	                 break;
	        case 2:  season = "Вторник";
	                 break;
	        case 3:  season = "Среда";
	                 break;
	        case 4:  season = "Четверг";
	                 break;
	        case 5:  season = "Пятница";
	                 break;
	        case 6:  season = "Суббота";
	                 break;
	        case 7:  season = "Воскресенье";
	                 break;
	        default: season = "Ошибка";
	                 break;
	    }
	    System.out.print(season);
	}
}
