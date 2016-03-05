package me.ninjoh.nincore.api.exceptions;


public class SubCommandAliasAlreadyRegistered extends Exception
{
    public SubCommandAliasAlreadyRegistered(String alias)
    {
        super(alias);
    }
}
