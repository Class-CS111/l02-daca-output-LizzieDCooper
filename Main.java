// PARTNER NAME: Lizzie Cooper
// PARTNER NAME: N/A
// CS111 SECTION #: Lab 02
// DATE: 1/31/25

public class Main
{
	public static void main(String[] args)
	{
	
		//CONSTANTS 
		final String ANSI_BG_RED = "\u001B[41m";
		final String ANSI_BOLD = "\u001B[1m";
		final String ANSI_RESET = "\u001B[0m";
		final String TITLE_USA = ANSI_BG_RED + ANSI_BOLD + "UNITED STATES OF AMERICA" + ANSI_RESET;
		final String TITLE_EMPLOYMENT = ANSI_BG_RED + ANSI_BOLD + "EMPLOYMENT AUTHORIZATION CARD" + ANSI_RESET;

		//DECLARATION + INITIALIZATION SECTION
		String firstName = ANSI_BOLD+"TEST V";
		String lastName = ANSI_BOLD+"SPECIMEN";
		String categoryNum =ANSI_BOLD+ "C09";
		String cardNum = ANSI_BOLD+"SRC0000000725";
		String countryBorn = ANSI_BOLD+"Ethiopia";
		String termCondition = ANSI_BOLD+"None";
		char gender = 'M';

		String uscNum1 = ANSI_BOLD+"000";
		String uscNum2 = ANSI_BOLD+"000";
		String uscNum3 = ANSI_BOLD+"725";

		String birthDay = ANSI_BOLD+"01";
		String birthMonth = ANSI_BOLD+"JAN";
		String birthYear = ANSI_BOLD+"1920";

		String cardValidDay = ANSI_BOLD+"01";
		String cardValidMonth = ANSI_BOLD+"01";
		String cardValidYear = ANSI_BOLD+"80";

		String cardExpireDay = ANSI_BOLD+"05";
		String cardExpireMonth = ANSI_BOLD+"10";
		String cardExpireYear = ANSI_BOLD+"11";

		//INPUT SECTION
		
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║          " + TITLE_USA + " ");
		System.out.println("║                                  " + TITLE_EMPLOYMENT + "");
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