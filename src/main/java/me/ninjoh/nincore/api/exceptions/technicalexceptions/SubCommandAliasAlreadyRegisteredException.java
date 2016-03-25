package me.ninjoh.nincore.api.exceptions.technicalexceptions;


import me.ninjoh.nincore.api.exceptions.TechnicalException;

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
