package stringOrnek3;

import java.util.StringTokenizer;

public class stringOrnek3 {

	public static void main(String[] args) {
		String dizge = "JAVA JSP Android*.NET\\C++/Mobile";
		
		StringTokenizer s = new StringTokenizer(dizge," *\\/");
		StringTokenizer s1 = new StringTokenizer(dizge);
		
		System.out.println(s.countTokens());
		while(s.hasMoreTokens()){
			System.out.println(s.nextToken());
			System.out.println(s.countTokens());
		}
		
		while(s1.hasMoreElements()){
			System.out.println((String)s1.nextElement());
		}
		
		String ad = "Sezer";
		String soyad = "Tanrýverdioðlu";
		
//		ad = ad + soyad + + + + +;
		
		StringBuffer s3 = new StringBuffer(ad);
		s3.append(" ").append(soyad).append(" ").append("Kodlab").append(" ").append(2012);
		
		System.out.println(s3);
		
		s3.replace(0, 5, "Mehmet");
		
		System.out.println(s3);
		
		s3.insert(7, "veri ekleme");
		
		System.out.println(s3);

		s3.delete(7, 18);
		
		System.out.println(s3);
		
		s3.reverse();
		
		System.out.println(s3);
	}

}
