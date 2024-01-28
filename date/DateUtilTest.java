package application.date;


public class DateUtilTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		for (;;) {
			System.out.print("Gün?");
			int day = Integer.parseInt(kb.nextLine());

			if (day == 0)
				break;

			System.out.print("Ay?");
			int month = Integer.parseInt(kb.nextLine());

			System.out.print("Yıl?");
			int year = Integer.parseInt(kb.nextLine());

			DateUtil.displayDateTR(day, month, year);
			DateUtil.displayDateEN(day, month, year);
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}