package DiscordBot;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
public class Bot extends ListenerAdapter {
	JSoupScraper test = new JSoupScraper();
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		if(event.getMessage().getContentRaw().equalsIgnoreCase(Main.PREFIX + "server")) {
			if(test.checkServerStatus() == false) {
				event.getChannel().sendMessage("The server is down\n@discovandal can you put it up?").queue();
			}
			else
			event.getChannel().sendMessage("The server is up! have fun <3").queue();
		}
	}
}
