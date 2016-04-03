package me.ninjoh.nincore.api.internals;

import me.ninjoh.nincore.api.NinCore;
import me.ninjoh.nincore.api.NinCoreAPILogger;

/**
 * <bold>Do NOT use! Only for internal usage!</bold>
 */
@Deprecated
public final class Internals
{
    public static NinCoreAPILogger getApiLogger()
    {
        return NinCore.getApiLogger();
    }
}
