//WAJP TO GENERATE RANDOM 25 OTP'S &  STORE  IN STRINGBUFFER OBJECT
import java.lang.Math;
class OTP
{
	public int generateOTP()
	{
		int max=10000;
		int min=1;
		int otp=(int)(Math.random()*(max-min)+1)+max;
		return otp;
	}


	public static void main(String[] args) {
		StringBuffer otps = new StringBuffer();
		OTP o = new OTP();

		for(int i=1; i<=25; i++)
			otps.append(o.generateOTP()+"\n");

		System.out.println(otps);
	}
}