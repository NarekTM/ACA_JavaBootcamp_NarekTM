package Homework_20220426.builder;

public enum Genre {
    FANTASY(1, "Fantasy"),
    ADVENTURE(2, "Adventure"),
    ROMANCE(3, "Romance"),
    CONTEMPORARY(4, "Contemporary"),
    DYSTOPIAN(5, "Dystopian"),
    MYSTERY(6, "Mystery"),
    HORROR(7, "Horror"),
    THRILLER(8, "Thriller"),
    PARANORMAL(9, "Paranormal"),
    HISTORICAL_FICTION(10, "Historical Fiction"),
    SCIENCE_FICTION(11, "Science Fiction"),
    CHILDREN(12, "Children"),
    MEMOIR(13, "Memoir"),
    COOKING(14, "Cooking"),
    ART(15, "Art"),
    SELF_HELP(16, "Self Help"),
    DEVELOPMENT(17, "Development"),
    MOTIVATIONAL(18, "Motivational"),
    HEALTH(19, "Health"),
    HISTORY(20, "History"),
    TRAVEL(21, "Travel"),
    GUIDE(22, "Guide"),
    FAMILIES_AND_RELATIONSHIPS(23, "Families And Relationships"),
    HUMOR(24, "Humor");

    private final int id;
    private final String type;

    private Genre(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return this.type;
    }

    public static Genre findById(int id) {
        for (Genre type : values()) {
            if (type.id == id) {
                return type;
            }
        }
        return null;
    }
}
