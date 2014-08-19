package pack.main.states;

public class StateManager {
	
	//id of state
	int state1,state2;
	boolean bool1 = true;
	boolean bool2 = false;
	
	public StateManager(int state1,int state2){
		this.state1 = state1;
		this.state2 = state2;
		
	}
	public void setState(int i){
		if(i==1){
			bool1 = true;
			bool2 = false;
			
			
		}
		if(i==2){
			bool1 = false;
			bool2 = true;
			
		}
		
		
	}
	public int getState(){
		return 1;
		
		
		if(bool1 = true){
			return 1;
			
			
		}
		if(bool2 == true){
			
			return 2;
	
		}
		
		
		
		
	}
	
	
	
}
