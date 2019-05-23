package cn.lcxian.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import cn.lcxian.vo.ResponseResult;

/**
 * 返回错误处理
 * @author xzero
 *
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * 处理检查信息错误
	 * @param e
	 * @return
	 */
	@ExceptionHandler(ParamVerifiedException.class)
	public ResponseResult doHandleParamVerifiedException(ParamVerifiedException e) {
		e.printStackTrace();
		return ResponseResult.failure(e.getMessage(),e);
	}
	
	/**
	 * 处理其他错误信息
	 * @param e
	 * @return
	 */
	@ExceptionHandler(RuntimeException.class)
	public ResponseResult doHandleException(RuntimeException e) {
		e.printStackTrace();
		return ResponseResult.failure(e.getMessage());
	}
}
