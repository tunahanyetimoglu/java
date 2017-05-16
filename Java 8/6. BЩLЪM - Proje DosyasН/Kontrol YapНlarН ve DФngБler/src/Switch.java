
public class Switch 
{
	public static void main(String[] args) 
	{
		String gun="Pazartesi";
		
		switch(gun)
		{
		case "Pazartesi":
		case "Salý":
		case "Çarþamba":
		case "Perþembe":
		case "Cuma":
			System.out.println("Hafta içi.Bugün iþ var");
			break;
		
		case "Cumartesi":
		case "Pazar":
			System.out.println("Haftasonu. Bugün iþ yok");
			break;
		
		}
	}

}
