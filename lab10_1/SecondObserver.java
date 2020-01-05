package lab10_1;
public class SecondObserver implements Observer {

	@Override
	public void update(String oldValue, String newValue) {
		// TODO Auto-generated method stub
		System.out.println("Second observer,old value =  " + oldValue + " ,new value = " +newValue);
	}

}
