package Data;

public class Data {

	private int start;
	private int money;
	private int monthmoney;
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int as;
	private int bs;
	private int cs;
	
	private int allpower;
	private int allhealth;
	
	private int capinvenpower;
	private int capinvenhealth;
	private int cappower;
	private int cappowerprice;
	private int caphealth;
	private int caphealthprice;
	private int capgrouppower;
	private int capgrouphealth;
	
	private int off;
	private int offinvenpower;
	private int offinvenhealth;
	private int offprice;
	private int offpower;
	private int offpowerprice;
	private int offhealth;
	private int offhealthprice;
	private int offgrouppower;
	private int offgrouphealth;
	
	private int zzol;
	private int zzolinvenpower;
	private int zzolinvenhealth;
	private int zzolprice;
	private int zzolpower;
	private int zzolpowerprice;
	private int zzolhealth;
	private int zzolhealthprice;

	private int caplimit1;
	private int caplimit2;
	private int caplimit3;
	private int caplimit4;
	private int caplimit5;
	private int caplimit6;
	private int caplimit7;
	
	private int offlimit1;
	private int offlimit2;
	private int offlimit3;
	private int offlimit4;
	private int offlimit5;
	private int offlimit6;
	private int offlimit7;
	
	private int zzollimit1;
	private int zzollimit2;
	private int zzollimit3;
	private int zzollimit4;
	private int zzollimit5;
	private int zzollimit6;
	private int zzollimit7;
	
	private int map1;
	private int map2;
	private int map3;
	private int map4;
	private int map5;
	private int map6;
	private int map7;
	private int map8;
	private int map9;
	private int map10;
	private int map11;
	private int map12;
	private int map13;
	private int map14;
	private int map15;
	private int map16;
	
	private int ending;
	
	public Data() {
		start = 0;
		money = 1000;
		monthmoney = 500;
		year=0;
		month=0;
		day=0;
		hour=0;
		minute=0;
		as=0;
		bs=0;
		cs=0;
		
		capinvenpower = 0;
		capinvenhealth = 0;
		cappower = 10;
		cappowerprice = 50;
		caphealth = 100;
		caphealthprice= 50;
		
		off = 2;
		offinvenpower = 0;
		offinvenhealth =0;
		offprice=500;
		offpower = 5;
		offpowerprice =30;
		offhealth = 50;
		offhealthprice=30;
		
		zzol = 10;
		zzolinvenpower=0;
		zzolinvenhealth=0;
		zzolprice = 500;
		zzolpower = 1;
		zzolpowerprice=20;
		zzolhealth = 10;
		zzolhealthprice=20;
		
		capgrouppower = cappower+capinvenpower+(zzolpower+zzolinvenpower)*zzol;
		capgrouphealth = caphealth+capinvenhealth+(zzolhealth+zzolinvenhealth)*zzol;
		
		offgrouppower = offpower+offinvenpower+(zzolpower+zzolinvenpower)*zzol;
		offgrouphealth = offhealth+offinvenhealth+(zzolhealth+zzolinvenhealth)*zzol;
		
		allpower=cappower+capinvenpower+(zzolpower+zzolinvenpower)*zzol+(offpower+offinvenpower+(zzolpower+zzolinvenpower)*zzol)*off;
		allhealth=caphealth+capinvenhealth+(zzolhealth+zzolinvenhealth)*zzol+(offhealth+offinvenhealth+(zzolhealth+zzolinvenhealth)*zzol)*off;
		
		caplimit1 = 0;
		caplimit2 = 0;
		caplimit3 = 0;
		caplimit4 = 0;
		caplimit5 = 0;
		caplimit6 = 0;
		caplimit7 = 0;
		
		offlimit1 = 0;
		offlimit2 = 0;
		offlimit3 = 0;
		offlimit4 = 0;
		offlimit5 = 0;
		offlimit6 = 0;
		offlimit7 = 0;
		
		zzollimit1 = 0;
		zzollimit2 = 0;
		zzollimit3 = 0;
		zzollimit4 = 0;
		zzollimit5 = 0;
		zzollimit6 = 0;
		zzollimit7 = 0;
		
		map1=0;
		map2=0;
		map3=0;
		map4=0;
		map5=0;
		map6=0;
		map7=0;
		map8=0;
		map9=0;
		map10=0;
		map11=0;
		map12=0;
		map13=0;
		map14=0;
		map15=0;
		map16=0;
		
		ending=0;
	}
	
