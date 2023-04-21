package com.acme.statusmgr.beans.SystemStatuses;

/**
 * This class is a facade all the varied types of system status we make use of. So the information is obtainable through a centralized,
 * simple class, so that new programmers can easily see what status items we care about and how to obtain them
 */
public class realSystemStatus implements SystemStatusInterface {
    public long getAvailableProcessors(){
        return Runtime.getRuntime().availableProcessors();
    }

    public long getFreeJVMMemory(){
        return Runtime.getRuntime().freeMemory();
    }

    public Runtime.Version getJreVersion(){
        return Runtime.version();
    }

    public String getTempLocation(){
        return System.getenv("TEMP");
    }

    public long getTotalJVMMemory(){
        return Runtime.getRuntime().totalMemory();
    }

}
