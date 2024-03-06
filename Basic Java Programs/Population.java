class Population
{
	public static void main(String[] args)
	{
		long currentPopulation = 312032486;
		long secondYear  = 365*24*60*60;
		long birthYear = secondYear/7;
		long deathYear = secondYear / 13;
		long immigrantYear = secondYear / 45;
		long newPopulation = currentPopulation + ((birthYear - deathYear + immigrantYear) *5);

		System.out.println("Current population is = " + currentPopulation );
		System.out.println("New population is = " + newPopulation);
	}
} 