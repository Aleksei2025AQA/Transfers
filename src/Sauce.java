public class Sauce {
    private String name;
    private Spiciness spiciness;

    public enum Spiciness {
        VERY_SPICY("очень острый"),
        SPICY("острый"),
        NOT_SPICY("не острый");

        private String description;

        Spiciness(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    public String getName() {
        return name;
    }

    public Spiciness getSpiciness() {
        return spiciness;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness.getDescription();
    }
}
