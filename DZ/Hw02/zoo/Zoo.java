package zoo;

import java.util.ArrayList;
import java.util.List;

import zoo.radio.Sayable;

public class Zoo {

    List<Animal> animalList = new ArrayList<>();
    Sayable radio;

    public Zoo(List<Animal> animals, Sayable sayableObj) {
        this.radio = sayableObj;
        animalList.addAll(animals);

    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void addAnimal(List<Animal> animals) {
        animalList.addAll(animals);
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public List<Sayable> getSayable() {
        List<Sayable> sayableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            sayableList.add(animal);
        }
        sayableList.add(this.radio);
        return sayableList;
    }

    public List<Runable> getRunableList() {
        List<Runable> runableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Runable) {
                runableList.add((Runable) animal);
            }
        }
        return runableList;
    }

    public List<Flyable> getFlyableList() {
        List<Flyable> flyableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Flyable) {
                flyableList.add((Flyable) animal);
            }
        }
        return flyableList;
    }

    public List<Waterfowlble> getWaterflyablesList() {
        List<Waterfowlble> waterfowlbleList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Waterfowlble) {
                waterfowlbleList.add((Waterfowlble) animal);
            }
        }
        return waterfowlbleList;
    }

    public Animal getRunChampion(){
        List<Runable> runners = getRunableList();
        Runable champion = runners.get(0);
        for (Runable r : runners){
            if(champion.getSpeedRun() < r.getSpeedRun()){
                champion = r;
            }
        }
        return (Animal) champion;
    }

    public Animal getFlightChampion(){
        List<Flyable> flyers = getFlyableList();
        Flyable champion = flyers.get(0);
        for (Flyable r : flyers){
            if(champion.getSpeedFlyable() < r.getSpeedFlyable()){
                champion = r;
            }
        }
        return (Animal) champion;
    }

    public Animal getWaterfowlChampion(){
        List<Waterfowlble> fowl = getWaterflyablesList();
        Waterfowlble champion = fowl.get(0);
        for (Waterfowlble r : fowl){
            if(champion.getSpeedWaterfowlble() < r.getSpeedWaterfowlble()){
                champion = r;
            }
        }
        return (Animal) champion;
    }
}



