package java.models;

import java.models.enums.BotDiffiCultyLevel;

public class Bot extends Player {
    private BotDiffiCultyLevel botDiffiCultyLevel;

    public BotDiffiCultyLevel getBotDiffiCultyLevel() {
        return botDiffiCultyLevel;
    }

    public void setBotDiffiCultyLevel(BotDiffiCultyLevel botDiffiCultyLevel) {
        this.botDiffiCultyLevel = botDiffiCultyLevel;
    }
}
