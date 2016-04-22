package tk.martijn_heil.nincore.api;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager
{
    @Getter @Setter private List<CoreModule> modules = new ArrayList<>();


    public void addModule(CoreModule module)
    {
        modules.add(module);
    }


    public void enableAll()
    {
        modules.forEach(CoreModule::onEnable);
    }

    public void disableAll()
    {
        modules.forEach(CoreModule::onDisable);
    }
}
