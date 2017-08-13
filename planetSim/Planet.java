public class Planet {
	public double x;
	public double y;
	public double xVelocity;
	public double yVelocity;
	public double mass;
	public String img;
	
	public Planet(double inputX, double inputY, double inputXVelocity, double inputYVelocity, double inputMass, String inputImg)
	{
		x = inputX;
		y = inputY;
		xVelocity = inputXVelocity;
		yVelocity = inputYVelocity;
		mass = inputMass;
		img = inputImg;
	}
	
	public double calcDistance(Planet planet)
	{
		double dist = Math.sqrt((x-planet.x)*(x-planet.x)+(y-planet.y)*(y-planet.y));
		return dist;
	}
	
	public double calcPairwiseForce(Planet planet)
	{
		double G = 6.67e-11;
		double F = G*mass*planet.mass/(calcDistance(planet)*calcDistance(planet));
		return F;
	}
	
	public double calcPairwiseForceX(Planet planet)
	{
		double F = calcPairwiseForce(planet)*(planet.x-x)/calcDistance(planet);
		return F;
	}
	
	public double calcPairwiseForceY(Planet planet)
	{
		double F = calcPairwiseForce(planet)*(planet.y-y)/calcDistance(planet);
		return F;
	}
	
	public void draw()
	{
		StdDraw.picture(x, y, img);
	}
	
	public void update(double dt)
	{
		ax = calcPairwiseForceX / mass;
		ay = calcPairwiseForceY / mass;
		xVelocity = xVelocity + dt * ax;
		yVelocity = yVelocity + dt + ay;
		x = x + dt * xVelocity;
		y = y + dt * yVelocity;
	}
}
