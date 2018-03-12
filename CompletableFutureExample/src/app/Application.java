package app;

import java.io.IOException;
import java.net.URL;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Application {

    public static void main(String[] arga){

    }

    private String downloadSite(final String site) {
        try {
            //log.debug("Downloading {}", site);
            final String res = IOUtils.toString(new URL("http://" + site), UTF_8);
            //log.debug("Done {}", site);
            return res;
        } catch (IOException e) {

        }
    }

}
