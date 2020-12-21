package mmu.edu.recyclerview;

public class Version {
    private String name;
    private String description;
    private int icon;

    public Version(String name, String description, int icon) {
        this.name = name;
        this.description = description;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getIcon() {
        return icon;
    }
}
