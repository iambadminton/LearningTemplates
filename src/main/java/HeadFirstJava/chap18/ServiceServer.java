package HeadFirstJava.chap18;

/**
 * Created by a.shipulin on 25.12.17.
 */

import java.rmi.*;

public interface ServiceServer extends Remote {
    Object[] getServiceList() throws RemoteException;

    Service getService(Object serviceKey) throws RemoteException;
}
