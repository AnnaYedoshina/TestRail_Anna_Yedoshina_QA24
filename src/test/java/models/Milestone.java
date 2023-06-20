package models;

public class Milestone {
    private final String name;
    private final String references;
    private final String description;

    private Milestone(MilestoneBuilder milestoneBuilder) {
        this.name = milestoneBuilder.name;
        this.references = milestoneBuilder.references;
        this.description = milestoneBuilder.description;
    }

    public String getName() {
        return name;
    }

    public String getReferences() {
        return references;
    }

    public String getDescription() {
        return description;
    }


    public static class MilestoneBuilder {
        private final String name;
        private String references;
        private String description;

        public MilestoneBuilder(String name){
            this.name = name;
        }

        public Milestone build(){
            return new Milestone(this);
        }

        public MilestoneBuilder setReferences(String references) {
            this.references = references;
            return this;
        }

        public MilestoneBuilder setDescription(String description) {
            this.description = description;
            return this;
        }



    }

}
