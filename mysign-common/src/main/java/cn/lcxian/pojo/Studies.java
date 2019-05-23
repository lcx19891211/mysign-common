package cn.lcxian.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 检查表
 */
@Data
@Accessors(chain=true)
@ToString
@TableName
public class Studies implements Serializable{
	private static final long serialVersionUID = 126793368197609421L;
	@TableId(type=IdType.AUTO)
	private String studyGUID;
	private String studyUID;
	private String studyID;
	private String accessionNo;
	private String docID;
	private String oldDocID;
	private String mrn;
	private String patientName;
	private String patientNamePy;
	private String patientSex;
	private String patientAge;
	private String patientAgeUnit;
	private String patientDOB;
	private String patientRID;
	private String companyName;
	private String contactInfo;
	private String examType;
	private String orderNo;
	private String orderType;
	private String orderDetails;
	private String orderCopy;
	private String inpatientNo;
	private String outpatientNo;
	private String bodyCheckupNo;
	private String ward;
	private String bedNo;
	private String refDept;
	private String refDoctor;
	private String purpose;
	private String clinicDiag;
	private String symptoms;
	private String serviceGUIDs;
	private String serviceNames;
	private String examMethods;
	private Integer bodyPartCount;
	private Integer bodyPartAmount;
	private Integer exposureTimes;
	private Integer filmCount;
	private Double fee;
	private String location;
	private String scheduledDate;
	private String scheduledTime;
	private String checkinTime;
	private String queueGroupID;
	private Integer queueSN;
	private String queueSNStr;
	private String roomName;
	private Integer roomNo;
	private String deviceName;
	private String deviceAET;
	private Integer absent;
	private String arrivedDate;
	private String arrivedTime;
	private String arrivedTimeX;
	private String studyDate;
	private String studyTime;
	private String technicianEmpNo;
	private String technicianName;
	private String juniorDoctorEmpNo;
	private String juniorDoctorName;
	private Integer juniorReport;
	private String juniorReportDate;
	private String reportDate;
	private String reportTime;
	private String reportDoctorEmpNo;
	private String reportDoctorName;
	private Integer reportDoctorSL;
	private String reportSignature;
	private String reportStartTime;
	private String reportFinishTime;
	private String reviewDate;
	private String reviewTime;
	private String reviewDoctorEmpNo;
	private String reviewDoctorName;
	private Integer reviewDoctorSL;
	private String reviewSignature;
	private String reviewStartTime;
	private String reviewFinishTime;
	private String qualityLevel;
	private String qualityComment;
	private String scanMode;
	private String imagingSequence;
	private String filmSequence;
	private String positiveFlag;
	private Integer criticalFlag;
	private String findings;
	private String conclusions;
	private String memo;
	private String pathDiagnosis;
	private Integer sendTimes;
	private Integer printTimes;
	private Integer filmReadyFlag;
	private Integer takeReportFlag;
	private Integer sendFlag;
	private String registeredDate;
	private String RegisteredTime;
	private String creatorID;
	private String creatorEmpNo;
	private String creatorName;
	private Integer studyStatus;
	private String conclusionsMD5;
	private Integer mWLReadFlag;
	private String inspectMemo;
	private String reviewBackTimes;
	private Integer printedAtReception;
	private Integer followCheckFlag;
	private String reportFmtCode;
	private Integer infectiousFlag;
	private Integer nightShiftFlag;
	private Integer overTimeFlag;
	private Integer bedSideFlag;
	private Integer extraStatus;
	private String refStudyGUID;
	private String preferredRoom;
	private Double jobFactor;
	private Integer reinspectFlag;
	private Integer enhancedFlag;
	private String warnContent;
}
