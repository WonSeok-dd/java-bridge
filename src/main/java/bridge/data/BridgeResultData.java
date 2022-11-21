package bridge.data;

import bridge.domain.Moving;

import java.util.ArrayList;
import java.util.List;

public class BridgeResultData {
    private static final List<String> bridgeUpResults = new ArrayList<>();
    private static final List<String> bridgeDownResults = new ArrayList<>();

    public static void add(String bridgeUpResult, String bridgeDownResult){
        bridgeUpResults.add(bridgeUpResult);
        bridgeDownResults.add(bridgeDownResult);
    }

    public static List<String> getBridgeUpResults() {
        return bridgeUpResults;
    }

    public static List<String> getBridgeDownResults() {
        return bridgeDownResults;
    }

    public static void reset() {
        bridgeUpResults.clear();
        bridgeDownResults.clear();
    }
}