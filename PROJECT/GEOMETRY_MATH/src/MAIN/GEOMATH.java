package MAIN; // CHANGE THIS PACKAGE NAME TO YOURS PLS

import MAIN.GEOMATH.G2D.CIRCLE;
import MAIN.GEOMATH.G2D.RHS;

public class GEOMATH
{

	public static final double PI = Math.PI;


	public class G2D
	{
		public static class SQUARE
		{

			public static double AREA(double LENGTH)
			{
				double VALUE = LENGTH * LENGTH;
				return VALUE;
			}

			public static double SIDE(double AREA)
			{
				double VALUE = Math.sqrt(AREA);
				return VALUE;
			}

		}

		public static class CIRCLE
		{

			public static double AREA(double R)
			{
				double AREA = PI * (R * R);
				return AREA;
			}

			public static double PERIMETER(double R)
			{
				double PERIMETER = 2 * PI * R;
				return PERIMETER;
			}

			public static class ARC
			{
				public static double LENGTH(double R, double DEGREES)
				{
					double LENGTH = G2D.CIRCLE.PERIMETER(R) * (DEGREES / 360);
					return LENGTH;
				}

				public static double AREA(double R, double DEGREES)
				{
					double LENGTH = CIRCLE.AREA(R) * (DEGREES / 360);
					return LENGTH;
				}
			}

		}

		public static class RHS
		{

			public static double PYTH_THM(Double S1, Double S2, Double HYP)
			{
				double VALUE = 0;

				if (S1 == null)
				{
					VALUE = ((HYP * HYP) - (S2 * S2));
				} else if (S2 == null)
				{
					VALUE = ((HYP * HYP) - (S1 * S1));
				} else if (HYP == null)
				{
					VALUE = ((S1 * S1) + (S2 * S2));
				}

				VALUE = Math.sqrt(VALUE);

				return VALUE;
			}

		}

		public static class TRIANGLE
		{

			public static double AREA(double WIDTH, double HEIGHT)
			{
				double VALUE = WIDTH * HEIGHT / 2;
				return VALUE;
			}

			public static double ALTITUDE(double SIDE, double AREA)
			{
				double VALUE = (2 * AREA) / SIDE;
				return VALUE;
			}

		}

	}

	public class G3D
	{

		public static class CUBE
		{
			public static double VOLUME(double LENGTH)
			{
				double VALUE = LENGTH * LENGTH * LENGTH;
				return VALUE;
			}

			public static double SIDE_AREA(double LENGTH)
			{
				double VALUE = LENGTH * LENGTH;
				return VALUE;
			}

			public static double TOTAL_SURF_AREA(double LENGTH)
			{
				double VALUE = SIDE_AREA(LENGTH) * 6;
				return VALUE;
			}

		}

		public static class RECT
		{

			public static double VOLUME(double LENGTH, double WIDTH, double HEIGHT)
			{
				double VALUE = LENGTH * WIDTH * HEIGHT;
				return VALUE;
			}

			public static double TOTAL_SURF_AREA(double LENGTH, double WIDTH, double HEIGHT)
			{
				double VALUE = 2 * (((LENGTH + WIDTH) * HEIGHT) + (LENGTH * WIDTH));
				return VALUE;
			}

		}

		public static class PIRAMID
		{

			public static double VOLUME(double BASE_AREA, double HEIGHT)
			{
				double VALUE = BASE_AREA * HEIGHT / 3;
				return VALUE;
			}

		}

		public static class CONE
		{

			public static double VOLUME(double R, double HEIGHT)
			{
				double VALUE = ((PI * R * R) * HEIGHT) / 3;
				return VALUE;
			}

			public static double CURVED_SURF_AREA(double R, double HEIGHT)
			{
				double VALUE = PI * R * RHS.PYTH_THM(R, HEIGHT, null);
				return VALUE;
			}

			public static double TOTAL_SRUF_AREA(double R, double HEIGHT)
			{
				double VALUE = CURVED_SURF_AREA(R, HEIGHT) + CIRCLE.AREA(R);
				return VALUE;
			}

		}

	}


	public static Object IN_PI(boolean STRING, double INPUT)
	{
		Object VALUE = INPUT / PI;

		if (STRING)
		{
			VALUE = String.valueOf(VALUE) + " PI";
		}

		return VALUE;
	}

}