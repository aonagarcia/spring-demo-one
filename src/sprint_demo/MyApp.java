package sprint_demo;

public class MyApp {

	public static void main(String[] args) {
		//creando el objeto
		Coach theCoach = new BaseballCoach();
		
		//usando el objeto
		System.out.println(theCoach.getDailyWorkout());
		
	}

}
