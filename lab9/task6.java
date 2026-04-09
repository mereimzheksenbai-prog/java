
class Config {
    static String appName;
    static int version;

    static {
        appName = "LabSystem";
        version = 2;
        System.out.println("Config initialized!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("App: " + Config.appName + ", Version: " + Config.version);
    }
}
