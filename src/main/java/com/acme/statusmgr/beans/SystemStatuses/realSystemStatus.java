package com.acme.statusmgr.beans.SystemStatuses;

/**
 * This class is a facade all the varied types of system status we make use of.
 * This contains all the real information calling the appopriate methods
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
