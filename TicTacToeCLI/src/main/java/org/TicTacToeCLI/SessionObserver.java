package org.TicTacToeCLI;

import java.net.HttpURLConnection;
import java.util.Map;

public interface SessionObserver {
    public String getUpdate(HttpURLConnection connection) throws Exception;
    public String postUpdate(HttpURLConnection connection, Map<String, Object> parameters) throws Exception;
}
