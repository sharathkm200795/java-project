class rect_commd
{
	int length;
	int width;
	void getdata(int l,int w)
	{
		length=l;
		width=w;
	}
	int area()
	{
		int n;
		n=length*width;
		return(n);
	}
}
class rectangle_demo
{
	public static void main(String args[])
	{
		rect_commd r1=new rect_commd();
		int l=Integer.parseInt(args[0]);
		int w=Integer.parseInt(args[1]);
		r1.getdata(l,w);
		r1.area();
		System.out.println("area of reactangle is="+r1.area());
	}
}