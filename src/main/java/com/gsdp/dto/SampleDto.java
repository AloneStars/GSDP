package com.gsdp.dto;

/**
 * 这个类主要干的事情就是封装我们service层传到controller层的数据。
 * 因为service层传到controller层的数据有可能不仅仅就只是我们entity
 * 里面的一个bean，比如我们在封装一个json的时候，我们一般的做法都有三个
 * 属性值。success,data,info;向这些东西我们就可以封装为一个dto
 * @author yizijun
 *
 */
public class SampleDto {

	public SampleDto() {
		// TODO 自动生成的构造函数存根
	}

}
