package argument;

public class argument {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		
		switch(i){
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sal�");
			break;
		case 3:
			System.out.println("�ar�amba");
			break;
		case 4:
			System.out.println("Per�embe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Hatal� say�");
			break;
		}
		
		for(int j = 0; j<args.length;j++){
			System.out.println(args[j]);
		}
	}

}
