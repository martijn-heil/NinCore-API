package tk.martijn_heil.nincore.api.entity;


import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

public interface NinOfflinePlayer
{
    /**
     * Get the related {@link OfflinePlayer}
     *
     * @return The related {@link OfflinePlayer}
     */
    @NotNull
    OfflinePlayer toOfflinePlayer();
}
