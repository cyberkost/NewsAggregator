package bot.newsaggregator.bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class NewsAggregatorBot extends TelegramLongPollingBot {
    public NewsAggregatorBot(@Value("${bot.token}") String botToken) {
        super(botToken);
    }

    @Override
    public String getBotUsername() {
        return "AggrNewsBot";
    }

    @Override
    public void onUpdateReceived(Update update) {

    }
}
