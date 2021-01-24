public class Months {
	
	public static void main(String[] args) {
		int month = 11;
		String season;
		switch (month) {
			case 1, 2, 12: season = "winter";
			break;
			case 3, 4, 5: season = "spring";
			break;
			case 6, 7, 8: season = "summer";
			break;
			case 9, 10, 11: season = "autumn";
			break;
	        default: season = "Ошибка";
            break;
		}
		System.out.print(season);
	}
}