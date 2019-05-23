package cn.lcxian.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseResult implements Serializable {
	private static final long serialVersionUID = 6984970419755151203L;
	private Integer status;
	private String message;
	private Object result;

	public static ResponseResult success(Object obj) {
		return new ResponseResult(200, "ok", obj);
	}

	public static ResponseResult success() {
		return new ResponseResult(200,"ok", null);
	}

	public static ResponseResult failure() {
		return new ResponseResult(201,"fail", null);
	}

	public static ResponseResult failure(String message) {
		return new ResponseResult(201,message, null);
	}

	public static ResponseResult failure(String message,Object obj) {
		return new ResponseResult(201,message, obj);
	}
}
