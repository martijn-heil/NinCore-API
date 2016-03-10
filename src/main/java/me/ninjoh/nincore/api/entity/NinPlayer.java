package me.ninjoh.nincore.api.entity;


import me.ninjoh.nincore.api.CanReceiveChatMessage;
import me.ninjoh.nincore.api.MinecraftLocale;
import me.ninjoh.nincore.api.NinOfflinePlayer;
import org.bukkit.entity.Player;

public interface NinPlayer extends NinOfflinePlayer, CanReceiveChatMessage
{
    /**
     * Get the bukkit player.
     *
     * @return bukkit player.
     */
    Player getPlayer();


    /**
     * Get a player's client lang.
     *
     * @return The player's lang.
     */
    MinecraftLocale getMinecraftLocale();

    /**
     * Very unstable still!
     *
     * @return true if the player is flying using an elytra.
     */
    boolean isFlyingUsingElytra();

}
