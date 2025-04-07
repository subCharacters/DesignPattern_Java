package Facade;

public class LevelUpFacade {
    public void levelUp(Player player) {
        SoundManager.playLevelUpSound();
        EffectManager.showLevelUpEffect(player.getPosition());
        StatManager.increaseStats(player);
    }
}
