package Other;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class MD5
{
	public static void main(String[] args) throws NoSuchAlgorithmException
	{
		System.out.println("Jigar : "+getMD5("Jigar"));
		System.out.println("jigar : "+getMD5("jigar"));
	}
	
	public static String getMD5(String input)
	{
		try
		{
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger number = new BigInteger(1, messageDigest);
			String hashtext = number.toString(16);
			// Now we need to zero pad it if you actually want the full 32 chars.
			while (hashtext.length() < 32)
			{
				hashtext = "0" + hashtext;
			}
			return hashtext;
		}
		catch (NoSuchAlgorithmException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		//return hashtext;
	}
}