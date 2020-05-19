package benimSinavSorum;

class Denklemler{
	public int x1 = 0;
	public int a = 0;
	public int b = 0;
	public int c = 0;
	public int x2 = 0;
	public String kok ="";
	private int d = 0;
    
	public Denklemler(int a,int b){
    	this.a =a;
		this.b =b;
		denklemCoz(a, b);
    }
	public Denklemler(int a, int b, int c) {
	    	this.a =a;
			this.b =b;
			this.c =c;
			denklemCoz(a, b,c);
	}
    public void setA(int a){
    	this.a=a;
    }
    public void setX1(int a){
    	this.a=a;
    }
    public void setX2(int a){
    	this.a=a;
    }
    public void setB(int b){
    	this.b=b;
    }
    public void setD(int d){
    	this.d= d;
    }
    public void setKok(String kok){
    	this.kok=kok;
    }
    public void setc(int c){
    	this.c=c;
    }
    public int getA(){
    return a;
    }
    public String getKok(){
        return kok;
        }
    public int getX1(){
        return x1;
    }
    public int getX2(){
        return x2;
    }
    public int getB(){
    return b;
    }
    public int denklemCoz(int a, int b)
	{
    	int sonuc = -b / a;
		return sonuc;
	}
	public int[] denklemCoz(int a, int b,int c)
	{
		int d = (b*b) - 4*a*c;
		setD(d);
		int[] kokler = new int[2];
		if(a != 0) {
			if(d > 0) {
				int x1 = (int) ((-b + Math.sqrt(d)) / 2*a);
				int x2 = (int) ((-b - Math.sqrt(d)) / 2*a);
				setX1(x1);
				setX2(x2);
				kokler[0]= x1;
				kokler[1]= x2;
			}
			else if(d == 0) {
				int x1 = -b / 2*a;
				int x2 = this.x1;
				setX1(x1);
				setX2(x2);
				kokler[0]= x1;
				kokler[1]= x2;
			}
			else {
				kokler[0]= 0;
				kokler[1]= 0;
			}
		}
		return kokler;

	}		
}
