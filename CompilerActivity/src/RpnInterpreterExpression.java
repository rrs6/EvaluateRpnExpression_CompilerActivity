import java.io.*;
import java.util.Scanner;
import java.util.Stack;
public class RpnInterpreterExpression {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./inputs/Calc1.stk");
	    Scanner sc = new Scanner(file);
	    Stack auxiliarStack = new Stack();
	    //Como foi explicado na aula, a ideia é fazer uma leitura das expressões RPN, da seguinte forma:
	    /*
	     * Leio a linha atual, caso seja um número, eu empilho.
	     * Caso contrário, preciso realizar uma operação, no caso abaixo, as operações são: Multiplicação, Divisão, Soma e Subtração. Logo após realizar a operação
	     * Empilho novamente o resultado. Ao final da expressão, irá restar somente o resultado final da minha expressão.
	     * */
	    while (sc.hasNextLine()) {
	    	String s = sc.nextLine();
	    	if(s.equals("+")){
	    		int num1 = (int) auxiliarStack.pop();
	    		int num2 = (int) auxiliarStack.pop();
	    		auxiliarStack.push(num1+num2);
	    	}else if(s.equals("-")){
	    		int num1 = (int) auxiliarStack.pop();
	    		int num2 = (int) auxiliarStack.pop();
	    		auxiliarStack.push(num2-num1);
	    	}else if(s.equals("*")){
	    		int num1 = (int) auxiliarStack.pop();
	    		int num2 = (int) auxiliarStack.pop();
	    		auxiliarStack.push(num1*num2);
	    	}else if(s.equals("/")){
	    		int num1 = (int) auxiliarStack.pop();
	    		int num2 = (int) auxiliarStack.pop();
	    		auxiliarStack.push(num2/num1);
	    	}else{
	    		int num = Integer.parseInt(s);
	    		auxiliarStack.push(num);
	    	}
	    }
	    System.out.println((int)auxiliarStack.pop());
	}

}
