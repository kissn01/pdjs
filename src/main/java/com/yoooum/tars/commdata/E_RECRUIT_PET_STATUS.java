// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.yoooum.tars.commdata;

public enum E_RECRUIT_PET_STATUS {

	E_RECRUIT_PET_STATUS_FAVOR(0),
	E_RECRUIT_PET_STATUS_NULL(1),
	E_RECRUIT_PET_STATUS_SUCC(2);

	private final int value;

	private E_RECRUIT_PET_STATUS(int value) {
		this.value = value;
	}

	public int value() {
		return this.value;
	}

	@Override
	public String toString() {
		return this.name() + ":" + this.value;
	}

	public static E_RECRUIT_PET_STATUS convert(int value) {
		for(E_RECRUIT_PET_STATUS v : values()) {
			if(v.value() == value) {
				return v;
			}
		}
		return null;
	}
}