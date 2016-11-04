package stateModel;
/**
 * 糖果状态机
 * 将有限状态机转换为代码
 * 设计技巧：如何对对象内的状态建模，通过创建一个实例变量来持有状态值，并在方法内书写条件代码来处理不同状态。
 * */
public class GumballMachine {
	//将状态机的状态设置为实例变量
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	int state = NO_QUARTER;
	int count = 0;
	//当有25分钱投入时
	public void insertQuarter(){
          return null;
        }
	//退出25分钱
	public void ejectQuarte() {

        make a change and quick; 
        return null;        
}
	//转动曲轴
	public void turnCrank(){}
	//方法糖果
	public void dispense(){}
	
}
