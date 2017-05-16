package externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class musteri implements Externalizable
{
	private String ad;
	private String soyad;
	private int yas;
	
	public musteri(String ad,String soyad,int yas)
	{
		this.ad=ad;
		this.soyad=soyad;
		this.yas=yas;
	}
	
	public String getAd()
	{
		return ad;
	}
	
	public String getSoyad()
	{
		return soyad;
	}
	
	public int getYas()
	{
		return yas;
	}
	
	public void writeexternal(ObjectOutput o1)
	{
		try {
			o1.writeObject(this.ad);
			o1.writeObject(this.soyad);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void readexternal(ObjectInput o2) throws Exception, IOException
	{
		this.ad=(String) o2.readObject();
		this.soyad=(String) o2.readObject();
	}
	
	public static void main(String[] args)
	{

	}

	@Override
	public void readExternal(ObjectInput arg0) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}

}

