package bot.blackhole;

import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.util.DiscordException;
import java.util.stream.Stream;

public class AutoGM {

    public final static String COMMAND_KEY;
    public final static String LOGIN_TOKEN;

    public static IDiscordClient client;

    // do config stuff here
    private static void loadConfiguration() {
        // read from file here
        LOGIN_TOKEN = "";
        COMMAND_KEY = "!";
    }

    public static void main(String[] args) throws DiscordException {
        loadConfiguration();
        client = new ClientBuilder().withToken(TOKEN).login();
        client.getDispatcher().registerListener(new CommandListener());
        // Add new commands here:
    }
}
