package tk.martijn_heil.nincore.api.logging;


import tk.martijn_heil.nincore.api.CoreModule;

import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class ModuleLogger extends Logger
{
    private CoreModule module;

    public ModuleLogger(CoreModule module)
    {
        super(module.getClass().getSimpleName() + "ModuleLogger", null);
        this.setParent(module.getCore().getNinLogger());
        this.module = module;
    }


    // Insert [ModuleName] in front of the message, then pass the log record on.
    @Override
    public void log(LogRecord logRecord)
    {
        String message = logRecord.getMessage();
        message = "(" + module.getClass().getSimpleName() + ") " + message;
        logRecord.setMessage(message);
        this.getParent().log(logRecord);
    }
}
