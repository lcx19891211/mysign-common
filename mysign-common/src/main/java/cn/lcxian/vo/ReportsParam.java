package cn.lcxian.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class ReportsParam implements Serializable {
	private static final long serialVersionUID = -6449502130272191700L;
	private String orderNo;
}
