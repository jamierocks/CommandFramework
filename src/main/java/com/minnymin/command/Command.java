package com.minnymin.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Command Framework - Command <br>
 * The command annotation used to designate methods as commands. All methods
 * should have a single CommandArgs argument
 *
 * @author minnymin3
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Command {

    /**
     * A list of names that the command is executed under. See
     * name() for details on how names work
     *
     * @return
     */
    String[] aliases();

    /**
     * The parent command, for creating sub-command structures
     *
     * @return parent command
     */
    String parent() default "";

    /**
     * Gets the required permission of the command
     *
     * @return
     */
    String permission() default "";

    /**
     * The message sent to the player when they do not have permission to
     * execute it
     *
     * @return
     */
    String noPerm() default "You do not have permission to perform that action";

    /**
     * The description that will appear in /help of the command
     *
     * @return
     */
    String description() default "";

    /**
     * The usage that will appear in /help (commandname)
     *
     * @return
     */
    String usage() default "";

    /**
     * Whether or not the command is available to players only
     *
     * @return
     */
    boolean inGameOnly() default false;
}
