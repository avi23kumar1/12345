package practicesddt;

public class Alphanumeric {

	public static void main(String[] args) {
		int n=10;
		String k5="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghiklmnopqrstuvwxyz";
StringBuilder sb=new StringBuilder(n);
for(int i=0;i<n;i++)
{
	int index=(int)(k5.length()*Math.random()); 
	sb.append(k5.charAt(index));
	
}
System.out.println(sb);
	}

}
