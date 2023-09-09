import java.util.*;

public class Aoc{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        float AoC=3.14f*radius*radius;
        System.out.println(AoC);
        sc.close();
	}
}