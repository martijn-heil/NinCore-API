package tk.martijn_heil.nincore.api;


import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;

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


    /**
     * Add a new module.
     *
     * @param module The module to add.
     * @throws IllegalArgumentException If a module with this name already is registered.
     */
    public void addModule(CoreModule module) throws IllegalArgumentException
    {
        checkArgument(this.getModule(module.getName()) == null, "A module with this name is already registered.");
        modules.add(module);
    }


    /**
     * Get a module via it's name.
     *
     * @param name The name to search a module for. This name is case-sensitive.
     * @return The module, if no module was found this will return null.
     */
    @Nullable
    public CoreModule getModule(String name)
    {
        for (CoreModule module : modules)
        {
            if(module.getName().equals(name)) return module;
        }

        return null;
    }


    /**
     * Enable all modules.
     */
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


    /**
     * Disable all modules.
     */
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
