package ru.DanilAlekseev.project.JokeBot.Sbornik_anekdotov.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.DanilAlekseev.project.JokeBot.Sbornik_anekdotov.bot.MyJokeBot;

@Configuration
public class MyJokeBotConfig {
    @Bean
    public CommandLineRunner registerTelegramBot(MyJokeBot myJokeBot) {
        return args -> {
            try {
                TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
                botsApi.registerBot(myJokeBot);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        };
    }
}
