package MAIN; // CHANGE THIS PACKAGE NAME TO YOURS PLS


import MAIN.GEOMATH.G2D.CIRCLE;
import MAIN.GEOMATH.G2D.RHS;
import MAIN.GEOMATH.G2D.SQUARE;


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

			public static double RADIUS_FROM_AREA(double AREA)
			{
				double VALUE = Math.sqrt(AREA / PI);
				return VALUE;
			}

			public static double RADIUS_FROM_PERIMETER(double PERIMETER)
			{
				double VALUE = (PERIMETER / (2 * PI));
				return VALUE;
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

				public static double DEGREES(double ARC_LENGTH, double CIRCLE_PERIMETER)
				{
					double VALUE = (ARC_LENGTH / CIRCLE_PERIMETER) * 360;
					return VALUE;
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

			public static double TOTAL_SURF_AREA(double LENGTH)
			{
				double VALUE = SQUARE.AREA(LENGTH) * 6;
				return VALUE;
			}

		}

		public static class RECT_3D
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

		public static class PRISM
		{

			public static double VOLUME(double BASE_AREA, double HEIGHT)
			{
				double VALUE = BASE_AREA * HEIGHT;
				return VALUE;
			}

			public static double TOTAL_SURF_AREA(double BASE_AREA, double PERIMETER, double HEIGHT)
			{
				double VALUEE = SIDE_AREA(PERIMETER, HEIGHT) + (2 * BASE_AREA);
				return VALUEE;
			}

			public static double SIDE_AREA(double PERIMETER, double HEIGHT)
			{
				double VALUE = PERIMETER * HEIGHT;
				return VALUE;
			}

		}

		public static class SQ_PYRAMID
		{

			public static double VOLUME(double BASE_AREA, double HEIGHT)
			{
				double VALUE = BASE_AREA * HEIGHT / 3;
				return VALUE;
			}

			public static double TOTAL_SURF_AREA(double SQ_SIDE_LENGTH, double HEIGHT)
			{
				double VALUE = SQUARE.AREA(SQ_SIDE_LENGTH) + LATERAL_AREA(SQ_SIDE_LENGTH, HEIGHT);
				return VALUE;
			}

			public static double LATERAL_AREA(double SQ_SIDE_LENGTH, double HEIGHT)
			{
				double VALUE = 2 * SQ_SIDE_LENGTH * RHS.PYTH_THM(SQ_SIDE_LENGTH / 2, HEIGHT, null);
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

			public static double TOTAL_SURF_AREA(double R, double HEIGHT)
			{
				double VALUE = CURVED_SURF_AREA(R, HEIGHT) + CIRCLE.AREA(R);
				return VALUE;
			}

		}

		public static class CYLINDER
		{

			public static double VOLUME(double R, double HEIGHT)
			{
				double VALUE = CIRCLE.AREA(R) * HEIGHT;
				return VALUE;
			}

			public static double TOTAL_SURF_AREA(double R, double HEIGHT)
			{
				double VALUE = (2 * CIRCLE.AREA(R)) + CYLINDER.CURVED_SURF_AREA(R, HEIGHT);
				return VALUE;
			}

			public static double CURVED_SURF_AREA(double R, double HEIGHT)
			{
				double VALUE = CIRCLE.PERIMETER(R) * HEIGHT;
				return VALUE;
			}

		}

		public static class SPHERE
		{

			public static double VOLUME(double R)
			{
				double VALUE = (4 * R * R * R * PI) / 3;
				return VALUE;
			}

			public static double AREA(double R)
			{
				double VALUE = 4 * R * R * PI;
				return VALUE;
			}

			public static double RADIUS_FROM_VOLUME(double VOLUME)
			{
				double VALUE = Math.cbrt((VOLUME * 3) / (4 * PI));
				return VALUE;
			}

			public static double RADIUS_FROM_AREA(double AREA)
			{
				double VALUE = Math.sqrt(AREA / (4 * PI));
				return VALUE;
			}

		}

	}

	public static class POWER_RATIO
	{

		public static double SCALE_FOR_UNKNOWN(int LHS_POWER, double LEFT_Y, int RHS_POWER, double RIGHT_X,
				double RIGHT_Y)
		{

			double VALUE = 0;

			VALUE = (Math.pow(RIGHT_X, RHS_POWER) * LEFT_Y) / Math.pow(RIGHT_Y, RHS_POWER);
			VALUE = ROOT_N(VALUE, LHS_POWER);

			return VALUE;
		}

	}


	public static double ROOT_N(double BASE, int N)
	{
		double VALUE = Math.pow(BASE, (1.0 / N));
		return VALUE;
	}

}