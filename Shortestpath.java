
public class Shortestpath {

	public static float shortestPath(String str)
	{
		int x=0,y=0;
		for(int i=0;i<str.length();i++) {
		char dir =str.charAt(i);
		
		if(dir=='E') {
			x++;
		}
		else if(dir=='W') {
			x--;
		}
		else if(dir=='N') {
			y++;
		}
		else {
			y--;
		}
		}
		int x2=x*x;
		int y2=y*y;
		return (float)Math.sqrt(x2+y2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="WNEENESENNESW";
		System.out.println(shortestPath(str)); 
	}

}
