package bot.blackhole;

import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.util.DiscordException;

public class AutoGM {

	public static IDiscordClient client;
	private static String TOKEN;

	private static void loadConfiguration() {

		final TOKEN = ; // read from file
		// do config stuff here
	}

	public static void main(String[] args) throws DiscordException {
		loadConfiguration();
		client = new ClientBuilder().withToken(TOKEN).login();
		client.getDispatcher().registerListener(new CommandListener());
		client.getDispatcher().registerListener(new CommandExecutor(client));
	}
}

int getYearModel(int model)
{
	return model;
}
