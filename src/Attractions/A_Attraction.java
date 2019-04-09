package Attractions;

public abstract class A_Attraction implements I_Attraction {

    private int minAge;
    private int maxAge;
    private Double minLength;
    private boolean isForPregnant;
    private boolean isForDisabled;

    public A_Attraction(int minAge, int maxAge, Double minLength, boolean isForPregnant, boolean isForDisabled){
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.minLength = minLength;
        this.isForPregnant = isForPregnant;
        this.isForDisabled = isForDisabled;
    }

    @Override
    public int getMinAge() {
        return this.minAge;
    }

    @Override
    public int getMaxAge() {
        return this.maxAge;
    }

    @Override
    public Double getMinLength() {
        return this.minLength;
    }

    @Override
    public boolean isForPregnant() {
        return this.isForPregnant;
    }

    @Override
    public boolean isForDisabled() {
        return isForDisabled;
    }
}
