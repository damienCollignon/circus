public class Viewer {
    public Viewer() {
        System.out.println("Spectateur s'installe...");
    }

    public void watch(Trick trick, String monkeyName) {
        var actionLabel = switch (trick.getType()) {
            case MUSIC -> "siffle";
            case STUNT -> "applaudit";
        };
        System.out.println("Spectateur " + actionLabel + " pendant que le singe " + monkeyName + " " + trick.getName());
    }
}
