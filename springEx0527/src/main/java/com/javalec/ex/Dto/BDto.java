package com.javalec.ex.Dto;

import java.sql.Timestamp;

public class BDto {

	int BId;
	String BName;
	String BTitle;
	String BContent;
	Timestamp BDate;
	int BHit;
	int BGroup;
	int BStep;
	int BIndent;
	
	public BDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BDto(int bId, String bName, String bTitle, String bContent, Timestamp bDate, int bHit, int bGroup, int bStep,
			int bIndent) {
		super();
		BId = bId;
		BName = bName;
		BTitle = bTitle;
		BContent = bContent;
		BDate = bDate;
		BHit = bHit;
		BGroup = bGroup;
		BStep = bStep;
		BIndent = bIndent;
	}
	public int getBId() {
		return BId;
	}
	public void setBId(int bId) {
		BId = bId;
	}
	public String getBName() {
		return BName;
	}
	public void setBName(String bName) {
		BName = bName;
	}
	public String getBTitle() {
		return BTitle;
	}
	public void setBTitle(String bTitle) {
		BTitle = bTitle;
	}
	public String getBContent() {
		return BContent;
	}
	public void setBContent(String bContent) {
		BContent = bContent;
	}
	public Timestamp getBDate() {
		return BDate;
	}
	public void setBDate(Timestamp bDate) {
		BDate = bDate;
	}
	public int getBHit() {
		return BHit;
	}
	public void setBHit(int bHit) {
		BHit = bHit;
	}
	public int getBGroup() {
		return BGroup;
	}
	public void setBGroup(int bGroup) {
		BGroup = bGroup;
	}
	public int getBStep() {
		return BStep;
	}
	public void setBStep(int bStep) {
		BStep = bStep;
	}
	public int getBIndent() {
		return BIndent;
	}
	public void setBIndent(int bIndent) {
		BIndent = bIndent;
	}
	
	
	
}
