# DesignPattern
모두가 처음엔 초보이나 모두가 고수가 되진 않듯이..화이팅  
  
# 옵저버 패턴 - api를 사용하거나 혹은 만들어 쓰거나  
어떤 클래스에 변화가 일어났을 때, 다른 클래스에 통보해 주는 패턴  
  
- 통보 해주는 놈 => observable (observable 클래스를 상속)  
 * setChanged() => 옵저버에 전달할 새로운 데이터가 있다고 알린다.  
 * notifyObservers() => 등록된 옵저버에 데이터를 전달한다.  
 * addObserver(Observer o) => 옵저버 등록.  
  
- 통보 받는 놈 => observer (observer 인터페이스 구현)  
 * update(Observable o , Object arg) => Observable에게 전달받은 새로운 데이터를 갱신한다.  
 * Observable 클래스에서 notifyObservers() 함수를 통해 등록된 Observer에 데이터를 전달할 때, Observer 의
  update(Observable o, Object arg) 함수를 호출한다.
  
 => observable이 class이기 때문에 이미 다른 클래스를 상속한 자식 클래스의 경우 observable을 상속 받을 수 없다.  
  또한, setchanged() 함수가 protected로 선언되어 있어 Observable의 서브 클래스를 인스턴스 변수로 활용 불가.  

상황에 맞게 api를 사용하거나, 혹은 직접 구현하여 사용  
* 참조: http://hyeonstorage.tistory.com/  

# Flyweight 패턴  
동일한 것을 공유해서 객체 생성을 줄여 메모리 절약하기  

- 있는놈을 요청 => Factory에서 기존에 있던 객체 리턴  
- 없는놈을  => Factory에서 새롭게 객체 생성하여 리턴  

* 참조: http://egloos.zum.com/iilii/v/4066794
 



   

