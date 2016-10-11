package com.gsdp.enums;

/**
 * 这是他们给的建议，如果我们要很多的状态这种属性，我们可以把它存储为枚举类型，
 * 毕竟它除了不能继承，我们可以把它当成类来使用。
 * @author yizijun
 *
 */
public enum SampleEnum {
	
	SUCCESS(1,"秒杀成功"),
	END(0,"秒杀结束"),
	REPEAT(-1,"重复秒杀"),
	INNER_ERROR(-2,"系统异常"),
	DATA_REWRITE(-3,"数据篡改");
	
	private int state;
	
	private String stateInfo;

	private SampleEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}
	
	public static SampleEnum stateOf(int index) {
		for(SampleEnum state : values()) {
			if(state.getState() == index) {
				return state;
			}
		}
		return null;
	}

}
