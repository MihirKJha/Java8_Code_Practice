package mj.programs.java8_Practice;

public class ObjectClassExmple {
  
	public static void main(String[] args) throws Exception {
		Object o;
		o= new Inner().new Private();
		((mj.programs.java8_Practice.ObjectClassExmple.Inner.Private) o).powerof2(8);
	}
	
	static class Inner{
		private class Private{
			private void powerof2(int num){
				String var= ((num&num-1)==0)?"power of 2":"not a power of 2";
				System.out.println(var);
			}
		}
	}
}
