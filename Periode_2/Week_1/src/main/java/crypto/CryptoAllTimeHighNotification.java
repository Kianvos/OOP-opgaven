package crypto;

public class CryptoAllTimeHighNotification implements Observer {

    private String code; // afkorting van de munt
    private double highestPrice;

    public CryptoAllTimeHighNotification(String code){
        this.code = code;
        this.highestPrice = 0;
    }

    @Override
    public void update(Market market) {
        double coinPrice = market.getCoinPrice(code);
        if (coinPrice > highestPrice) {
            highestPrice = coinPrice;
            System.out.println("Alltime high!! BTC Bitcoin €" + highestPrice);
        }
    }
}
