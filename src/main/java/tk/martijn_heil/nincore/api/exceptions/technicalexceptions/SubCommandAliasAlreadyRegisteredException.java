package tk.martijn_heil.nincore.api.exceptions.technicalexceptions;


import tk.martijn_heil.nincore.api.exceptions.TechnicalException;

public class SubCommandAliasAlreadyRegisteredException extends TechnicalException
{
    String alias;


    public SubCommandAliasAlreadyRegisteredException(String alias)
    {
        this.alias = alias;
    }


    public String getAlias()
    {
        return this.alias;
    }
}
