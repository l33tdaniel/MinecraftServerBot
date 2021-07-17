package DiscordBot;
import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Main {
// Bot server = new Bot();
	
	public static JDA jda;
	public static String PREFIX = "/";
	
	public static void main(String[] args) throws LoginException {
		
		JDA jda = JDABuilder.createDefault("your link - I don't want to put mine in here").build();
		jda.getPresence().setStatus(OnlineStatus.IDLE);
		jda.getPresence().setActivity(Activity.watching("your mom"));
		jda.addEventListener(new Bot());
		
	}
}
