package bot.newsaggregator;

import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.generics.LongPollingBot;

public abstract class TelegramLongPollingBot extends DefaultAbsSender implements LongPollingBot {
    public TelegramLongPollingBot(String botToken) {
        this(new DefaultBotOptions(), botToken);
    }
    public TelegramLongPollingBot(DefaultBotOptions options, String botToken) {
        super(options, botToken);
    }
}
