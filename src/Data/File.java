package Data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class File {
	
    private static String propertiesFileName = "config.properties";

    private static String name = "김영우";
    private static String title = "MAPIA_GAME~";
    
    private static int start;
    private static int money;
    private static int monthmoney;
    private static int year;
    private static int month;
    private static int day;
    private static int hour;
    private static int minute;
    private static int as;
    private static int bs;
    private static int cs;
    
    private static int allpower;
    private static int allhealth;
	
    private static int capinvenpower;
    private static int capinvenhealth;
    private static int cappower;
    private static int cappowerprice;
    private static int caphealth;
    private static int caphealthprice;
    private static int capgrouppower;
    private static int capgrouphealth;
	
    private static int off;
    private static int offinvenpower;
    private static int offinvenhealth;
    private static int offprice;
    private static int offpower;
    private static int offpowerprice;
    private static int offhealth;
    private static int offhealthprice;
    private static int offgrouppower;
    private static int offgrouphealth;
	
    private static int zzol;
    private static int zzolinvenpower;
    private static int zzolinvenhealth;
    private static int zzolprice;
    private static int zzolpower;
    private static int zzolpowerprice;
    private static int zzolhealth;
    private static int zzolhealthprice;

    private static int caplimit1;
    private static int caplimit2;
    private static int caplimit3;
    private static int caplimit4;
    private static int caplimit5;
    private static int caplimit6;
    private static int caplimit7;
	
    private static int offlimit1;
    private static int offlimit2;
    private static int offlimit3;
    private static int offlimit4;
    private static int offlimit5;
    private static int offlimit6;
    private static int offlimit7;
	
    private static int zzollimit1;
    private static int zzollimit2;
    private static int zzollimit3;
    private static int zzollimit4;
    private static int zzollimit5;
    private static int zzollimit6;
    private static int zzollimit7;
	
    private static int map1;
    private static int map2;
    private static int map3;
    private static int map4;
    private static int map5;
    private static int map6;
    private static int map7;
    private static int map8;
    private static int map9;
    private static int map10;
    private static int map11;
    private static int map12;
    private static int map13;
    private static int map14;
    private static int map15;
    private static int map16;
	
    private static int ending;

    public static void loadProperties(Data data) { 
    	java.io.File file = new java.io.File(propertiesFileName);
    	
    	if(!file.exists()) {
    		return ;
    	}
    	try {
    		// 프로퍼티 객체 생성
    		Properties props = new Properties();
    		
    		// 프로퍼티 파일 스트림에 담기
    		FileInputStream fis = new FileInputStream(propertiesFileName);
    		
    		// 프로퍼티 파일 로딩
    		props.load(new java.io.BufferedInputStream(fis));

    		// 항목 읽기
    		name = props.getProperty("NAME");
    		title = props.getProperty("TITLE");
    		
    		data.SetStart(Integer.parseInt(props.getProperty("START")));
    		data.SetMoney(Integer.parseInt(props.getProperty("MONEY")));
    		data.SetMonthMoney(Integer.parseInt(props.getProperty("MONTHMONEY")));
    		data.SetYear(Integer.parseInt(props.getProperty("YEAR")));
    		data.SetMonth(Integer.parseInt(props.getProperty("MONTH")));
    		data.SetDay(Integer.parseInt(props.getProperty("DAY")));
    		data.SetHour(Integer.parseInt(props.getProperty("HOUR")));
    		data.SetMinute(Integer.parseInt(props.getProperty("MINUTE")));
    		data.SetAs(Integer.parseInt(props.getProperty("AS")));
    		data.SetBs(Integer.parseInt(props.getProperty("BS")));
    		data.SetCs(Integer.parseInt(props.getProperty("CS")));
    		
    		data.SetAllPower(Integer.parseInt(props.getProperty("ALLPOWER")));
    		data.SetAllHealth(Integer.parseInt(props.getProperty("ALLHEALTH")));
    		
    		data.SetCapInvenPower(Integer.parseInt(props.getProperty("CAPINVENPOWER")));
    		data.SetCapInvenHealth(Integer.parseInt(props.getProperty("CAPINVENHEALTH")));
    		data.SetCapPower(Integer.parseInt(props.getProperty("CAPPOWER")));
    		data.SetCapPowerPrice(Integer.parseInt(props.getProperty("CAPPOWERPRICE")));
    		data.SetCapHealth(Integer.parseInt(props.getProperty("CAPHEALTH")));
    		data.SetCapHealthPrice(Integer.parseInt(props.getProperty("CAPHEALTHPRICE")));
    		data.SetCapGroupPower(Integer.parseInt(props.getProperty("CAPGROUPPOWER")));
    		data.SetCapGroupHealth(Integer.parseInt(props.getProperty("CAPGROUPHEALTH")));
    		
    		data.SetOff(Integer.parseInt(props.getProperty("OFF")));
    		data.SetOffInvenPower(Integer.parseInt(props.getProperty("OFFINVENPOWER")));
    		data.SetOffInvenHealth(Integer.parseInt(props.getProperty("OFFINVENHEALTH")));
    		data.SetOffPrice(Integer.parseInt(props.getProperty("OFFPRICE")));
    		data.SetOffPower(Integer.parseInt(props.getProperty("OFFPOWER")));
    		data.SetOffPowerPrice(Integer.parseInt(props.getProperty("OFFPOWERPRICE")));
    		data.SetOffHealth(Integer.parseInt(props.getProperty("OFFHEALTH")));
    		data.SetOffHealthPrice(Integer.parseInt(props.getProperty("OFFHEALTHPRICE")));
    		data.SetOffGroupPower(Integer.parseInt(props.getProperty("OFFGROUPPOWER")));
    		data.SetOffGroupHealth(Integer.parseInt(props.getProperty("OFFGROUPHEALTH")));
    		
    		data.SetZzol(Integer.parseInt(props.getProperty("ZZOL")));
    		data.SetZzolInvenPower(Integer.parseInt(props.getProperty("ZZOLINVENPOWER")));
    		data.SetZzolInvenHealth(Integer.parseInt(props.getProperty("ZZOLINVENHEALTH")));
    		data.SetZzolPrice(Integer.parseInt(props.getProperty("ZZOLPRICE")));
    		data.SetZzolPower(Integer.parseInt(props.getProperty("ZZOLPOWER")));
    		data.SetZzolPowerPrice(Integer.parseInt(props.getProperty("ZZOLPOWERPRICE")));
    		data.SetZzolHealth(Integer.parseInt(props.getProperty("ZZOLHEALTH")));
    		data.SetZzolHealthPrice(Integer.parseInt(props.getProperty("ZZOLHEALTHPRICE")));
    		
    		data.SetCapLimit1(Integer.parseInt(props.getProperty("CAPLIMIT1")));
    		data.SetCapLimit2(Integer.parseInt(props.getProperty("CAPLIMIT2")));
    		data.SetCapLimit3(Integer.parseInt(props.getProperty("CAPLIMIT3")));
    		data.SetCapLimit4(Integer.parseInt(props.getProperty("CAPLIMIT4")));
    		data.SetCapLimit5(Integer.parseInt(props.getProperty("CAPLIMIT5")));
    		data.SetCapLimit6(Integer.parseInt(props.getProperty("CAPLIMIT6")));
    		data.SetCapLimit7(Integer.parseInt(props.getProperty("CAPLIMIT7")));
    		
    		data.SetOffLimit1(Integer.parseInt(props.getProperty("OFFLIMIT1")));
    		data.SetOffLimit2(Integer.parseInt(props.getProperty("OFFLIMIT2")));
    		data.SetOffLimit3(Integer.parseInt(props.getProperty("OFFLIMIT3")));
    		data.SetOffLimit4(Integer.parseInt(props.getProperty("OFFLIMIT4")));
    		data.SetOffLimit5(Integer.parseInt(props.getProperty("OFFLIMIT5")));
    		data.SetOffLimit6(Integer.parseInt(props.getProperty("OFFLIMIT6")));
    		data.SetOffLimit7(Integer.parseInt(props.getProperty("OFFLIMIT7")));
    		
    		data.SetZzolLimit1(Integer.parseInt(props.getProperty("ZZOLLIMIT1")));
    		data.SetZzolLimit2(Integer.parseInt(props.getProperty("ZZOLLIMIT2")));
    		data.SetZzolLimit3(Integer.parseInt(props.getProperty("ZZOLLIMIT3")));
    		data.SetZzolLimit4(Integer.parseInt(props.getProperty("ZZOLLIMIT4")));
    		data.SetZzolLimit5(Integer.parseInt(props.getProperty("ZZOLLIMIT5")));
    		data.SetZzolLimit6(Integer.parseInt(props.getProperty("ZZOLLIMIT6")));
    		data.SetZzolLimit7(Integer.parseInt(props.getProperty("ZZOLLIMIT7")));
    		
    		data.SetMap1(Integer.parseInt(props.getProperty("MAP1")));
    		data.SetMap2(Integer.parseInt(props.getProperty("MAP2")));
    		data.SetMap3(Integer.parseInt(props.getProperty("MAP3")));
    		data.SetMap4(Integer.parseInt(props.getProperty("MAP4")));
    		data.SetMap5(Integer.parseInt(props.getProperty("MAP5")));
    		data.SetMap6(Integer.parseInt(props.getProperty("MAP6")));
    		data.SetMap7(Integer.parseInt(props.getProperty("MAP7")));
    		data.SetMap8(Integer.parseInt(props.getProperty("MAP8")));
    		data.SetMap9(Integer.parseInt(props.getProperty("MAP9")));
    		data.SetMap10(Integer.parseInt(props.getProperty("MAP10")));
    		data.SetMap11(Integer.parseInt(props.getProperty("MAP11")));
    		data.SetMap12(Integer.parseInt(props.getProperty("MAP12")));
    		data.SetMap13(Integer.parseInt(props.getProperty("MAP13")));
    		data.SetMap14(Integer.parseInt(props.getProperty("MAP14")));
    		data.SetMap15(Integer.parseInt(props.getProperty("MAP15")));
    		data.SetMap16(Integer.parseInt(props.getProperty("MAP16")));
    		
    		data.SetEnding(Integer.parseInt(props.getProperty("ENDING")));   

        	fis.close();
 
 

    	} catch (IOException e) {
    		System.err.println(e);
    	}
    }

    public static void saveProperties(Data data) {
    	Properties prop = new Properties();
    	    	
    	String name = "김영우";
    	String title = "MAPIA_GAME~";
    	
    	start = data.GetStart();
   	    money = data.GetMoney();
   	    monthmoney = data.GetMonthMoney();
   		year=data.GetYear();
   		month=data.GetMonth();
   		day=data.GetDay();
   		hour=data.GetHour();
   		minute=data.GetMinute();
   		as=data.GetAs();
   		bs=data.GetBs();
   		cs=data.GetCs();
   		
   		allpower=data.GetAllPower();
   		allhealth=data.GetAllHealth();
   		
   		capinvenpower=data.GetCapInvenPower();
   		capinvenhealth=data.GetCapInvenHealth();
   		cappower=data.GetCapPower();
   		cappowerprice=data.GetCapPowerPrice();
   		caphealth=data.GetCapHealth();
   		caphealthprice=data.GetCapHealthPrice();
   		capgrouppower=data.GetCapGroupPower();
   		capgrouphealth=data.GetCapGroupHealth();
   		
   		off=data.GetOff();
   		offinvenpower=data.GetOffInvenPower();
   		offinvenhealth=data.GetOffInvenHealth();
   		offprice=data.GetOffPrice();
   		offpower=data.GetOffPower();
   		offpowerprice=data.GetOffPowerPrice();
   		offhealth=data.GetOffHealth();
   		offhealthprice=data.GetOffHealthPrice();
   		offgrouppower=data.GetOffGroupPower();
   		offgrouphealth=data.GetOffGroupHealth();
   		
   		zzol=data.GetZzol();
   		zzolinvenpower=data.GetZzolInvenPower();
   		zzolinvenhealth=data.GetZzolInvenHealth();
   		zzolprice=data.GetZzolPrice();
   		zzolpower=data.GetZzolPower();
   		zzolpowerprice=data.GetZzolPowerPrice();
   		zzolhealth=data.GetZzolHealth();
   		zzolhealthprice=data.GetZzolHealthPrice();
   		caplimit1=data.GetCapLimit1();
   		caplimit2=data.GetCapLimit2();
   		caplimit3=data.GetCapLimit3();
   		caplimit4=data.GetCapLimit4();
   		caplimit5=data.GetCapLimit5();
   		caplimit6=data.GetCapLimit6();
   		caplimit7=data.GetCapLimit7();
   		
   		offlimit1=data.GetOffLimit1();
   		offlimit2=data.GetOffLimit2();
   		offlimit3=data.GetOffLimit3();
   		offlimit4=data.GetOffLimit4();
   		offlimit5=data.GetOffLimit5();
   		offlimit6=data.GetOffLimit6();
   		offlimit7=data.GetOffLimit7();
   		
   		zzollimit1=data.GetZzolLimit1();
   		zzollimit2=data.GetZzolLimit2();
   		zzollimit3=data.GetZzolLimit3();
   		zzollimit4=data.GetZzolLimit4();
   		zzollimit5=data.GetZzolLimit5();
   		zzollimit6=data.GetZzolLimit6();
   		zzollimit7=data.GetZzolLimit7();
   		
   		map1=data.GetMap1();
   		map2=data.GetMap2();
   		map3=data.GetMap3();
   		map4=data.GetMap4();
   		map5=data.GetMap5();
   		map6=data.GetMap6();
   		map7=data.GetMap7();
   		map8=data.GetMap8();
   		map9=data.GetMap9();
   		map10=data.GetMap10();
   		map11=data.GetMap11();
   		map12=data.GetMap12();
   		map13=data.GetMap13();
   		map14=data.GetMap14();
   		map15=data.GetMap15();
   		map16=data.GetMap16();
   		
   		ending=data.GetEnding();

    	prop.setProperty("NAME", name);
    	prop.setProperty("TITLE", title);
    	
    	prop.setProperty("START", String.valueOf(start));
    	prop.setProperty("MONEY", String.valueOf(money));
    	prop.setProperty("MONTHMONEY", String.valueOf(monthmoney));
    	prop.setProperty("YEAR", String.valueOf(year));
    	prop.setProperty("MONTH", String.valueOf(month));
    	prop.setProperty("DAY", String.valueOf(day));
    	prop.setProperty("HOUR", String.valueOf(hour));
    	prop.setProperty("MINUTE", String.valueOf(minute));
    	prop.setProperty("AS", String.valueOf(as));
    	prop.setProperty("BS", String.valueOf(bs));
    	prop.setProperty("CS", String.valueOf(cs));
    	
    	prop.setProperty("ALLPOWER", String.valueOf(allpower));
    	prop.setProperty("ALLHEALTH", String.valueOf(allhealth));
    	
    	prop.setProperty("CAPINVENPOWER", String.valueOf(capinvenpower));
    	prop.setProperty("CAPINVENHEALTH", String.valueOf(capinvenhealth));
    	prop.setProperty("CAPPOWER", String.valueOf(cappower));
    	prop.setProperty("CAPPOWERPRICE", String.valueOf(cappowerprice));
    	prop.setProperty("CAPHEALTH", String.valueOf(caphealth));
    	prop.setProperty("CAPHEALTHPRICE", String.valueOf(caphealthprice));
    	prop.setProperty("CAPGROUPPOWER", String.valueOf(capgrouppower));
    	prop.setProperty("CAPGROUPHEALTH", String.valueOf(capgrouphealth));
    	
    	prop.setProperty("OFF", String.valueOf(off));
    	prop.setProperty("OFFINVENPOWER", String.valueOf(offinvenpower));
    	prop.setProperty("OFFINVENHEALTH", String.valueOf(offinvenhealth));
    	prop.setProperty("OFFPRICE", String.valueOf(offprice));
    	prop.setProperty("OFFPOWER", String.valueOf(offpower));
    	prop.setProperty("OFFPOWERPRICE", String.valueOf(offpowerprice));
    	prop.setProperty("OFFHEALTH", String.valueOf(offhealth));
    	prop.setProperty("OFFHEALTHPRICE", String.valueOf(offhealthprice));
    	prop.setProperty("OFFGROUPPOWER", String.valueOf(offgrouppower));
    	prop.setProperty("OFFGROUPHEALTH", String.valueOf(offgrouphealth));
    	
    	prop.setProperty("ZZOL", String.valueOf(zzol));
    	prop.setProperty("ZZOLINVENPOWER", String.valueOf(zzolinvenpower));
    	prop.setProperty("ZZOLINVENHEALTH", String.valueOf(zzolinvenhealth));
    	prop.setProperty("ZZOLPRICE", String.valueOf(zzolprice));
    	prop.setProperty("ZZOLPOWER", String.valueOf(zzolpower));
    	prop.setProperty("ZZOLPOWERPRICE", String.valueOf(zzolpowerprice));
    	prop.setProperty("ZZOLHEALTH", String.valueOf(zzolhealth));
    	prop.setProperty("ZZOLHEALTHPRICE", String.valueOf(zzolhealthprice));
    	
    	prop.setProperty("CAPLIMIT1", String.valueOf(caplimit1));
    	prop.setProperty("CAPLIMIT2", String.valueOf(caplimit2));
    	prop.setProperty("CAPLIMIT3", String.valueOf(caplimit3));
    	prop.setProperty("CAPLIMIT4", String.valueOf(caplimit4));
    	prop.setProperty("CAPLIMIT5", String.valueOf(caplimit5));
    	prop.setProperty("CAPLIMIT6", String.valueOf(caplimit6));
    	prop.setProperty("CAPLIMIT7", String.valueOf(caplimit7));
    	
    	prop.setProperty("OFFLIMIT1", String.valueOf(offlimit1));
    	prop.setProperty("OFFLIMIT2", String.valueOf(offlimit2));
    	prop.setProperty("OFFLIMIT3", String.valueOf(offlimit3));
    	prop.setProperty("OFFLIMIT4", String.valueOf(offlimit4));
    	prop.setProperty("OFFLIMIT5", String.valueOf(offlimit5));
    	prop.setProperty("OFFLIMIT6", String.valueOf(offlimit6));
    	prop.setProperty("OFFLIMIT7", String.valueOf(offlimit7));
    	
    	prop.setProperty("ZZOLLIMIT1", String.valueOf(zzollimit1));
    	prop.setProperty("ZZOLLIMIT2", String.valueOf(zzollimit2));
    	prop.setProperty("ZZOLLIMIT3", String.valueOf(zzollimit3));
    	prop.setProperty("ZZOLLIMIT4", String.valueOf(zzollimit4));
    	prop.setProperty("ZZOLLIMIT5", String.valueOf(zzollimit5));
    	prop.setProperty("ZZOLLIMIT6", String.valueOf(zzollimit6));
    	prop.setProperty("ZZOLLIMIT7", String.valueOf(zzollimit7));
    	
    	prop.setProperty("MAP1", String.valueOf(map1));
    	prop.setProperty("MAP2", String.valueOf(map2));
    	prop.setProperty("MAP3", String.valueOf(map3));
    	prop.setProperty("MAP4", String.valueOf(map4));
    	prop.setProperty("MAP5", String.valueOf(map5));
    	prop.setProperty("MAP6", String.valueOf(map6));
    	prop.setProperty("MAP7", String.valueOf(map7));
    	prop.setProperty("MAP8", String.valueOf(map8));
    	prop.setProperty("MAP9", String.valueOf(map9));
    	prop.setProperty("MAP10", String.valueOf(map10));
    	prop.setProperty("MAP11", String.valueOf(map11));
    	prop.setProperty("MAP12", String.valueOf(map12));
    	prop.setProperty("MAP13", String.valueOf(map13));
    	prop.setProperty("MAP14", String.valueOf(map14));
    	prop.setProperty("MAP15", String.valueOf(map15));
    	prop.setProperty("MAP16", String.valueOf(map16));
    	
    	prop.setProperty("ENDING", String.valueOf(ending));    	

    	try {
    		OutputStream stream = new FileOutputStream(propertiesFileName);
    		prop.store(stream, "TEST PROPERTISE");
    		stream.close();
    	} catch (IOException ex) {
    		ex.printStackTrace();
    	}
    }
}