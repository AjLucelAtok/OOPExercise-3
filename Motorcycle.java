class Motorcycle
{
	private String color;
	private Engine engine;
	private Killswitch killswitch;

	public Motorcycle(String color){
		this.color = color;
		engine = new Engine();
		killswitch = new Killswitch();
	}
	public void setColor(String color){
		this.color = color;
	}
	public String start(){
		return engine.startEngine();
	}
	
}
