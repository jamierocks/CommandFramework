package com.minnymin.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TabComplete {

    /**
     * List of commands (or command aliases) to which this tab completion applies
     *
     * @return list of commands or command aliases
     */
    String[] commands();
}
