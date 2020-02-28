package com.dh.hobbyist.applyRefund.model.vo;

import java.sql.Timestamp;

public class ApplyRefund {
	
	private int refundCode;			//신청코드
	private int paymentCode;		//결제코드
	private String lessonName;
	private int memberCode;			//회원코드
	private String memberName;		//회원이름
	private String phone;			//전화번호
	private int artistCode;			//아티스트 코드
	private int refundCost;			//환불금액
	private Timestamp applyDate;	//신청일
	private int totalOrder;			//총 수업회차
	private int finishOrder;		//진행회차
	private int leftOrder;			//잔여회차
	private int usingPoint;			//사용포인트
	private int givePoint; 			//지금예정포인트
	private int payCost;			//결제금액
	private int resultCost;			//환불금액
	private String impNum;			//결제고유번호
	
	public ApplyRefund() {}

	public ApplyRefund(int refundCode, int paymentCode, String lessonName, int memberCode, String memberName,
			String phone, int artistCode, int refundCost, Timestamp applyDate, int totalOrder, int finishOrder,
			int leftOrder, int usingPoint, int givePoint, int payCost, int resultCost, String impNum) {
		super();
		this.refundCode = refundCode;
		this.paymentCode = paymentCode;
		this.lessonName = lessonName;
		this.memberCode = memberCode;
		this.memberName = memberName;
		this.phone = phone;
		this.artistCode = artistCode;
		this.refundCost = refundCost;
		this.applyDate = applyDate;
		this.totalOrder = totalOrder;
		this.finishOrder = finishOrder;
		this.leftOrder = leftOrder;
		this.usingPoint = usingPoint;
		this.givePoint = givePoint;
		this.payCost = payCost;
		this.resultCost = resultCost;
		this.impNum = impNum;
	}

	public int getRefundCode() {
		return refundCode;
	}

	public void setRefundCode(int refundCode) {
		this.refundCode = refundCode;
	}

	public int getPaymentCode() {
		return paymentCode;
	}

	public void setPaymentCode(int paymentCode) {
		this.paymentCode = paymentCode;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public int getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(int memberCode) {
		this.memberCode = memberCode;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getArtistCode() {
		return artistCode;
	}

	public void setArtistCode(int artistCode) {
		this.artistCode = artistCode;
	}

	public int getRefundCost() {
		return refundCost;
	}

	public void setRefundCost(int refundCost) {
		this.refundCost = refundCost;
	}

	public Timestamp getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Timestamp applyDate) {
		this.applyDate = applyDate;
	}

	public int getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}

	public int getFinishOrder() {
		return finishOrder;
	}

	public void setFinishOrder(int finishOrder) {
		this.finishOrder = finishOrder;
	}

	public int getLeftOrder() {
		return leftOrder;
	}

	public void setLeftOrder(int leftOrder) {
		this.leftOrder = leftOrder;
	}

	public int getUsingPoint() {
		return usingPoint;
	}

	public void setUsingPoint(int usingPoint) {
		this.usingPoint = usingPoint;
	}

	public int getGivePoint() {
		return givePoint;
	}

	public void setGivePoint(int givePoint) {
		this.givePoint = givePoint;
	}

	public int getPayCost() {
		return payCost;
	}

	public void setPayCost(int payCost) {
		this.payCost = payCost;
	}

	public int getResultCost() {
		return resultCost;
	}

	public void setResultCost(int resultCost) {
		this.resultCost = resultCost;
	}

	public String getImpNum() {
		return impNum;
	}

	public void setImpNum(String impNum) {
		this.impNum = impNum;
	}

	@Override
	public String toString() {
		return "ApplyRefund [refundCode=" + refundCode + ", paymentCode=" + paymentCode + ", lessonName=" + lessonName
				+ ", memberCode=" + memberCode + ", memberName=" + memberName + ", phone=" + phone + ", artistCode="
				+ artistCode + ", refundCost=" + refundCost + ", applyDate=" + applyDate + ", totalOrder=" + totalOrder
				+ ", finishOrder=" + finishOrder + ", leftOrder=" + leftOrder + ", usingPoint=" + usingPoint
				+ ", givePoint=" + givePoint + ", payCost=" + payCost + ", resultCost=" + resultCost + ", impNum="
				+ impNum + "]";
	}
}