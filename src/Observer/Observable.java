package Observer;

/**
 * Created by Hillel9 on 28.08.2017.
 */
public interface Observable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
