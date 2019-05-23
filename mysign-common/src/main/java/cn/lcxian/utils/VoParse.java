package cn.lcxian.utils;

import cn.lcxian.exception.ParamVerifiedException;
import cn.lcxian.pojo.Studies;
import cn.lcxian.vo.ApplyParam;
import cn.lcxian.vo.CheckApply;
import cn.lcxian.vo.CheckReport;

/**
 * 
 * @author xzero
 *检查信息提取类
 */
public class VoParse {

	/*
	 * 从检查业务表提取检查报告信息
	 */
	public static CheckReport toCheckReport(Studies studies) {
		if(studies == null)
			throw new ParamVerifiedException("找不到对应的检查信息！");
		CheckReport checkReport = new CheckReport();
		return checkReport.setConclusions(studies.getConclusions()).
				setFindings(studies.getFindings()).
				setOrderDetails(studies.getOrderDetails()).
				setOrderNo(studies.getOrderDetails()).
				setPatientDob(studies.getPatientDOB()).
				setPatientName(studies.getPatientName()).
				setPatientSex(studies.getPatientSex()).
				setReportDate(studies.getReportDate()).
				setReportDoctorName(studies.getReportDoctorName()).
				setReportTime(studies.getReportTime()).
				setReviewDate(studies.getReviewDate()).
				setReportDoctorName(studies.getReportDoctorName()).
				setReportTime(studies.getReportTime()).
				setReviewDate(studies.getReviewDate()).
				setReviewDoctorName(studies.getReviewDate()).
				setReviewTime(studies.getReviewTime()).
				setStudyDate(studies.getStudyDate()).
				setStudyGuid(studies.getStudyGUID()).
				setStudyTime(studies.getStudyTime());
	}

	/*
	 * 从检查业务表提取检查申请单
	 */
	public static CheckApply toCheckApply(Studies studies) {
		if(studies == null)
			throw new ParamVerifiedException("找不到对应的检查信息！");
		CheckApply checkApply = new CheckApply();
		return checkApply.setAccessionNo(studies.getAccessionNo());
	}

	/*
	 * 根据申请信息参数生成检查业务表
	 */
	public static Studies toStudies(CheckApply checkApply) {
		if(checkApply == null)
			throw new ParamVerifiedException("找不到对应的申请单参数！");

		Studies studies = new Studies().
				setOrderNo(checkApply.getOrderNo()).
				setStudyStatus(checkApply.getOrderStatus()).
				setOrderType(checkApply.getOrderType()).
				setPatientName(checkApply.getPatientName()).
				setPatientRID(checkApply.getPatientRId()).
				setBodyCheckupNo(checkApply.getBodyCheckupNo()).
				setRefDept(checkApply.getRefDeptName()).
				setRefDoctor(checkApply.getRefDoctorName()).
				setAccessionNo(checkApply.getAccessionNo()).
				setArrivedDate(checkApply.getArrivedDate()).
				setArrivedTime(checkApply.getArrivedTime()).
				setBedNo(checkApply.getBedNo()).
				setClinicDiag(checkApply.getClinicDiag()).
				setFilmCount(checkApply.getImageCount()).
				setExamType(checkApply.getExamType()).
				setOrderDetails(checkApply.getOrderDetails()).
				setOrderCopy(checkApply.getOrderCopyUrl()).
				setPatientDOB(checkApply.getPatientDOB()).
				setPatientSex(checkApply.getPatientSex()).
				setMemo(checkApply.getMemo());
		return studies;
	}
}
