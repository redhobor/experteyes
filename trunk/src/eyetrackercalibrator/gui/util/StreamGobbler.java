/*
 *  Obtained from http://www.javaworld.com/javaworld/jw-12-2000/jw-1229-traps.html?page=4 JavaWorld.com, 12/29/00
 */
package eyetrackercalibrator.gui.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * This class help consume the input stream when executing command.
 * 
 * @author  Michael C. Daconta
 */
public class StreamGobbler extends Thread {

    InputStream is;
    String type;

    public StreamGobbler(InputStream is, String type) {
        this.is = is;
        this.type = type;
    }

    @Override
    public void run() {
        try {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(type + ">" + line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

