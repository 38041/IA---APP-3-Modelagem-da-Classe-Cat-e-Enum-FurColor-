package enums;

public enum TrainingLevel {

    BASIC(1, "Basic"),
    INTERMEDIATE(2, "Intermediate"),
    ADVANCED(3, "Advanced");

    private final int code;
    private final String displayName;

    TrainingLevel(int code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public int getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static TrainingLevel fromCode(int code) {
        for (TrainingLevel level : TrainingLevel.values()) {
            if (level.code == code) {
                return level;
            }
        }
        throw new IllegalArgumentException("Invalid TrainingLevel code: " + code);
    }
}