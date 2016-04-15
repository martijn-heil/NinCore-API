package me.ninjoh.nincore.api.internals;

/**
 * <bold>Do NOT use! Only for internal usage!</bold>
 */
@Deprecated
public final class Internals
{
    private static NinCoreAPILogger logger = new NinCoreAPILogger();

    public static NinCoreAPILogger getApiLogger()
    {
        return logger;
    }
}
