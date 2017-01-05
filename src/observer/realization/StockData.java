package observer.realization;

import java.util.ArrayList;

public class StockData implements Observable{

	private ArrayList<Observer> observers;
	private int price; // 주가
	private int volume; //거래량
	
	public StockData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this);
		}
	}
	
	public void setValue(int price, int volume) {
		this.price = price;
		this.volume = volume;
		stockInfoChanged();
	}

	private void stockInfoChanged() {
		notifyObservers();
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	

}
