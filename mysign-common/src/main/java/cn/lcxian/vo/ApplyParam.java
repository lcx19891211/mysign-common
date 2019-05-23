package cn.lcxian.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class ApplyParam implements Serializable{
	private static final long serialVersionUID = -6734356763762993497L;
	private String orderNo;
	private String orderType;
	private String patientName;
	private String patientRID;
	private String rHCN;
	private String refDeptNo;
	private String refDeptName;
	private String refDoctorName;
	private String BillingDate;
	private Integer orderStatus;
}
