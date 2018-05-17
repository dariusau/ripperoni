package rip.ripperoni;

public class Calculator {

	MyDatabase _databaseMock;
	
    public Calculator(MyDatabase databaseMock) {
		// TODO Auto-generated constructor stub
    	_databaseMock = databaseMock;
	}

	public int getSum(int a, int b){
    	return a + b;
    }


	public boolean sendQuery(String string) {
		// TODO Auto-generated method stub
		_databaseMock.query(string);
		return true;
	}

}
