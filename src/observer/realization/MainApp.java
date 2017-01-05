package observer.realization;

public class MainApp {

	static StockData stockData;
	static CurrentStockDisplay currentDisplay;
	
	public static void MainApp() {
		stockData = new StockData();
		currentDisplay = new CurrentStockDisplay(stockData);
	}
	
	public static void changeValue(int price, int volume) {
		stockData.setValue(price, volume);
	}
	
	public static void main(String[] args) {
		MainApp();
		
		System.out.println("-------주가 변화 감지---------");
		changeValue(135000, 250000);
		
		System.out.println("---------------------------");
		
		System.out.println("-------주가 변화 감지---------");
		changeValue(141000, 310000);
	}

	
	
}
