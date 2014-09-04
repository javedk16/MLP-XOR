import java.util.*;

/**
 * XOR using MLP
 **/
 
 
class Dataset
{
	int x,y,out;
	Dataset(int a,int b,int c)
	{
		x = a;
		y = b;
		out = c;
	}
}

class MLP_XOR
{
	public int w11,w12,w21,w22,v11,v21;
	Random r = new Random();
	MLP_XOR()
	{
		
		w11 = 1;
		w12 = 1;
		w21 = 2;
		w22 = 2;
		v11 = 1;
		v21 = 1;
	} 
	
	public int calculateNet(int a, int b,int w1,int w2)
	{
		int net = w1*a + w2*b;
		return binarystep(net);
	}
	
	public int binarystep(int n)
	{
		if (n>=1&&n<=2)
			return 1;
		else return 0;
	}
}

class MLP_XORMain
{
	
	public static void main(String args[])
	{
		int x,y,output,n;
		ArrayList<Dataset> a = new ArrayList<Dataset>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x:");
		x=sc.nextInt();
		System.out.println("Enter y:");
		y=sc.nextInt();
		MLP_XOR m = new MLP_XOR();
		int hidden_inp1,hidden_inp2;
		hidden_inp1 = m.calculateNet(x,y,m.w11,m.w21);
		hidden_inp2 = m.calculateNet(x,y,m.w12,m.w22);

		System.out.println("Output is "+m.calculateNet(hidden_inp1,hidden_inp2,m.v11,m.v21));
		
	}
}
