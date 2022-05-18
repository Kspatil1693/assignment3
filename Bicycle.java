package package3;

 class Bicycle {
	 public int gear;
	 public int speed;
	public Bicycle(int gear, int speed)
	{
		super();
		this.gear = gear;
		this.speed = speed;
	}
	public void applyBreak(int decrement)
	{
		speed-=decrement;
	}
	public void speedUp(int increment)
	{
		speed+=increment;
	}
	public String toString()
	{
		return ("No of gears are"+gear+"\n"+"speed of bicycle is"+speed);
	}

}
class MountainBike extends Bicycle
{
	public int seatHeight;
	public  MountainBike(int gear,int speed,int startHeight)
	{
		super(gear,speed);
		seatHeight=startHeight;
	}
	public void setHeight(int newValue)
	{
		seatHeight=newValue;
	}
	}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 