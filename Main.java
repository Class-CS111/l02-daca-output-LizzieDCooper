// PARTNER NAME: Lizzie Cooper
// PARTNER NAME:
// CS111 SECTION #: 02
// DATE: 1/31/25

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String firstName = "TEST V";
		String lastName = "SPECIMEN";
		String categoryNum = "C09";
		String cardNum = "SRC0000000725";
		String countryBorn = "Ethiopia";
		String termCondition = "None";
		char gender = 'M';

		String uscNum1 = "000";
		String uscNum2 = "000";
		String uscNum3 = "725";

		String birthDay = "01";
		String birthMonth = "JAN";
		int birthYear = 1920;

		String cardValidDay = "01";
		int cardValidMonth = 01;
		int cardValidYear = 80;

		String cardExpireDay = "05";
		int cardExpireMonth = 10;
		int cardExpireYear = 11;

		//INPUT SECTION
		
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       "+ lastName );
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )   "+ firstName );
		System.out.println("║        |  |           USCIS#  Category  Card#");
		System.out.println("║       _/  \\_         "+ uscNum1 + "-" + uscNum2 + "-" + uscNum3 + " " + categoryNum + " " + cardNum);
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      "+ countryBorn );
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /      "+  termCondition );
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`        "+ birthDay + " " + birthMonth + " " + birthYear + "       " + gender);
		System.out.println("║                       Valid From:    "+ cardValidDay + "/" + cardValidMonth + "/" + cardValidYear);
		System.out.println("║                       Card Expires: "+  cardExpireDay + "/" + cardExpireMonth + "/" + cardExpireYear);
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}