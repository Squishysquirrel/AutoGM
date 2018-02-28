package bot.blackhole.command;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.MessageBuilder;
import sx.blah.discord.util.MissingPermissionsException;
import sx.blah.discord.util.RateLimitException;

public class CommandExecutor {

	private final IDiscordClient client;

	public CommandExecutor(IDiscordClient client) {
		this.client = client;
	}

	@EventSubscriber
	public void handle(CommandEvent event) {
		try {
			MessageBuilder mb = new MessageBuilder(client);
			mb.withChannel(event.getMessage().getChannel());

			switch (event.getCommand().toLowerCase()) {
			case "ping":
				mb.withContent("Pong!").build();
				break;
			default:
				mb.withContent("Use '!help' for acceptable commands").build();
				break;
			}
		} catch (MissingPermissionsException e) {
			e.printStackTrace();
		} catch (RateLimitException e) {
			e.printStackTrace();
		} catch (DiscordException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
