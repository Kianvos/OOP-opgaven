package crypto;

import java.util.*;

public class Market implements Runnable, Subject {

    private boolean stop;
    private List<Coin> coins;
    private Random random = new Random();
    private List<Observer> observers = new ArrayList<>();

    public Market() {
        stop = false;
        coins = Collections.synchronizedList(new ArrayList<>());
        new Thread(this).start();
    }

    /*
    Coins toevoegen en verwijderen
     */

    public void addCoin(Coin coin) {
        coins.add(coin);
    }

    public void removeCoin(Coin coin) {
        coins.remove(coin);
    }

    /*
     Gegevens van aanwezige coins opvragen
     */
    public int getNumberOfCoins() {
        return coins.size();
    }

    public String getCoinName(int i) {
        return coins.get(i).getName();
    }

    public double getCoinPrice(int i) {
        return coins.get(i).getPrice();
    }

    public String getCoinName(String code){
        Coin coin = findCoinByCode(code);
        return coin.getName();
    }

    public double getCoinPrice(String code){
        Coin coin = findCoinByCode(code);
        return coin.getPrice();
    }

    private Coin findCoinByCode(String code){
        for (Coin coin : coins){
            if (Objects.equals(coin.getCode(), code)){
                return coin;
            }
        }
        return null;
    }

    /*
    Methodes om de prijs van de coins te laten fluctueren
     */

    private void fluctuate() {
        double norm = 0.05 - random.nextDouble() * 0.10;
        for (Coin coin : coins) {
            coin.fluctuate(norm);
        }
        notifyObservers();
    }

    public void stop() {
        stop = true;
    }

    @Override
    public void run() {
        while (!stop) {
            fluctuate();
            try {
                Thread.sleep(300 + random.nextInt(1700));
            } catch (InterruptedException e) {
                e.printStackTrace();
                stop();
            }
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}