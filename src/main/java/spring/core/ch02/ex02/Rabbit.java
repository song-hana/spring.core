package spring.core.ch02.ex02;

public class Rabbit {
	public Result sleep() {
		try {
			Thread.sleep((long)(Math.random() * 1000));
		} catch(Exception e) {}
		
		Result result = new Result();
		result.setResult("zzz");
		
		return result;
	}
}
