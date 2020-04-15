package Map;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import Data.Data;
import Data.File;
import java.awt.Font;

public class GamePanel extends JPanel implements ActionListener{

	private MapFrame mapframe;
	private Data data = new Data();

	private ImageIcon oldimageicon3;
	private Image oldimage3;
	private Image newimage3;
	private ImageIcon newimageicon3;
	
	private int enemyall;
	private int myall;
	
	private SimpleDateFormat formatter;
	private Calendar starttime;
	private Calendar endtime;
	private long deftime=0;
	private Timer timer;
	private int x=400,y=400;
	private int xmax=830,ymax=730;
	private int a1=0,a2=0,c1=0,c2=ymax,e1=xmax/2,e2=0,g1=0,g2=ymax/4,h1=100,h2=ymax,j1=0,j2=ymax*3/4;
	private int ax=10,ay=10,bx=10,by=10,cx=10,cy=10,dx=10,dy=10,ex=10,ey=10,fx=10,fy=10,gx=10,gy=10,hx=10,hy=10,ix=10,iy=10,jx=10,jy=10;
	private int aa1=a1,aa2=a2,bb1=xmax,bb2=0,cc1=c1,cc2=c2,dd1=xmax,dd2=ymax,ee1=e1,ee2=e2,ff1=0,ff2=xmax/3,gg1=g1,gg2=g2,hh1=h1,hh2=h2;
	private double ii1=xmax,ii2=ymax*3/4,jj1=j1,jj2=j2,b1=xmax,b2=0,d1=xmax,d2=ymax,f1=0,f2=xmax/3,i1=xmax,i2=ymax*3/4;
	private int aax=10,aay=10,bbx=10,bby=10,ccx=10,ccy=10,ddx=10,ddy=10,eex=10,eey=10,ffx=10,ffy=10,ggx=10,ggy=10,hhx=10,hhy=10,iix=10,iiy=10,jjx=10,jjy=10;
	private boolean isEnd=false;
	private JLabel label;

