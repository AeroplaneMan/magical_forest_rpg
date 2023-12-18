public class Location {
    private String name = "";
    private String description = "";

    public Location(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String toString() {
        return name;
    }
    public String getDescription() {
        return "\n--- " + name + " --- \n" + description + "\n";
    }
}

