// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.yoooum.tars.account;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

@TarsStruct
public class TDBBaseInfo {

	@TarsStructProperty(order = 0, isRequire = false)
	public int iNumber = 0;
	@TarsStructProperty(order = 1, isRequire = false)
	public java.util.List<java.lang.Integer> BaseValue = null;

	public int getINumber() {
		return iNumber;
	}

	public void setINumber(int iNumber) {
		this.iNumber = iNumber;
	}

	public java.util.List<java.lang.Integer> getBaseValue() {
		return BaseValue;
	}

	public void setBaseValue(java.util.List<java.lang.Integer> BaseValue) {
		this.BaseValue = BaseValue;
	}

	public TDBBaseInfo() {
	}

	public TDBBaseInfo(int iNumber, java.util.List<java.lang.Integer> BaseValue) {
		this.iNumber = iNumber;
		this.BaseValue = BaseValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(iNumber);
		result = prime * result + TarsUtil.hashCode(BaseValue);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof TDBBaseInfo)) {
			return false;
		}
		TDBBaseInfo other = (TDBBaseInfo) obj;
		return (
			TarsUtil.equals(iNumber, other.iNumber) &&
			TarsUtil.equals(BaseValue, other.BaseValue) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(iNumber, 0);
		if (null != BaseValue) {
			_os.write(BaseValue, 1);
		}
	}

	static java.util.List<java.lang.Integer> cache_BaseValue;
	static { 
		cache_BaseValue = new java.util.ArrayList<java.lang.Integer>();
		int var_1 = 0;
		cache_BaseValue.add(var_1);
	}

	public void readFrom(TarsInputStream _is) {
		this.iNumber = _is.read(iNumber, 0, false);
		this.BaseValue = (java.util.List<java.lang.Integer>) _is.read(cache_BaseValue, 1, false);
	}

}
