package Tests;
import com.company.toPostfix;
import org.junit.Test;

public class toPostfixTest {
    toPostfix postfix=new toPostfix();

    @Test
    public void isOperator() {
    }

    @Test
    public void checkPrecedence() {
    }

    @Test
    public void convert() {
        String test="A+B*C+D";
        String actual=postfix.convert(test);
        String expected="ABC*+D+";
    }
}