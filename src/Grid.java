
public class Grid {
	
	private String map[][];
	
	public Grid() {
		map = new String[10][10];
		
	}
	
	public void populateMap() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				map[i][j] = "You are in an open field";
			}
		}
		
		for(int i = 0; i < 10; i++) {
			map[0][i] = "You see a fence to the west.";
			map[9][i] = "You see a fence to the east.";
			map[i][0] = "You see a fence to the north.";
			map[i][9] = "You see a fence to the south.";
		}
		
		map[0][0] = "You see a fence to the north and west.";
		map[0][9] = "You see a fence to the south and west.";
		map[9][0] = "You see a fence to the north and east.";
		map[9][9] = "You see a fence to the south and east.";
		
		
		
		
		
	}
	
	public String getMapDescription(int xcoord, int ycoord){
		return map[xcoord][ycoord];
	}
	
	
	public void printGrid(int x, int y) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(x == j && y == i) {
					System.out.print('P');
				}
				else {
					System.out.print('0');
				}
			}
			System.out.println();
		}
		
	}
	
	
	

}
