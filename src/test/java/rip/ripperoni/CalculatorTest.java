package rip.ripperoni;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class CalculatorTest  {

    @Mock
    MyDatabase databaseMock; 

    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule(); 

    @Test
    public void testQuery()  {
                  
        //Given
    	Calculator t  = new Calculator(databaseMock); 
        
        //When
        boolean goodConnection = t.sendQuery("* from t");
        
        //Then
        assertTrue(goodConnection); 
        verify(databaseMock).query("* from t");
    }
}
