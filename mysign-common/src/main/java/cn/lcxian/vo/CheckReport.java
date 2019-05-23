package cn.lcxian.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 
 * @author xzero
 *检查报告
 */
@Data
@Accessors(chain=true)
@ToString
public class CheckReport implements Serializable{
	private static final long serialVersionUID = 3705366279316886705L;
	private String studyGuid;
	private String orderNo;
	private String patientName;
	private String patientSex;
	private String patientDob;
	private String studyDate;
	private String studyTime;
	private String orderDetails;
	private String reportDate;
	private String reportTime;
	private String reportDoctorName;
	private String reviewDate;
	private String reviewTime;
	private String reviewDoctorName;
	private String findings;
	private String conclusions;
	private String suggestions;

}
