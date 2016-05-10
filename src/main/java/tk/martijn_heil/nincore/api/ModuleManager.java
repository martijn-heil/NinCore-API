package tk.martijn_heil.nincore.api;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * This manages modules in a {@link Core}
 */
public class ModuleManager
{
    @Getter @Setter private List<CoreModule> modules = new ArrayList<>();
                    private final Core core;


    public ModuleManager(Core core)
    {
        this.core = core;
    }


    public void addModule(CoreModule module)
    {
        modules.add(module);
    }


    public void enableAll()
    {
        for (CoreModule mod : this.modules)
        {
            try
            {
                mod.onEnable();
            }
            catch(Exception e)
            {
                this.core.getNinLogger().info("An uncaught exception whilst enabling the " + mod.getClass().getSimpleName() + " module;");
                e.printStackTrace();
            }
        }
    }


    public void disableAll()
    {
        for (CoreModule mod : this.modules)
        {
            try
            {
                mod.onDisable();
            }
            catch(Exception e)
            {
                this.core.getNinLogger().info("An uncaught exception occurred whilst disabling the " + mod.getClass().getSimpleName() + " module;");
                e.printStackTrace();
            }
        }
    }
}
