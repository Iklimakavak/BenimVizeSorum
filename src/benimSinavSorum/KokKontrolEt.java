package benimSinavSorum;

class KokKontrolEt extends Denklemler{
	private String sonuc ="";
	
	public KokKontrolEt(int a, int b){
		super(a,b);
		mukemmelDenklem(a,b);
	}
	public KokKontrolEt(int a, int b,int c){
		super(a,b,c);
		mukemmelDenklem(a,b,c);
	}
	public String getSonuc(){
		return sonuc;
	}
	 public void setSonuc(String sonuc){
	     this.sonuc =sonuc;
	}
	public void mukemmelDenklem(int a, int b) {
		int x1 = denklemCoz(a, b);
		boolean[] mukemmel = new boolean[4];
		int[] sayilar = new int[3];
		sayilar[0]=a;sayilar[1]=b;sayilar[2]=x1;
		for(int i=0; i<3;i++)
		{
			if(sayilar[i]%2 == 0) {
				mukemmel[i] = true;
			}
			else {
				mukemmel[i] = false;
			}
		}
		for(int i = 0; i<mukemmel.length-1;i++ )
		{
			if(mukemmel[i] == true)
			{
				sonuc = "1.dereceden denkleminiz mükemmeldir.";
				setSonuc(sonuc);
			}
			else {
				sonuc = "1.dereceden denkleminiz mükemmel deðildir.";
				setSonuc(sonuc);
				break;
			}
		}
		System.out.println(getSonuc());
	}
	public void mukemmelDenklem(int a,int b,int c){
		int[] kokler = denklemCoz(a, b,c);
		int x1 = kokler[0];
		int x2 = kokler[1];
		boolean[] mukemmel = new boolean[6];
		int[] sayilar = new int[6];
		sayilar[0]=a;sayilar[1]=b;sayilar[3]=x1;sayilar[4]=c;
		sayilar[3]=x1;sayilar[5]=x2;
		if(x1 == 0 && x2 == 0) {
			sonuc = "Denklemin kökü yoktur";
		}
		else {

			for(int i=0; i<6;i++)
			{
				if(sayilar[i]%2 == 0) {
					mukemmel[i] = true;
				}
				else {
					mukemmel[i] = false;
				}
			}
			for(int i = 0; i<mukemmel.length-1;i++ )
			{
				if(mukemmel[i] == true)
				{
					sonuc = "2.dereceden denkleminiz mükemmeldir.";
					setSonuc(sonuc);
				}
				else {
					sonuc = "2.dereceden denkleminiz mükemmel deðildir.";
					setSonuc(sonuc);
					break;
				}
			}
		}
		 System.out.println(getSonuc());
	}

}
