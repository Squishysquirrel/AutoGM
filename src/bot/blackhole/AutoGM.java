package bot.blackhole;

import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.util.DiscordException;

public class AutoGM {

	public static IDiscordClient client;
	private final static String TOKEN = "MTgyMjg4MTA2MzgzMzQzNjE3.Ch1Ihw.xLlqB5RN7dwTvFtIplvxr5gHN6Q";

	public static void main(String[] args) throws DiscordException {
		client = new ClientBuilder().withToken(TOKEN).login();
		client.getDispatcher().registerListener(new CommandListener());
		client.getDispatcher().registerListener(new CommandExecutor(client));
	}
}
// Joshua Lebron is in charge of roll creation.
