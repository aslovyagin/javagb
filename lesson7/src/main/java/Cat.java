package main.java;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;

    private Cat() {
    }

    public static class Builder {
        private Cat newCat;

        public Builder() {
            newCat = new Cat();
        }

        public Builder withName(String name) {
            newCat.name = name;
            return this;
        }

        public Builder withApetite(int apetite) {
            newCat.appetite = apetite;
            return this;
        }

        public Cat build() {
            return newCat;
        }
    }


    public void eat(Plate p) {
        if (p.isEnough(appetite)) {
            p.decreaseFood(appetite);
            satiety = true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
