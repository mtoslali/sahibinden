package client;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import mail.MailGenerator;
import mail.MailManagement;
import model.Car;


public class SahibindenManipulation {
	
	private static String url = "https://www.sahibinden.com/arazi-suv-pick-up-subaru-forester-2.0-xt?a277_min=2013&sorting=date_desc";
    
   // Document doc = Jsoup.connect(url).get();
	public static void getForester(){
		Document doc;
		int count = 0;;
		String mailContent;
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",new Locale("tr"));
		
			String dateWithoutTime = sdf.format(new Date());
			System.out.println(dateWithoutTime);
		
	    try {

	        // need http protocol
	        doc = Jsoup.connect(url).get();

	        // get page title
	        String title = doc.title();
	        Element table = doc.select("table").get(0); //select the first table.
	        Elements rows = table.select("tr");
	        System.out.println("");
	        System.out.println("");
	        System.out.println("");
	        System.out.println(rows.toString());
	        System.out.println("Ilan sayisi" + rows.size());
	        List<Car> cars = new ArrayList<>();
	        for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
	            Element row = rows.get(i);
	            Car car;
	            
	            Elements cols = row.select("td");
//	            System.out.println(row.toString() + "/t" + cols.toString());
//	            System.out.println(cols.get(6).text());
	            if(cols.size()>1){
	            	 String dateOfRelease = cols.get(6).text();
	            	 
	 	            if (dateOfRelease.equalsIgnoreCase(dateWithoutTime)) {
	 	            	String color = cols.get(4).text();
	 	            	
	 	            	String km = cols.get(3).text();
	 	            	String price = cols.get(5).text();
	 	            	String residence = cols.get(7).text();
	 	            	String year = cols.get(2).text();
	 	            	
	 	            	
	 	              //  downServers.add(cols.get(5).text());
	 	            	count++;
	 	            	Element link = cols.select("a").first();
	 	            	Element imgLing = cols.select("img").first();
	 	            	String img = imgLing.attr("src");
	 	            	System.out.println("Ilan eklendi: " );
	 	            	car = new Car();
	 	            	car.setColor(color);
	 	            	car.setImg(img);
	 	            	car.setKm(km);
	 	            	car.setPrice(price);
	 	            	car.setResidence(residence);
	 	            	car.setURL("https://www.sahibinden.com" + link.attr("href"));
	 	            	car.setYear(year);
	 	            	System.out.println(car);
	 	            	cars.add(car);
	 	            	
	 	            	
	 	            }
	            }
	           
	        }
	        if(cars.size()!=0){
	        	mailContent = MailGenerator.getContent(cars);
	        	MailManagement.sendMail(mailContent);
	        }
	        

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	


}
 