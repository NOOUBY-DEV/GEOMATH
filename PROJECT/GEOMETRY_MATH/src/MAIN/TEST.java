package MAIN;

import java.util.ArrayList;
import java.util.List;

import MAIN.GEOMATH.G2D.CIRCLE;
import MAIN.GEOMATH.G2D.RHS;
import MAIN.GEOMATH.G3D.CONE;
import MAIN.GEOMATH.G3D.CUBE;

public class TEST
{
	public static List<Object> ANS = new ArrayList<>();


	public static void main(String[] args)
	{
		ANS.add(CIRCLE.AREA(9.0));
		ANS.add(CIRCLE.PERIMETER(9.0));
		ANS.add(CIRCLE.ARC.LENGTH(9.0, 90.0));
		ANS.add(RHS.PYTH_THM(3.0, 4.0, null));
		ANS.add(CUBE.TOTAL_SURF_AREA(9));
		ANS.add(GEOMATH.IN_PI(false, CONE.VOLUME(9, 27)));
		// TODO : TEST ALL CLASSES ;

		ANS.forEach(System.out::println);

	}

	public static void println(Object X)
	{
		System.out.println(X);
	}
}