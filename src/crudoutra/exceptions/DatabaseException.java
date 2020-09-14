/*
 *   
 *   Author : Deepak Malik
 *   https://github.com/devmalik19/crudoutra-java
 *
 */

package crudoutra.exceptions;

import java.sql.SQLException;

import crudoutra.config.Constant;

public class DatabaseException extends SQLException
{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public DatabaseException(String errorMessage) 
    {
        super(errorMessage);
    }

    public DatabaseException() 
    {
        super(Constant.ERROR_DB);
    }
}    
