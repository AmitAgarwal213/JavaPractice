
public class CheckJava {

	public static void main(String[] args) {
	int n=5,k,f1,f2,f;
	if(n<2) {
		return ;
	}
		else
		{
			f1 = f2=1;
			for(k=2;k<n;k++) {
				f=f1+f2;
				f2=f1;
				f1=f;
				System.out.println(f);
			}
				
	}

}}
