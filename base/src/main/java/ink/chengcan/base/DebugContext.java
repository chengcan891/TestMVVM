package ink.chengcan.base;

public class DebugContext {

    private static boolean isDebug;

    static void setDebug(boolean isDebug) {
        DebugContext.isDebug = isDebug;
    }

    public static boolean isDebug() {
        return isDebug;
    }
}
