
public class Ordered {
	public boolean order(int x, int y, int z) {
		boolean isOrdered = false;
		if (x < y) {
			if (x < z) {
			  if (y < z) {
				  isOrdered = true;
				}
			}
		}
		if (z > y) {
		  if (z > x) {
		    if (y > x) {
		    isOrdered = true;
		    }
		  }
		}
		// System.out.println(isOrdered);
		return isOrdered;
	}
	public static void main(String[]args) {
		Ordered test1 = new Ordered();
		int x = 0;
		int y = 5;
		int z = 7;
		test1.order(x, y, z);
	}
}