	public void save() {
		try {
			File.saveProperties(this);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void load() {
		try {
			File.loadProperties(this);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void SetStart(int start) {
		this.start = start;
	}
	
	public int GetStart() {
		return start;
	}
	
	public void SetYear(int year) {
		this.year = year;
	}
	
	public int GetYear() {
		return year;
	}
	
	public void SetMonth(int month) {
		this.month = month;
	}
	
	public int GetMonth() {
		return month;
	}
	
	public void SetDay(int day) {
		this.day = day;
	}
	
	public int GetDay() {
		return day;
	}
	
	public void SetHour(int hour) {
		this.hour = hour;
	}
	
	public int GetHour() {
		return hour;
	}
	
	public void SetMinute(int minute) {
		this.minute = minute;
	}
	
	public int GetMinute() {
		return minute;
	}
	
	public void SetMoney(int money) {
		this.money = money;
	}
	
	public int GetMoney() {
		return money;
	}
	
	public void SetMonthMoney(int monthmoney) {
		this.monthmoney = monthmoney;
	}
	
	public int GetMonthMoney() {
		return monthmoney;
	}
	
	public void SetAs(int as) {
		this.as=as;
	}
	
	public int GetAs() {
		return as;
	}
	
	public void SetBs(int bs) {
		this.bs=bs;
	}
	
	public int GetBs() {
		return bs;
	}
	
	public void SetCs(int cs) {
		this.cs=cs;
	}
	
	public int GetCs() {
		return cs;
	}
	
	public void SetAllPower(int allpower) {
		this.allpower = allpower;
	}
	
	public int GetAllPower() {
		return allpower;
	}
	
	public void SetAllHealth(int allhealth) {
		this.allhealth = allhealth;
	}
	
	public int GetAllHealth() {
		return allhealth;
	}
	
	public void SetCapInvenPower(int capinvenpower) {
		this.capinvenpower = capinvenpower;
	}
	
	public int GetCapInvenPower() {
		return capinvenpower;
	}
	
	public void SetCapInvenHealth(int capinvenhealth) {
		this.capinvenhealth = capinvenhealth;
	}
	
	public int GetCapInvenHealth() {
		return capinvenhealth;
	}
	
	public void SetCapPower(int cappower) {
		this.cappower = cappower;
	}
	
	public int GetCapPower() {
		return cappower;
	}
	
	public void SetCapPowerPrice(int cappowerprice) {
		this.cappowerprice = cappowerprice;
	}
	
	public int GetCapPowerPrice() {
		return cappowerprice;
	}
	
	public void SetCapHealth(int caphealth) {
		this.caphealth = caphealth;
	}
	
	public int GetCapHealth() {
		return caphealth;
	}
	
	public void SetCapHealthPrice(int caphealthprice) {
		this.caphealthprice = caphealthprice;
	}
	
	public int GetCapHealthPrice() {
		return caphealthprice;
	}
	
	public void SetCapGroupPower(int capgrouppower) {
		this.capgrouppower = capgrouppower;
	}
	
	public int GetCapGroupPower() {
		return capgrouppower;
	}
	
	public void SetCapGroupHealth(int capgrouphealth) {
		this.capgrouphealth = capgrouphealth;
	}
	
	public int GetCapGroupHealth() {
		return capgrouphealth;
	}
	
	public void SetOff(int off) {
		this.off = off;
	}
	
	public int GetOff() {
		return off;
	}
	
	public void SetOffInvenPower(int offinvenpower) {
		this.offinvenpower = offinvenpower;
	}
	
	public int GetOffInvenPower() {
		return offinvenpower;
	}
	
	public void SetOffInvenHealth(int offinvenhealth) {
		this.offinvenhealth = offinvenhealth;
	}
	
	public int GetOffInvenHealth() {
		return offinvenhealth;
	}
	
	public void SetOffPrice(int offprice) {
		this.offprice = offprice;
	}
	
	public int GetOffPrice() {
		return offprice;
	}
	
	public void SetOffPower(int offpower) {
		this.offpower = offpower;
	}
	
	public int GetOffPower() {
		return offpower;
	}
	
	public void SetOffPowerPrice(int offpowerprice) {
		this.offpowerprice = offpowerprice;
	}
	
	public int GetOffPowerPrice() {
		return offpowerprice;
	}
	
	public void SetOffHealth(int offhealth) {
		this.offhealth = offhealth;
	}
	
	public int GetOffHealth() {
		return offhealth;
	}
	
	public void SetOffHealthPrice(int offhealthprice) {
		this.offhealthprice = offhealthprice;
	}
	
	public int GetOffHealthPrice() {
		return offhealthprice;
	}
	
	public void SetOffGroupPower(int offgrouppower) {
		this.offgrouppower = offgrouppower;
	}
	
	public int GetOffGroupPower() {
		return offgrouppower;
	}
	
	public void SetOffGroupHealth(int offgrouphealth) {
		this.offgrouphealth = offgrouphealth;
	}
	
	public int GetOffGroupHealth() {
		return offgrouphealth;
	}
	
	public void SetZzol(int zzol) {
		this.zzol = zzol;
	}
	
	public int GetZzol() {
		return zzol;
	}
	
	public void SetZzolInvenPower(int zzolinvenpower) {
		this.zzolinvenpower = zzolinvenpower;
	}
	
	public int GetZzolInvenPower() {
		return zzolinvenpower;
	}
	
	public void SetZzolInvenHealth(int zzolinvenhealth) {
		this.zzolinvenhealth = zzolinvenhealth;
	}
	
	public int GetZzolInvenHealth() {
		return zzolinvenhealth;
	}
	
	public void SetZzolPrice(int zzolprice) {
		this.zzolprice = zzolprice;
	}
	
	public int GetZzolPrice() {
		return zzolprice;
	}
	
	public void SetZzolPower(int zzolpower) {
		this.zzolpower = zzolpower;
	}
	
	public int GetZzolPower() {
		return zzolpower;
	}
	
	public void SetZzolPowerPrice(int zzolpowerprice) {
		this.zzolpowerprice = zzolpowerprice;
	}
	
	public int GetZzolPowerPrice() {
		return zzolpowerprice;
	}
	
	public void SetZzolHealth(int zzolhealth) {
		this.zzolhealth = zzolhealth;
	}
	
	public int GetZzolHealth() {
		return zzolhealth;
	}
	
	public void SetZzolHealthPrice(int zzolhealthprice) {
		this.zzolhealthprice = zzolhealthprice;
	}
	
	public int GetZzolHealthPrice() {
		return zzolhealthprice;
	}
	
	public void SetCapLimit1(int bool) {
		this.caplimit1=bool;
	}
	
	public int GetCapLimit1() {
		return caplimit1;
	}
	
	public void SetCapLimit2(int bool) {
		this.caplimit2=bool;
	}
	
	public int GetCapLimit2() {
		return caplimit2;
	}
	
	public void SetCapLimit3(int bool) {
		this.caplimit3=bool;
	}
	
	public int GetCapLimit3() {
		return caplimit3;
	}
	
	public void SetCapLimit4(int bool) {
		this.caplimit4=bool;
	}
	
	public int GetCapLimit4() {
		return caplimit4;
	}
	
	public void SetCapLimit5(int bool) {
		this.caplimit5=bool;
	}
	
	public int GetCapLimit5() {
		return caplimit5;
	}
	
	public void SetCapLimit6(int bool) {
		this.caplimit6=bool;
	}
	
	public int GetCapLimit6() {
		return caplimit6;
	}
	
	public void SetCapLimit7(int bool) {
		this.caplimit7=bool;
	}
	
	public int GetCapLimit7() {
		return caplimit7;
	}
	
	public void SetOffLimit1(int bool) {
		this.offlimit1=bool;
	}
	
	public int GetOffLimit1() {
		return offlimit1;
	}
	
	public void SetOffLimit2(int bool) {
		this.offlimit2=bool;
	}
	
	public int GetOffLimit2() {
		return offlimit2;
	}
	
	public void SetOffLimit3(int bool) {
		this.offlimit3=bool;
	}
	
	public int GetOffLimit3() {
		return offlimit3;
	}
	
	public void SetOffLimit4(int bool) {
		this.offlimit4=bool;
	}
	
	public int GetOffLimit4() {
		return offlimit4;
	}
	
	public void SetOffLimit5(int bool) {
		this.offlimit5=bool;
	}
	
	public int GetOffLimit5() {
		return offlimit5;
	}
	
	public void SetOffLimit6(int bool) {
		this.offlimit6=bool;
	}
	
	public int GetOffLimit6() {
		return offlimit6;
	}
	
	public void SetOffLimit7(int bool) {
		this.offlimit7=bool;
	}
	
	public int GetOffLimit7() {
		return offlimit7;
	}
	
	public void SetZzolLimit1(int bool) {
		this.zzollimit1=bool;
	}
	
	public int GetZzolLimit1() {
		return zzollimit1;
	}
	
	public void SetZzolLimit2(int bool) {
		this.zzollimit2=bool;
	}
	
	public int GetZzolLimit2() {
		return zzollimit2;
	}
	
	public void SetZzolLimit3(int bool) {
		this.zzollimit3=bool;
	}
	
	public int GetZzolLimit3() {
		return zzollimit3;
	}
	
	public void SetZzolLimit4(int bool) {
		this.zzollimit4=bool;
	}
	
	public int GetZzolLimit4() {
		return zzollimit4;
	}
	
	public void SetZzolLimit5(int bool) {
		this.zzollimit5=bool;
	}
	
	public int GetZzolLimit5() {
		return zzollimit5;
	}
	
	public void SetZzolLimit6(int bool) {
		this.zzollimit6=bool;
	}
	
	public int GetZzolLimit6() {
		return zzollimit6;
	}
	
	public void SetZzolLimit7(int bool) {
		this.zzollimit7=bool;
	}
	
	public int GetZzolLimit7() {
		return zzollimit7;
	}
	
	public void SetMap1(int map) {
		this.map1=map;
	}
	
	public int GetMap1() {
		return map1;
	}
	
	public void SetMap2(int map) {
		this.map2=map;
	}
	
	public int GetMap2() {
		return map2;
	}
	
	public void SetMap3(int map) {
		this.map3=map;
	}
	
	public int GetMap3() {
		return map3;
	}
	
	public void SetMap4(int map) {
		this.map4=map;
	}
	
	public int GetMap4() {
		return map4;
	}
	
	public void SetMap5(int map) {
		this.map5=map;
	}
	
	public int GetMap5() {
		return map5;
	}
	
	public void SetMap6(int map) {
		this.map6=map;
	}
	
	public int GetMap6() {
		return map6;
	}
	
	public void SetMap7(int map) {
		this.map7=map;
	}
	
	public int GetMap7() {
		return map7;
	}
	
	public void SetMap8(int map) {
		this.map8=map;
	}
	
	public int GetMap8() {
		return map8;
	}
	
	public void SetMap9(int map) {
		this.map9=map;
	}
	
	public int GetMap9() {
		return map9;
	}
	
	public void SetMap10(int map) {
		this.map10=map;
	}
	
	public int GetMap10() {
		return map10;
	}
	
	public void SetMap11(int map) {
		this.map11=map;
	}
	
	public int GetMap11() {
		return map11;
	}
	
	public void SetMap12(int map) {
		this.map12=map;
	}
	
	public int GetMap12() {
		return map12;
	}
	
	public void SetMap13(int map) {
		this.map13=map;
	}
	
	public int GetMap13() {
		return map13;
	}
	
	public void SetMap14(int map) {
		this.map14=map;
	}
	
	public int GetMap14() {
		return map14;
	}
	
	public void SetMap15(int map) {
		this.map15=map;
	}
	
	public int GetMap15() {
		return map15;
	}
	
	public void SetMap16(int map) {
		this.map16=map;
	}
	
	public int GetMap16() {
		return map16;
	}
	
	public void SetEnding(int ending) {
		this.ending=ending;
	}
	
	public int GetEnding() {
		return ending;
	}
}
