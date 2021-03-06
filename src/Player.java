import java.util.ArrayList;

public class Player {
	
	private ArrayList<Treasure> inventory;
	private int xcoord;
	private int ycoord; 
	
	public Player(int xcoord, int ycoord) {
		this.xcoord = xcoord;
		this.ycoord = ycoord;
		
		inventory = new ArrayList<Treasure>();
				
		
	}
	
	public int getPlayerXCoord() {
		return xcoord;
	}
	
	public int getPlayerYCoord() {
		return ycoord;
	}
	
	
	public void pickUp(Treasure item) {
		inventory.add(item);
	}
	
	public Treasure[] getInventory() {
		Treasure[] tr = new Treasure[inventory.size()];
		for(int i = 0; i < inventory.size(); i++) {
			tr[i] = inventory.get(i);
		}
		return tr;
	}
	
	public String printInventory() {
		String msg= "Your inventory contains: ";
		for(int i = 0; i < inventory.size(); i++ ) {
			msg += inventory.get(i).getName() + ", ";
		}
		return msg.substring(0, msg.length()-2);
	}
	
	
	public void movePlayer(int xcoord, int ycoord) {
		this.xcoord = xcoord;
		this.ycoord = ycoord;
		
	}
	

}
