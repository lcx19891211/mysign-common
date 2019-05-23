package cn.lcxian.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 
 * @author xzero
 *检查申请单
 */
@Data
@Accessors(chain=true)
@ToString
public class CheckApply implements Serializable{
	private static final long serialVersionUID = 1L;
	private String systemCode; 
	private String orderNo;
	private String orderType;
	private String studyUID;
	private String orderDetails;
	private String orderItemCode;
	private String orderCopyUrl;
	private String examType;
	private String billingDate;
	private String billingTime;
	private String preferredExamDate;
	private String preferredExamTime;
	private String scheduledDate;
	private String scheduledTime;
	private String scheduledSlotId;
	private String queueGroupId;
	private Integer queueSN;
	private String arrivedDate;
	private String arrivedTime;
	private String studyDate;
	private String studyTime;
	private String patientName;
	private String patientRId;
	private String patientSex;
	private String patientDOB;
	private String rhcn;
	private String patientId;
	private String inpatientNo;
	private String outpatientNo;
	private String bodyCheckupNo;
	private String address;
	private String telephone;
	private String workPlace;
	private String ward;
	private String bedNo;
	private String clinicPathFlag;
	private String refHospitalNo;
	private String refHospitalName;
	private String refDeptNo;
	private String refDeptName;
	private String refDoctorId;
	private String refDoctorName;
	private String clinicDiag;
	private String symptoms;
	private String preDiagnosis;
	private String accessionNo;
	private Integer imageCount;
	private String memo;
	private Long feeAmount;
	private Integer paymentFlag;
	private String paidDate;
	private String billingNo;
	private Integer insuranceType;
	private String insurancePolicyNo;
	private String sampleSize;
	private String samplePosition;
	private String sampleName;
	private Integer menopauseFlag;
	private String lmp;
	private String gestationalAge;
	private Integer Gravidity;
	private Integer parity;
	private Integer orderStatus;
}
