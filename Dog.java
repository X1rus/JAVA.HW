package Video4HW;

public class Dog {

    enum BreedDog {
        Hasky,
        ChaoChao,
        taksa
    }

    public static void main(String[] args) {
        BreedDog breed = null;
        Dog dog1 = new Dog("Brovko", breed.Hasky, 13);
        Dog dog2 = new Dog("Sharik", breed.ChaoChao, 10);
        Dog dog3 = new Dog("Muhtar", breed.taksa, 5);
        Dog dog4 = new Dog("Muhtar", breed.taksa, 5);
        System.out.println(dog3.equals(dog4));
        IsOldDog(dog1, dog2);
    }


    public Dog(String dogName, BreedDog breedDog, int age) {
        DogName = dogName;
        breed = breedDog;
        this.age = age;
    }

    private String DogName;
    private BreedDog breed;
    private int age;

    public BreedDog getBreed() {
        return breed;
    }

    public void setBreed(BreedDog breed) {
        this.breed = breed;
    }


    public String getDogName() {
        return DogName;
    }

    public void setDogName(String dogName) {
        DogName = dogName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Dog other = (Dog) obj;
        if (DogName != other.DogName) return false;
        if (DogName == null) {
            if (other.DogName != null) return false;
        } else if (!DogName.equals(other.DogName)) return false;
        return true;
    }

    public static void IsOldDog(Dog d1, Dog d2) {
        if (d1.age > d2.age) System.out.println("Name: " + d1.getDogName() + "\tBreed: " + d1.getBreed());
        else System.out.println("Name: " + d2.getDogName() + "\tBreed: " + d2.getBreed());

    }


}
