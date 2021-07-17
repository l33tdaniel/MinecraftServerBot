package DiscordBot;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.*;
public class JSoupScraper{
	String html = "https://mcsrvstat.us/server/(youripgoeshere)"; // website for the server
	String testingFor = "Could not get the server status…";  // server is down
	public boolean checkServerStatus() {
		String temp = "";
		try {
			Document doc = Jsoup.connect(html).get();
			Elements test = doc.select("h1,h2,h3,h4,h5,h6");
			for(Element header : test) {
				System.out.println(test);
				temp += test;
			}
			if(temp.indexOf(testingFor) != -1) {
				return false; // server is down
			}
			return true; // server is up
			
		}
		catch(Exception e) {
			System.out.println(e); // catches exceptions
		}
		return false;
	}
}
