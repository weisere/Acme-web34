package com.acme.servermgr;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Manage all REMOTE servers (service providers) being tracked by the Acme server tracking system
 */
@Primary
@Service
public class ServerManagerRemote  implements ServerManagerInterface  {
    /**
     * Get the status of this server
     * @return a descriptive string about the servers status
     */

     public String getCurrentServerStatus() {
         System.out.println("checking remote server for status ...");
        return "up on the remote system";  // The server is up
    }

    /**
     * Find out if this server is operating normally
     * @return Boolean indicating if server is operating normally
     */

     public Boolean isOperatingNormally()
    {
        return true;
    }
}
