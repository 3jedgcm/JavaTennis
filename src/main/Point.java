public enum Point {

    LOVE ("0"),

    FIFTEEN ("15"),

    THIRTY ("30"),

    FORTY ("40"),

    ADVANTAGE("A");

    private String name = "";


    Point(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }



}
