
public class Switch 
{
	public static void main(String[] args) 
	{
		String gun="Pazartesi";
		
		switch(gun)
		{
		case "Pazartesi":
		case "Sal�":
		case "�ar�amba":
		case "Per�embe":
		case "Cuma":
			System.out.println("Hafta i�i.Bug�n i� var");
			break;
		
		case "Cumartesi":
		case "Pazar":
			System.out.println("Haftasonu. Bug�n i� yok");
			break;
		
		}
	}

}
