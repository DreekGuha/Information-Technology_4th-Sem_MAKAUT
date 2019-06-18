class Shape
{
	float v;
	void calculateVolume(float r)
	{
		v=(4.0f/3)*3.14f*r*r*r;
		System.out.println("The volume of Sphere is \n"+ v);
	}
	void calculateVolume(float r, float h)
	{
		v=(1.0f/3)*3.14f*r*r*h;
		System.out.println("The volume of cone is \n"+ v);
	}
	void calculateVolume(float l, float b, float h)
	{
		v=l*b*h;
		System.out.println("The volume of box is \n"+ v);
	}
	public static void main(String[] args) {
		Shape sh1=new Shape();
		sh1.calculateVolume(Float.parseFloat(args[0]));
		sh1.calculateVolume(Float.parseFloat(args[0]),Float.parseFloat(args[1]));
		sh1.calculateVolume(Float.parseFloat(args[2]),Float.parseFloat(args[3]),Float.parseFloat(args[4]));
	}
}