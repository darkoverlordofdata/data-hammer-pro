/**
 +--------------------------------------------------------------------+
 | Constants.java
 +--------------------------------------------------------------------+
 | Copyright DarkOverlordOfData (c) 2014
 +--------------------------------------------------------------------+
 |
 | This file is a part of Data Hammer Pro
 |
 | Data Hammer Pro is free software; you can copy, modify, and distribute
 | it under the terms of the MIT License
 |
 +--------------------------------------------------------------------+
 */
package com.darkoverlordofdata.datahammerpro;

public final class Constants {
    public static final int         DIALOG_WRITE_PROGRESS   = 0;

    /**
     * Configuration
     */
    public static final int         THROTTLE                = 0;        // limit # of blocks to process
    public static final int         PROGRESS                = 10000;    // progress update modulo
    public static final boolean     BETA                    = false;    // log status messages
    public static final boolean     FREE_MEMORY             = true;     // delete the files when we're done
    public static final int         PAGE_SIZE               = 1024 * 4;
    public static final String      FILENAME                = "darkoverlordofdata.malleus";

}
