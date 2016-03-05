package me.ninjoh.nincore.api.command;


import me.ninjoh.nincore.api.IArgumentDataType;

public interface NinArgument
{
    String getName();


    boolean isRequired();


    boolean isCustomArgumentDataType();


    NinArgumentType getArgumentType();


    IArgumentDataType getArgumentDataType();
}
