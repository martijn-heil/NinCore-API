package tk.martijn_heil.nincore.api.util;


import org.jetbrains.annotations.Nullable;

public class ReflectionUtils
{
    /**
     * Please note that this is really performance heavy!
     *
     * @return OBC (org.bukkit.craftbukkit) base package or null.
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
     * Please note that this is really performance heavy!
     *
     * @return NMS base package or null.
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
