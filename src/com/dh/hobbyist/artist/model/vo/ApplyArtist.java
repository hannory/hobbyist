package com.dh.hobbyist.artist.model.vo;

import java.sql.Date;

public class ApplyArtist implements java.io.Serializable {
	private int applyPk;
	private Date applyDate;
	private int applyAttempts;
	private int applyConfirmed;
	private String rejectReason;
	private int applyMember;
	
	public ApplyArtist() {}

	public ApplyArtist(int applyPk, Date applyDate, int applyAttempts, int applyConfirmed, String rejectReason,
			int applyMember) {
		super();
		this.applyPk = applyPk;
		this.applyDate = applyDate;
		this.applyAttempts = applyAttempts;
		this.applyConfirmed = applyConfirmed;
		this.rejectReason = rejectReason;
		this.applyMember = applyMember;
	}

	public int getApplyPk() {
		return applyPk;
	}

	public void setApplyPk(int applyPk) {
		this.applyPk = applyPk;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public int getApplyAttempts() {
		return applyAttempts;
	}

	public void setApplyAttempts(int applyAttempts) {
		this.applyAttempts = applyAttempts;
	}

	public int getApplyConfirmed() {
		return applyConfirmed;
	}

	public void setApplyConfirmed(int applyConfirmed) {
		this.applyConfirmed = applyConfirmed;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public int getApplyMember() {
		return applyMember;
	}

	public void setApplyMember(int applyMember) {
		this.applyMember = applyMember;
	}

	@Override
	public String toString() {
		return "ApplyArtist [applyPk=" + applyPk + ", applyDate=" + applyDate + ", applyAttempts=" + applyAttempts
				+ ", applyConfirmed=" + applyConfirmed + ", rejectReason=" + rejectReason + ", applyMember="
				+ applyMember + "]";
	}
	
	
}