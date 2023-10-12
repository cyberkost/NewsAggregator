package bot.newsaggregator.config;

import bot.newsaggregator.bot.NewsAggregatorBot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Configuration
public class NewsAggregatorBotConfiguration {
    @Bean
    public TelegramBotsApi telegramBotsApi(NewsAggregatorBot newsAggregatorBot) throws TelegramApiException {
        var api = new TelegramBotsApi(DefaultBotSession.class);
        api.registerBot(newsAggregatorBot);
        return api;
    }
}
