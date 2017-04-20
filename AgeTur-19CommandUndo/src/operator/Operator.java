package operator;

import java.util.Stack;

import command.Command;

public class Operator {

	Stack<Command> stivaComenzi=new Stack<>();
	
	public void invoca(Command comanda){
		comanda.executa();
		stivaComenzi.push(comanda);
	}
	
	public void undo(){
		if(!stivaComenzi.isEmpty()){
			stivaComenzi.pop().unexecute();
		}
	}
}
