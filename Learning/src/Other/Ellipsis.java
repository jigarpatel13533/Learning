package Other;
public class Ellipsis {
	
	public static void main(String[] args) {
		PrintWithEllipsis(11,22,55,33,22,11,11,11);	
	}
	public static void PrintWithEllipsis(int...strs) {
		System.out.println("Length of args :"+strs.length);
	    for (int s : strs)
	        System.out.println(s);
	}
}