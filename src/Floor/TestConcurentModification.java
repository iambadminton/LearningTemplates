package Floor;

import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by a.shipulin on 31.05.17.
 */
public class TestConcurentModification {
    @Test(expected = ConcurrentModificationException.class)
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext())
        {
           //map.remove(item.getKey());
            it.remove();
        }
    }
}
