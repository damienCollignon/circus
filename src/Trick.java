public class Trick {
    private String name;
    private TrickType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrickType getType() {
        return type;
    }

    public void setType(TrickType type) {
        this.type = type;
    }

    public Trick(String name, TrickType type) {
        this.name = name;
        this.type = type;
    }

    public enum TrickType {
        MUSIC,
        STUNT
    }
}


