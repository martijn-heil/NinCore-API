package me.ninjoh.nincore.api;


import me.ninjoh.nincore.api.entity.NinPlayer;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NinServer
{
    /**
     * Get all online {@link NinPlayer}s.
     * Returns an empty list if there ar eno online {@link NinPlayer}s.
     *
     * @return All online {@link NinPlayer}s, will return an empty list if there are no online NinPlayers.
     */
    @NotNull
    List<NinPlayer> getOnlineNinPlayers();

    /**
     * Get a online {@link NinPlayer} by {@link Player}.
     *
     * @param p The related {@link Player}
     * @return The {@link NinPlayer} which was found, will return null if no NinPlayer was found.
     */
    @Nullable
    NinPlayer getNinPlayer(Player p);

    /**
     * Get the {@link Server}.
     *
     * @return The {@link Server}.
     */
    @NotNull
    Server getServer();
}