	public GamePanel(MapFrame mapFrame) {
		// TODO Auto-generated constructor stub
		this.mapframe = mapFrame;
		setLayout(null);
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
							if (x < 830)
								moveRight();
						} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
							if (x > 0)
								moveLeft();
						} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
							if (y < 730)
								moveDown();
						} else if (e.getKeyCode() == KeyEvent.VK_UP) {
							if (y > 0)
								moveUp();
						}
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
							if (x < 830)
								moveRight();
						} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
							if (x > 0)
								moveLeft();
						} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
							if (y < 730)
								moveDown();
						} else if (e.getKeyCode() == KeyEvent.VK_UP) {
							if (y > 0)
								moveUp();
						}
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
							if (x < 830)
								moveRight();
						} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
							if (x > 0)
								moveLeft();
						} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
							if (y < 730)
								moveDown();
						} else if (e.getKeyCode() == KeyEvent.VK_UP) {
							if (y > 0)
								moveUp();
						}
					}
				});
				setFocusable(true);
				requestFocusInWindow();
			}
		};
		SwingUtilities.invokeLater(r);
		isEnd = false;
		timer = new Timer(100, this);
		
		label = new JLabel("");
		label.setFont(new Font("굴림", Font.PLAIN, 25));
		label.setBounds(0, 0, 125, 30);
		add(label);
		timer.start();
		starttime = Calendar.getInstance();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawRect(x, y, 20, 20);
		g.fillRect(x, y, 20, 20);
		enemymove(g);
	}
	
	public void enemymove(Graphics g) {
		g.setColor(Color.PINK);
		g.drawRect(a1, a2, 20, 20);
		g.fillRect(a1, a2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect((int)b1, (int)b2, 20, 20);
		g.fillRect((int)b1, (int)b2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect(c1, c2, 20, 20);
		g.fillRect(c1, c2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect((int)d1, (int)d2, 20, 20);
		g.fillRect((int)d1, (int)d2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect(e1, e2, 20, 20);
		g.fillRect(e1, e2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect((int)f1, (int)f2, 20, 20);
		g.fillRect((int)f1, (int)f2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect(g1, g2, 20, 20);
		g.fillRect(g1, g2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect(h1, h2, 20, 20);
		g.fillRect(h1, h2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect((int)i1, (int)i2, 20, 20);
		g.fillRect((int)i1, (int)i2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect(j1, j2, 20, 20);
		g.fillRect(j1, j2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect(aa1, aa2, 20, 20);
		g.fillRect(aa1, aa2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect(bb1, bb2, 20, 20);
		g.fillRect(bb1, bb2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect(cc1, cc2, 20, 20);
		g.fillRect(cc1, cc2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect(dd1, dd2, 20, 20);
		g.fillRect(dd1, dd2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect(ee1, ee2, 20, 20);
		g.fillRect(ee1, ee2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect(ff1, ff2, 20, 20);
		g.fillRect(ff1, ff2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect(gg1, gg2, 20, 20);
		g.fillRect(gg1, gg2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect(hh1, hh2, 20, 20);
		g.fillRect(hh1, hh2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect((int)ii1, (int)ii2, 20, 20);
		g.fillRect((int)ii1, (int)ii2, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawRect((int)jj1, (int)jj2, 20, 20);
		g.fillRect((int)jj1, (int)jj2, 20, 20);
	}
	
	public void enemy1() {
		int i = a1 + ax, j = a2 + ay;

		if (i < 0 || i > 830)
			ax = -ax;
		if (j < 0 || j > 730)
			ay= -ay;
		
		a1=a1+ax;
		a2=a2+ay;
	}
	
	public void enemy2() {
		double i = b1 + bx*0.6, j = b2 + by*0.6;

		if (i < 0 || i > 830)
			bx = -bx;
		if (j < 0 || j > 730)
			by = -by;
		b1 = b1 + bx*0.6;
		b2 = b2 + by*0.6;
	}
	
	public void enemy3() {
		int i = c1 + cx, j = c2 + cy;

		if (i < 0 || i > 830)
			cx = -cx;
		if (j < 0 || j > 730)
			cy = -cy;
		c1 = c1 + cx;
		c2 = c2 + cy;
	}
	
	public void enemy4() {
		double i = d1 + dx*1.6, j = d2 + dy*1.6;

		if (i < 0 || i > 830)
			dx = -dx;
		if (j < 0 || j > 730)
			dy = -dy;
		d1 = d1 + dx*1.6;
		d2 = d2 + dy*1.6;
	}
	
	public void enemy5() {
		int i = e1 + ex, j = e2 + ey;

		if (i < 0 || i > 830)
			ex = -ex;
		if (j < 0 || j > 730)
			ey = -ey;
		e1 = e1 + ex;
		e2 = e2 + ey;
	}
	
	public void enemy6() {
		double i = f1 + fx*1.6, j = f2 + fy*1.6;

		if (i < 0 || i > 830)
			fx = -fx;
		if (j < 0 || j > 730)
			fy = -fy;
		f1 = f1 + fx*1.6;
		f2 = f2 + fy*1.6;
	}
	
	public void enemy7() {
		int i = g1 + gx, j = g2 + gy;

		if (i < 0 || i > 830)
			gx = -gx;
		if (j < 0 || j > 730)
			gy = -gy;
		g1 = g1 + gx;
		g2 = g2 + gy;
	}
	
	public void enemy8() {
		int i = h1 + hx, j = h2 + hy;

		if (i < 0 || i > 830)
			hx = -hx;
		if (j < 0 || j > 730)
			hy = -hy;
		h1 = h1 + hx;
		h2 = h2 + hy;
	}
	
	public void enemy9() {
		double i = i1 + ix*1.2, j = i2 + iy*2.6;

		if (i < 0 || i > 830)
			ix = -ix;
		if (j < 0 || j > 730)
			iy = -iy;
		i1 = i1 + ix*1.2;
		i2 = i2 + iy*2.6;
	}
	
	public void enemy10() {
		int i = j1 + jx, j = j2 + jy;

		if (i < 0 || i > 830)
			jx = -jx;
		if (j < 0 || j > 730)
			jy = -jy;
		j1 = j1 + jx;
		j2 = j2 + jy;
	}
	
	public void enemy11() {
		int i = aa1 + aax*2, j = aa2 + aay*3;

		if (i < 0 || i > 830)
			aax = -aax;
		if (j < 0 || j > 730)
			aay= -aay;
		
		aa1=aa1+aax*2;
		aa2=aa2+aay*3;
	}
	
	public void enemy12() {
		int i = bb1 + bbx*3, j = bb2 + bby*3;

		if (i < 0 || i > 830)
			bbx = -bbx;
		if (j < 0 || j > 730)
			bby = -bby;
		bb1 = bb1 + bbx*3;
		bb2 = bb2 + bby*3;
	}
	
	public void enemy13() {
		int i = cc1 + ccx*2, j = cc2 + ccy*2;

		if (i < 0 || i > 830)
			ccx = -ccx;
		if (j < 0 || j > 730)
			ccy = -ccy;
		cc1 = cc1 + ccx*2;
		cc2 = cc2 + ccy*2;
	}
	
	public void enemy14() {
		int i = dd1 + ddx*1, j = dd2 + ddy*2;

		if (i < 0 || i > 830)
			ddx = -ddx;
		if (j < 0 || j > 730)
			ddy = -ddy;
		dd1 = dd1 + ddx*1;
		dd2 = dd2 + ddy*2;
	}
	
	public void enemy15() {
		int i = ee1 + eex*3, j = ee2 + eey*3;

		if (i < 0 || i > 830)
			eex = -eex;
		if (j < 0 || j > 730)
			eey = -eey;
		ee1 = ee1 + eex*3;
		ee2 = ee2 + eey*3;
	}
	
	public void enemy16() {
		int i = ff1 + ffx*2, j = ff2 + ffy*4;

		if (i < 0 || i > 830)
			ffx = -ffx;
		if (j < 0 || j > 730)
			ffy = -ffy;
		ff1 = ff1 + ffx*2;
		ff2 = ff2 + ffy*4;
	}
	
	public void enemy17() {
		int i = gg1 + ggx*2, j = gg2 + ggy*2;

		if (i < 0 || i > 830)
			ggx = -ggx;
		if (j < 0 || j > 730)
			ggy = -ggy;
		gg1 = gg1 + ggx*2;
		gg2 = gg2 + ggy*2;
	}
	
	public void enemy18() {
		int i = hh1 + hhx*3, j = hh2 + hhy*1;

		if (i < 0 || i > 830)
			hhx = -hhx;
		if (j < 0 || j > 730)
			hhy = -hhy;
		hh1 = hh1 + hhx*3;
		hh2 = hh2 + hhy*1;
	}
	
	public void enemy19() {
		double i = ii1 + iix*2.5, j = ii2 + iiy*2.5;

		if (i < 0 || i > 830)
			iix = -iix;
		if (j < 0 || j > 730)
			iiy = -iiy;
		ii1 = ii1 + iix*2.5;
		ii2 = ii2 + iiy*2.5;
	}
	
	public void enemy20() {
		double i = jj1 + jjx*3.7, j = jj2 + jjy*3.7;

		if (i < 0 || i > 830)
			jjx = -jjx;
		if (j < 0 || j > 730)
			jjy = -jjy;
		jj1 = jj1 + jjx*3.7;
		jj2 = jj2 + jjy*3.7;
	}
	
	public void moveRight() {
		x=x+10;
		repaint();
	}
	
	public void moveLeft() {
		x=x-10;
		repaint();
	}
	
	public void moveDown() {
		y=y+10;
		repaint();
	}
	
	public void moveUp() {
		y=y-10;
		repaint();
	}
	
	public void End() {
		if(a1-20<x && a1+20>x && a2-20<y && a2+20 >y)
			isEnd=true;
		if(b1-20<x && b1+20>x && b2-20<y && b2+20 >y)
			isEnd=true;
		if(c1-20<x && c1+20>x && c2-20<y && c2+20 >y)
			isEnd=true;
		if(d1-20<x && d1+20>x && d2-20<y && d2+20 >y)
			isEnd=true;
		if(e1-20<x && e1+20>x && e2-20<y && e2+20 >y)
			isEnd=true;
		if(f1-20<x && f1+20>x && f2-20<y && f2+20 >y)
			isEnd=true;
		if(g1-20<x && g1+20>x && g2-20<y && g2+20 >y)
			isEnd=true;
		if(h1-20<x && h1+20>x && h2-20<y && h2+20 >y)
			isEnd=true;
		if(i1-20<x && i1+20>x && i2-20<y && i2+20 >y)
			isEnd=true;
		if(j1-20<x && j1+20>x && j2-20<y && j2+20 >y)
			isEnd=true;
		if(aa1-20<x && aa1+20>x && aa2-20<y && aa2+20 >y)
			isEnd=true;
		if(bb1-20<x && bb1+20>x && bb2-20<y && bb2+20 >y)
			isEnd=true;
		if(cc1-20<x && cc1+20>x && cc2-20<y && cc2+20 >y)
			isEnd=true;
		if(dd1-20<x && dd1+20>x && dd2-20<y && dd2+20 >y)
			isEnd=true;
		if(ee1-20<x && ee1+20>x && ee2-20<y && ee2+20 >y)
			isEnd=true;
		if(ff1-20<x && ff1+20>x && ff2-20<y && ff2+20 >y)
			isEnd=true;
		if(gg1-20<x && gg1+20>x && gg2-20<y && gg2+20 >y)
			isEnd=true;
		if(hh1-20<x && hh1+20>x && hh2-20<y && hh2+20 >y)
			isEnd=true;
		if(ii1-20<x && ii1+20>x && ii2-20<y && ii2+20 >y)
			isEnd=true;
		if(jj1-20<x && jj1+20>x && jj2-20<y && jj2+20 >y)
			isEnd=true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(!isEnd) {
			enemy1();
			enemy2();
			enemy3();
			enemy4();
			enemy5();
			enemy6();
			enemy7();
			enemy8();
			enemy9();
			enemy10();
			enemy11();
			enemy12();
			enemy13();
			enemy14();
			enemy15();
			enemy16();
			enemy17();
			enemy18();
			enemy19();
			enemy20();
			End();
			endtime = Calendar.getInstance();
			deftime = endtime.getTimeInMillis()-starttime.getTimeInMillis();
			
			
			formatter = new SimpleDateFormat ("mm:ss:SSS", Locale.KOREA);
			String c = formatter.format(deftime);
			label.setText(c);
			
			if((int)deftime/1000>=60) {
				isEnd=true;
			}
		}
		else {
			timer.stop();
			endtime = Calendar.getInstance();
			deftime = endtime.getTimeInMillis()-starttime.getTimeInMillis();
			
			File.loadProperties(data);
			
			myall=(mapframe.GetIfWarPanel().GetMyPower()/10+mapframe.GetIfWarPanel().GetMyHealth()/10)*3;
			enemyall=(mapframe.GetIfWarPanel().GetEnemyPower()/10+mapframe.GetIfWarPanel().GetEnemyHealth()/10)*3*(1-(int)deftime/100000);

			if(myall>enemyall) {
				int money = data.GetMonthMoney()+mapframe.GetIfWarPanel().GetEnemyPrice();
				data.SetMonthMoney(money);
				data.SetZzol(data.GetZzol()-1);
				
				int capgrouppowers = data.GetCapPower()+data.GetCapInvenPower()+(data.GetZzolPower()+data.GetZzolInvenPower())*data.GetZzol();
				data.SetCapGroupPower(capgrouppowers);

				int capgrouphealths = data.GetCapHealth()+data.GetCapInvenHealth()+(data.GetZzolHealth()+data.GetZzolInvenHealth())*data.GetZzol();
				data.SetCapGroupHealth(capgrouphealths);

				int offgrouppowers = data.GetOffPower()+data.GetOffInvenPower()+(data.GetOffInvenPower()+data.GetZzolPower())*data.GetZzol();
				data.SetOffGroupPower(offgrouppowers);

				int offgrouphealths = data.GetOffHealth()+data.GetOffInvenHealth()+(data.GetZzolInvenHealth()+data.GetZzolHealth())*data.GetZzol();
				data.SetOffGroupHealth(offgrouphealths);

				int allgrouppowers = data.GetCapGroupPower()+data.GetOff()*data.GetOffGroupPower();
				data.SetAllPower(allgrouppowers);
				
				int allgrouphealths = data.GetCapGroupHealth()+data.GetOff()*data.GetOffGroupHealth();
				data.SetAllHealth(allgrouphealths);
				
				if(mapframe.GetMap()==1) {
					data.SetMap1(1);
					data.SetEnding(1);
				}
				if(mapframe.GetMap()==2) {
					data.SetMap2(1);
					data.SetEnding(2);
				}
				if(mapframe.GetMap()==3) {
					data.SetMap3(1);
					data.SetEnding(3);
				}
				if(mapframe.GetMap()==4) {
					data.SetMap4(1);
					data.SetEnding(4);
				}
				if(mapframe.GetMap()==5) {
					data.SetMap5(1);
					data.SetEnding(5);
				}
				if(mapframe.GetMap()==6) {
					data.SetMap6(1);		
					data.SetEnding(6);
				}
				if(mapframe.GetMap()==7) {
					data.SetMap7(1);
					data.SetEnding(7);
				}
				if(mapframe.GetMap()==8) {
					data.SetMap8(1);
					data.SetEnding(8);
				}
				if(mapframe.GetMap()==9) {
					data.SetMap9(1);
					data.SetEnding(9);
				}
				if(mapframe.GetMap()==10) {
					data.SetMap10(1);
					data.SetEnding(10);
				}
				if(mapframe.GetMap()==11) {
					data.SetMap11(1);
					data.SetEnding(11);
				}
				if(mapframe.GetMap()==12) {
					data.SetMap12(1);
					data.SetEnding(12);
				}
				if(mapframe.GetMap()==13) {
					data.SetMap13(1);
					data.SetEnding(13);
				}
				if(mapframe.GetMap()==14) {
					data.SetMap14(1);
					data.SetEnding(14);
				}
				if(mapframe.GetMap()==15) {
					data.SetMap15(1);
					data.SetEnding(15);
				}
				if(mapframe.GetMap()==16) {
					data.SetMap16(1);
					data.SetEnding(16);
				}
				oldimageicon3 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\이겼닭.png");
				data.save();
			}
			
			else {               
				oldimageicon3 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\캐릭\\youlose.png");
				if(data.GetZzol()>=2) 
					data.SetZzol(data.GetZzol() - 2);
				else if (data.GetZzol()==1) 
					data.SetZzol(data.GetZzol() - 1);

				int capgrouppowers = data.GetCapPower()+data.GetCapInvenPower()+(data.GetZzolPower()+data.GetZzolInvenPower())*data.GetZzol();
				data.SetCapGroupPower(capgrouppowers);

				int capgrouphealths = data.GetCapHealth()+data.GetCapInvenHealth()+(data.GetZzolHealth()+data.GetZzolInvenHealth())*data.GetZzol();
				data.SetCapGroupHealth(capgrouphealths);

				int offgrouppowers = data.GetOffPower()+data.GetOffInvenPower()+(data.GetOffInvenPower()+data.GetZzolPower())*data.GetZzol();
				data.SetOffGroupPower(offgrouppowers);

				int offgrouphealths = data.GetOffHealth()+data.GetOffInvenHealth()+(data.GetZzolInvenHealth()+data.GetZzolHealth())*data.GetZzol();
				data.SetOffGroupHealth(offgrouphealths);

				int allgrouppowers = data.GetCapGroupPower()+data.GetOff()*data.GetOffGroupPower();
				data.SetAllPower(allgrouppowers);
				
				int allgrouphealths = data.GetCapGroupHealth()+data.GetOff()*data.GetOffGroupHealth();
				data.SetAllHealth(allgrouphealths);
				data.save();
			}
			
			oldimage3 = oldimageicon3.getImage();
			newimage3 = oldimage3.getScaledInstance(590, 400, Image.SCALE_SMOOTH);
			newimageicon3 = new ImageIcon(newimage3);
			SetImage(newimageicon3);
			
			WarPanel warpanel = new WarPanel(mapframe);
			mapframe.setBounds(550, 200, 595, 400);
			mapframe.setContentPane(warpanel);
			mapframe.revalidate();
		}
		repaint();
	}
	
	public void SetImage(ImageIcon image) {
		this.newimageicon3 = image;
	}
	
	public ImageIcon GetImage() {
		return newimageicon3;
	}
}
