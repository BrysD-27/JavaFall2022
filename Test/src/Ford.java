public class Ford implements Vehicle
{
	
	
	double spd = 12.5;
	String errCode = "exception x0312";
	
	public Ford() {}
	
	public Ford(double spd, String errCode) {
		this.spd = spd;
		this.errCode = errCode;
		
	}

	public double getSpd() {
		return spd;
	}

	public void setSpd(double spd) {
		this.spd = spd;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	@Override
	public String toString() {
		return "Ford [spd=" + spd + ", errCode=" + errCode + "]";
	}
	
	@Override
	public String printErr() {
		
		return errCode;
	}

	@Override
	public double accel() {
		
		return this.spd += 1.27;
	}

	@Override
	public double brk() {
		return this.spd -= 1.14;
	}
}