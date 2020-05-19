package benimSinavSorum;

class Denklemler{
	public double x1 = 0;
	public double a = 0;
	public double b = 0;
	public double c = 0;
	public double x2 = 0;
	public String kok ="";
	private double d = 0;
    
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
    public void setX1(double x1){
    	this.a=x1;
    }
    public void setX2(double x2){
    	this.a=x2;
    }
    public void setB(int b){
    	this.b=b;
    }
    public void setD(double d){
    	this.d= d;
    }
    public void setKok(String kok){
    	this.kok=kok;
    }
    public void setc(int c){
    	this.c=c;
    }
    public double getA(){
    return a;
    }
    public String getKok(){
        return kok;
        }
    public double getX1(){
        return x1;
    }
    public double getX2(){
        return x2;
    }
    public double getB(){
    return b;
    }
    public int denklemCoz(int a, int b)
	{
    	int sonuc = -b / a;
		return sonuc;
	}
	public double[] denklemCoz(int a, int b,int c)
	{
		double d = (b*b) - 4*a*c;
		setD(d);
		double[] kokler = new double[2];
		if(a != 0) {
			if(d > 0) {
				double karekok = Math.sqrt(d);
				double bolum = -b + karekok;
				double bolum2 = -b - karekok;
				double alt = 2*a;
				double x1 =  bolum / alt;
				double x2 =  bolum2 / alt;
				setX1(x1);
				setX2(x2);
				kokler[0]= x1;
				kokler[1]= x2;
			}
			else if(d == 0) {
				double alt = 2*a;
				double x1 = -b / alt;
				setX1(x1);
				setX2(x2);
				kokler[0]= x1;
				kokler[1]= x1;
			}
			else {
				kokler[0]= 0;
				kokler[1]= 0;
			}
		}
		return kokler;

	}		
}
