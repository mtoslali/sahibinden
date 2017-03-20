package mail;

import java.util.Iterator;
import java.util.List;

import model.Car;

public class MailGenerator {
	public static String getContent(List<Car> cars){
		String row= "<tr >\n"+
				" <td class=\"text-left\">\n";
		for (Iterator iterator = cars.iterator(); iterator.hasNext();) {
			Car car = (Car) iterator.next();
			row += "<a href=\"" + car.getURL() +"\">\n"+
					"\t <img src=\"" + car.getImg() + "\"></img>\n"+
			"</a>\n"+
			"</td>\n"+
			" <td class=\"text-left\">" + car.getPrice() +"</td>\n"+
			" <td class=\"text-left\">" + car.getKm() + "</td>\n"+
			" <td class=\"text-left\">" + car.getResidence() +"</td>\n"+
			" <td class=\"text-left\">" + car.getYear() +  "</td>\n"+
					" <td class=\"text-left\">" + car.getColor()+" </td>\n"+
					"</tr>\n";
			
		}
		System.out.println(content + row + ending);
		return content + row + ending;
	}
	private static String carRow = 	"<tr >\n"+
			" <td class=\"text-left\">\n"+
			"<a href=\"https://www.sahibinden.com/ilan/vasita-arazi-suv-pick-up-subaru-2016-subaru-forester-2.0-xt-awd-adventure-turbo-benzinli-hatasiz-400855366/detay\">\n"+
			"\t <img src=\"https://image5.sahibinden.com/photos/78/50/72/thmb_376785072xge.jpg\"></img>\n"+
			"</a>\n"+
			"</td>\n"+
			" <td class=\"text-left\">$ 50,000.00</td>\n"+
			" <td class=\"text-left\">$ 50,000.00</td>\n"+
			" <td class=\"text-left\">$ 50,000.00</td>\n"+
			" <td class=\"text-left\">$ 50,000.00</td>\n"+
			" <td class=\"text-left\">$ 50,000.00</td>\n"+
			"</tr>\n";
	private static String content ="<html lang=\"en\">\n"+
					"<head>\n"+
					"\t<meta charset=\"utf-8\" />\n"+
					"\t<title>Table Style</title>\n"+
					"\t<meta name=\"viewport\" content=\"initial-scale=1.0; maximum-scale=1.0; width=device-width;\">\n"+
					"\t<style type=\"text/css\">\n"+
					"\t\t@import url(http://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100);\n"+
					"\n"+
					"body {\n"+
					" background-color: #3e94ec;\n"+
					" font-family: \"Roboto\", helvetica, arial, sans-serif;\n"+
					" font-size: 16px;\n"+
					" font-weight: 400;\n"+
					" text-rendering: optimizeLegibility;\n"+
					"}\n"+
					"\n"+
					"div.table-title {\n"+
					" display: block;\n"+
					" margin: auto;\n"+
					" max-width: 600px;\n"+
					" padding:5px;\n"+
					" width: 100%;\n"+
					"}\n"+
					"\n"+
					".table-title h3 {\n"+
					" color: #fafafa;\n"+
					" font-size: 30px;\n"+
					" font-weight: 400;\n"+
					" font-style:normal;\n"+
					" font-family: \"Roboto\", helvetica, arial, sans-serif;\n"+
					" text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);\n"+
					" text-transform:uppercase;\n"+
					"}\n"+
					"\n"+
					"\n"+
					"/*** Table Styles **/\n"+
					"\n"+
					".table-fill {\n"+
					" background: white;\n"+
					" border-radius:3px;\n"+
					" border-collapse: collapse;\n"+
					" height: 320px;\n"+
					" margin: auto;\n"+
					" max-width: 600px;\n"+
					" padding:5px;\n"+
					" width: 100%;\n"+
					" box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);\n"+
					" animation: float 5s infinite;\n"+
					"}\n"+
					" \n"+
					"th {\n"+
					" color:#D5DDE5;;\n"+
					" background:#1b1e24;\n"+
					" border-bottom:4px solid #9ea7af;\n"+
					" border-right: 1px solid #343a45;\n"+
					" font-size:23px;\n"+
					" font-weight: 100;\n"+
					" padding:24px;\n"+
					" text-align:left;\n"+
					" text-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);\n"+
					" vertical-align:middle;\n"+
					"}\n"+
					"\n"+
					"th:first-child {\n"+
					" border-top-left-radius:3px;\n"+
					"}\n"+
					" \n"+
					"th:last-child {\n"+
					" border-top-right-radius:3px;\n"+
					" border-right:none;\n"+
					"}\n"+
					" \n"+
					"tr {\n"+
					" border-top: 1px solid #C1C3D1;\n"+
					" border-bottom-: 1px solid #C1C3D1;\n"+
					" color:#666B85;\n"+
					" font-size:16px;\n"+
					" font-weight:normal;\n"+
					" text-shadow: 0 1px 1px rgba(256, 256, 256, 0.1);\n"+
					"}\n"+
					" \n"+
					"tr:hover td {\n"+
					" background:#4E5066;\n"+
					" color:#FFFFFF;\n"+
					" border-top: 1px solid #22262e;\n"+
					" border-bottom: 1px solid #22262e;\n"+
					"}\n"+
					" \n"+
					"tr:first-child {\n"+
					" border-top:none;\n"+
					"}\n"+
					"\n"+
					"tr:last-child {\n"+
					" border-bottom:none;\n"+
					"}\n"+
					" \n"+
					"tr:nth-child(odd) td {\n"+
					" background:#EBEBEB;\n"+
					"}\n"+
					" \n"+
					"tr:nth-child(odd):hover td {\n"+
					" background:#4E5066;\n"+
					"}\n"+
					"\n"+
					"tr:last-child td:first-child {\n"+
					" border-bottom-left-radius:3px;\n"+
					"}\n"+
					" \n"+
					"tr:last-child td:last-child {\n"+
					" border-bottom-right-radius:3px;\n"+
					"}\n"+
					" \n"+
					"td {\n"+
					" background:#FFFFFF;\n"+
					" padding:20px;\n"+
					" text-align:left;\n"+
					" vertical-align:middle;\n"+
					" font-weight:300;\n"+
					" font-size:18px;\n"+
					" text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);\n"+
					" border-right: 1px solid #C1C3D1;\n"+
					"}\n"+
					"\n"+
					"td:last-child {\n"+
					" border-right: 0px;\n"+
					"}\n"+
					"\n"+
					"th.text-left {\n"+
					" text-align: left;\n"+
					"}\n"+
					"\n"+
					"th.text-center {\n"+
					" text-align: center;\n"+
					"}\n"+
					"\n"+
					"th.text-right {\n"+
					" text-align: right;\n"+
					"}\n"+
					"\n"+
					"td.text-left {\n"+
					" text-align: left;\n"+
					"}\n"+
					"\n"+
					"td.text-center {\n"+
					" text-align: center;\n"+
					"}\n"+
					"\n"+
					"td.text-right {\n"+
					" text-align: right;\n"+
					"}\n"+
					"\n"+
					"\t</style>\n"+
					"</head>\n"+
					"\n"+
					"<body>\n"+
					"<div class=\"table-title\">\n"+
					"<h3>Gunun Ilanlari</h3>\n"+
					"</div>\n"+
					"<table class=\"table-fill\">\n"+
					"<thead>\n"+
					"<tr >\n"+
					"<th class=\"text-left\">Arac</th>\n"+
					"<th class=\"text-left\">Fiyat</th>\n"+
					"<th class=\"text-left\">Km</th>\n"+
					" <th class=\"text-left\">Yer</th>\n"+
					" <th class=\"text-left\">Yil</th>\n"+
					" <th class=\"text-left\">Renk</th>\n"+
					"</tr>\n"+
					"</thead>\n"+
					"<tbody class=\"table-hover\">\n";
					
				
					
					
	private static	String ending= 			"\n"+
					"</tbody>\n"+
					"</table>\n"+
					" \n"+
					"\n"+
					" </body>";

}
