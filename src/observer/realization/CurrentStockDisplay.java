package observer.realization;

public class CurrentStockDisplay implements Observer, DisplayStockInfo{

	Observable observable;
	private int price;
	private int volume;
	
	public CurrentStockDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("현재 주가: " + price + "원, 현재 거래량: " + volume);
	}

	@Override
	public void update(Observable observable) {
		if (observable instanceof StockData) {
			StockData stockData = (StockData)observable;
			this.price = stockData.getPrice();
			this.volume = stockData.getVolume();
			display();
		}
	}

}
