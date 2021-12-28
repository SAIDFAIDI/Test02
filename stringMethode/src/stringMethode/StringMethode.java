package stringMethode;

public class StringMethode {
	
	public static void main(String[] args) {
	
	String S ="faidi";
	System.out.println("avant = "+S);
	
	//S=S.toUpperCase();
	System.out.println("apres = "+S);
	
	//masculation de la 1ere lettre en java :
	char[] arr = S.toCharArray();
	arr[0]=Character.toUpperCase(arr[0]);
	S = new String(arr);
	System.out.println("apres = "+S);
	
	}

}
