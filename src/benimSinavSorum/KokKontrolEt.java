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
		boolean[] mukemmel = new boolean[3];
		int[] sayilar = new int[3];
		sayilar[0]=Math.abs(a);sayilar[1]=Math.abs(b);sayilar[2]=Math.abs(x1);
		for(int i=0; i<3;i++)
		{
			if(sayilar[i] % 2 == 0) {
				mukemmel[i] = true;
			}
			else {
				mukemmel[i] = false;
			}
			 System.out.println("Kullanýlan deðerler:"+ String.valueOf(sayilar[i]));

		}
		int ciftSay = 0;
		int tekSay = 0;
		for(int i = 0; i<3;i++ )
		{
			if(mukemmel[i] == true && tekSay == 0)
			{
				sonuc = "1.dereceden denkleminiz çift mükemmeldir.";
				setSonuc(sonuc);
				ciftSay++;
			}
			else if(mukemmel[i] == false && ciftSay == 0){
					sonuc = "1.dereceden denkleminiz tek mükemmeldir.";
					setSonuc(sonuc);
					tekSay++;
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
		double[] kokler = denklemCoz(a, b,c);
		int x1 = (int)kokler[0];
		int x2 = (int)kokler[1];
		boolean[] mukemmel = new boolean[5];
		int[] sayilar = new int[5];
		sayilar[0]=a;sayilar[1]=b;sayilar[2]=c;sayilar[3]=x1;
		sayilar[4]=x2;
		if(x1 == 0 && x2 == 0) {
			sonuc = "Denklemin kökü yoktur";
		}
		else {

			for(int i=0; i<5;i++)
			{
				if(sayilar[i] % 2 == 0) {
					mukemmel[i] = true;
				}
				else {
					mukemmel[i] = false;
				}
				 System.out.println("Kullanýlan deðerler:"+ String.valueOf(sayilar[i]));

			}
			int ciftSay = 0;
			int tekSay = 0;
			for(int i = 0; i<mukemmel.length-1;i++ )
			{
				if(mukemmel[i] == true && tekSay == 0)
				{
					sonuc = "2.dereceden denkleminiz çift mükemmeldir.";
					setSonuc(sonuc);
					ciftSay++;
				}
				else if(mukemmel[i] == false && ciftSay == 0){
						sonuc = "2.dereceden denkleminiz tek mükemmeldir.";
						setSonuc(sonuc);
						tekSay++;
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
