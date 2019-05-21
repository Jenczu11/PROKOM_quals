import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;


public class Kolokwium {

	public static void main(String[] args) {
		List<Pasazerowie> brzeg1=new ArrayList<Pasazerowie>();
		List<Pasazerowie> brzeg2=new ArrayList<Pasazerowie>();
		List<Pasazerowie> temp;
		brzeg1.add(new Kanibal("WItek"));
		brzeg1.add(new Kanibal("WItek2"));
		brzeg1.add(new Kanibal("WItek3"));
		brzeg1.add(new Misjonarz("Misjonarz1"));
		brzeg1.add(new Misjonarz("Misjonarz2"));
		brzeg1.add(new Misjonarz("Misjonarz3"));
		
		
		String wybor;
		int iteracje=0;
		while(true)
		{
			wybor=JOptionPane.showInputDialog("Podaj");
			
			switch(wybor)
			{
			case "q":
			case "Q": return;
			case "d":
			case "D": drukujKolekcje(brzeg1,brzeg2);break;
			case "s": sortuj(brzeg1);break;
			case "S": sortuj(brzeg2);break;
			case "p":
			case "P":doPliku(brzeg1,brzeg2,iteracje);break;
			case "m":
			case "M":przewiezMisjonarza(brzeg1, brzeg2);break;
			case "k":
			case "K":przewiezKanibala(brzeg1, brzeg2);break;
			case "r":
			case "R":przewiezDwochKanibali(brzeg1, brzeg2);break;
			case "o":
			case "O": przewiezDwochMisjonarzy(brzeg1, brzeg2);break;
			case "t":
			case "T":para(brzeg1,brzeg2);break;
			}
			
			temp=brzeg1;
			brzeg1=brzeg2;
			brzeg2=temp;
			
			
			iteracje+=1;
		}
			
		
	}
	
	public static void drukujKolekcje(List<Pasazerowie> list1,List<Pasazerowie>list2)
	{
		System.out.println("Brzeg1");
		for(Pasazerowie pasazer : list1)
		{
			System.out.println(pasazer.toString());
		}
		System.out.println("Brzeg2");
		for(Pasazerowie pasazer : list2)
		{
			System.out.println(pasazer.toString());
		}
	}
	public static void sortuj(List<Pasazerowie> list1)
	{
		Collections.sort(list1);
	}
	
	public static void doPliku(List<Pasazerowie> list1,List<Pasazerowie> list2,int iteracje)
	{
		File plik=new File("plik");
		try
		{
			plik.createNewFile();
		}
		catch(IOException e)
		{
			System.err.println(e.getMessage());
		}
		try(PrintWriter drukarka=new PrintWriter(plik))
		{
			
			drukarka.println("Iteracje :"+iteracje);
			drukarka.println("Brzeg1 :");
			for(Pasazerowie pasazer : list1)
			{
				drukarka.println(pasazer.toString());
			}
			drukarka.println("Brzeg2 :");
			for(Pasazerowie pasazer : list2)
			{
				drukarka.println(pasazer.toString());
			}
		}
		catch(FileNotFoundException e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	public static void przewiezMisjonarza(List<Pasazerowie> zKtorego,List<Pasazerowie> naKtory)
	{
		boolean flaga=false;
		
		for(Pasazerowie pasazer : zKtorego)
		{
			if(pasazer instanceof Misjonarz)
			{
				flaga=true;
				naKtory.add(pasazer);
				zKtorego.remove(pasazer);
				break;
			}
		}
		if(flaga==false)
		{
			System.out.println("Nie ma misjonarza na tym brzegu");
		}
		
	}
	public static void przewiezKanibala(List<Pasazerowie> zKtorego,List<Pasazerowie> naKtory)
	{
		boolean flaga=false;
		
		for(Pasazerowie pasazer : zKtorego)
		{
			if(pasazer instanceof Kanibal)
			{
				flaga=true;
				naKtory.add(pasazer);
				zKtorego.remove(pasazer);
				break;
			}
		}
		if(flaga==false)
		{
			System.out.println("Nie ma Kanibala na tym brzegu");
		}
		
	}
	public static void przewiezDwochMisjonarzy(List<Pasazerowie> zKtorego,List<Pasazerowie> naKtory)
	{
		boolean flaga=false;
		if(zKtorego.size()<2)
		{
			System.out.println("Za malo Ludzui na brzegu");
		}
		else
		{
			for(Pasazerowie pasazer : zKtorego)
			{
				if(pasazer instanceof Misjonarz)
				{
					for(Pasazerowie pasazer2:zKtorego)
					{
						if(pasazer!=pasazer2 &&pasazer2 instanceof Misjonarz)
						{
							System.out.println("Przenosimy misjonarzy");
							naKtory.add(pasazer);
							naKtory.add(pasazer2);
							zKtorego.remove(pasazer);
							zKtorego.remove(pasazer2);
							flaga=true;
							break;
						}
					}
				}
			}
			if(flaga==false)
			{
				System.out.println("NIema 2 misjonarzy");
			}
				
		}
	}
	
	public static void przewiezDwochKanibali(List<Pasazerowie> zKtorego,List<Pasazerowie> naKtory)
	{
		boolean flaga=false;
		if(zKtorego.size()<2)
		{
			System.out.println("Za malo Ludzui na brzegu");
		}
		else
		{
			for(Pasazerowie pasazer : zKtorego)
			{
				if(pasazer instanceof Kanibal)
				{
					for(Pasazerowie pasazer2:zKtorego)
					{
						if(pasazer!=pasazer2 &&pasazer2 instanceof Kanibal)
						{
							System.out.println("Przenosimy kanibali");
							naKtory.add(pasazer);
							naKtory.add(pasazer2);
							zKtorego.remove(pasazer);
							zKtorego.remove(pasazer2);
							flaga=true;
							break;
						}
					}
				}
			}
			if(flaga==false)
			{
				System.out.println("NIema 2 kanibali");
			}
				
		}
	}
	
	public static void para(List<Pasazerowie> zKtorego,List<Pasazerowie> naKtory)
	{
		boolean flaga=false;
		if(zKtorego.size()<2)
		{
			System.out.println("Za malo Ludzui na brzegu");
		}
		for(Pasazerowie pasazer : zKtorego)
		{
			if(pasazer instanceof Kanibal)
			{
				for(Pasazerowie pasazer2:zKtorego)
				{
					if(pasazer2 instanceof Misjonarz)
					{
						System.out.println("Prenosimy 1 Kanibala i 1 Misjonarza");
						naKtory.add(pasazer);
						naKtory.add(pasazer2);
						zKtorego.remove(pasazer);
						zKtorego.remove(pasazer2);
						flaga=true;
						break;
					}
				}
			}
		}
		if(flaga==false)
		{
			System.out.println("NIe ma 1 Kanibala i 1 Misjonarza na brzegu");
		}
	}

}
