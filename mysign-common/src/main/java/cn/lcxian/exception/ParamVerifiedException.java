package cn.lcxian.exception;

public class ParamVerifiedException extends RuntimeException{
	private static final long serialVersionUID = 8925027270133834544L;

	public ParamVerifiedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParamVerifiedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ParamVerifiedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ParamVerifiedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ParamVerifiedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
