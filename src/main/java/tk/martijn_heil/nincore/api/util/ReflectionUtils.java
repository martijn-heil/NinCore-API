package tk.martijn_heil.nincore.api.util;


import org.jetbrains.annotations.Nullable;

/**
 * All reflection related utilities.
 *
 * @author Ninjoh
 */
public class ReflectionUtils
{
    /**
     * Please note that this is quite performance heavy! (it iterates through all packages)
     *
     * @return OBC (org.bukkit.craftbukkit.XXX) base package or null if OBC could not be found.
     */
    @Nullable
    public static Package getOBC()
    {
        for (Package p : Package.getPackages())
        {
            if(p.getName().startsWith("org.bukkit.craftbukkit")) return p;
        }

        return null;
    }


    /**
     * Please note that this is quite performance heavy! (it iterates through all packages)
     *
     * @return NMS base package (net.minecraft.server.XXX) or null if NMS could not be found.
     */
    @Nullable
    public static Package getNMS()
    {
        for (Package p : Package.getPackages())
        {
            if(p.getName().startsWith("net.minecraft.server")) return p;
        }

        return null;
    }
}
