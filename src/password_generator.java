import java.util.Random;
public class password_generator {
 public static void main(String[] args) {
	String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lower="abcdefghijklmnopqrstuvwxyz";
	String num="0123456789";
	String specialChars="!\"#$%&()*+,-./:;<=>?@[\\]^_{|}";
	String Combination =upper+ lower+num+specialChars;
	int len =18;
	char [] password =new char[18];
	Random r=new Random();
	for (int i = 0; i < len; i++) {
		password [i]=Combination.charAt(r.nextInt(Combination.length()));		
	}
	System.out.println("Your Generated Password is: "+ new String(password));
}
}
