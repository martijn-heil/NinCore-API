package tk.martijn_heil.nincore.api;


import tk.martijn_heil.nincore.api.entity.NinCommandSender;
import tk.martijn_heil.nincore.api.entity.NinConsoleCommandSender;
import tk.martijn_heil.nincore.api.entity.NinOfflinePlayer;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tk.martijn_heil.nincore.api.entity.NinOnlinePlayer;

import java.util.List;

public interface EntityManager
{
    /**
     * Get all online {@link NinOnlinePlayer}s.
     * Returns an empty list if there ar eno online {@link NinOnlinePlayer}s.
     *
     * @return All online {@link NinOnlinePlayer}s, will return an empty list if there are no online NinPlayers.
     */
    @NotNull
    List<NinOnlinePlayer> getNinOnlinePlayers();


    /**
     * Get a online {@link NinOnlinePlayer} by {@link Player}.
     *
     * @param player The related {@link Player}
     * @return The {@link NinOnlinePlayer} which was found, will return null if no NinOnlinePlayer was found, this should not (but may) ever happen though.
     */
    NinOnlinePlayer getNinOnlinePlayer(@NotNull Player player);


    @Nullable
    NinOfflinePlayer getNinOfflinePlayer(@NotNull OfflinePlayer offlinePlayer);


    @NotNull
    NinConsoleCommandSender getNinConsoleCommandSender();

    @NotNull
    NinCommandSender getNinCommandSender(@NotNull CommandSender commandSender);
}
