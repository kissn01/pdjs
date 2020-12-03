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
public class TRoleCommEvent {

	@TarsStructProperty(order = 0, isRequire = false)
	public java.util.List<java.lang.Short> vecvieweventid = null;
	@TarsStructProperty(order = 1, isRequire = false)
	public java.util.List<TRoleEventData> vecnotvieweventdata = null;
	@TarsStructProperty(order = 2, isRequire = false)
	public java.util.List<java.lang.Short> vecuseeventid = null;

	public java.util.List<java.lang.Short> getVecvieweventid() {
		return vecvieweventid;
	}

	public void setVecvieweventid(java.util.List<java.lang.Short> vecvieweventid) {
		this.vecvieweventid = vecvieweventid;
	}

	public java.util.List<TRoleEventData> getVecnotvieweventdata() {
		return vecnotvieweventdata;
	}

	public void setVecnotvieweventdata(java.util.List<TRoleEventData> vecnotvieweventdata) {
		this.vecnotvieweventdata = vecnotvieweventdata;
	}

	public java.util.List<java.lang.Short> getVecuseeventid() {
		return vecuseeventid;
	}

	public void setVecuseeventid(java.util.List<java.lang.Short> vecuseeventid) {
		this.vecuseeventid = vecuseeventid;
	}

	public TRoleCommEvent() {
	}

	public TRoleCommEvent(java.util.List<java.lang.Short> vecvieweventid, java.util.List<TRoleEventData> vecnotvieweventdata, java.util.List<java.lang.Short> vecuseeventid) {
		this.vecvieweventid = vecvieweventid;
		this.vecnotvieweventdata = vecnotvieweventdata;
		this.vecuseeventid = vecuseeventid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(vecvieweventid);
		result = prime * result + TarsUtil.hashCode(vecnotvieweventdata);
		result = prime * result + TarsUtil.hashCode(vecuseeventid);
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
		if (!(obj instanceof TRoleCommEvent)) {
			return false;
		}
		TRoleCommEvent other = (TRoleCommEvent) obj;
		return (
			TarsUtil.equals(vecvieweventid, other.vecvieweventid) &&
			TarsUtil.equals(vecnotvieweventdata, other.vecnotvieweventdata) &&
			TarsUtil.equals(vecuseeventid, other.vecuseeventid) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		if (null != vecvieweventid) {
			_os.write(vecvieweventid, 0);
		}
		if (null != vecnotvieweventdata) {
			_os.write(vecnotvieweventdata, 1);
		}
		if (null != vecuseeventid) {
			_os.write(vecuseeventid, 2);
		}
	}

	static java.util.List<java.lang.Short> cache_vecvieweventid;
	static { 
		cache_vecvieweventid = new java.util.ArrayList<java.lang.Short>();
		short var_55 = (short)0;
		cache_vecvieweventid.add(var_55);
	}
	static java.util.List<TRoleEventData> cache_vecnotvieweventdata;
	static { 
		cache_vecnotvieweventdata = new java.util.ArrayList<TRoleEventData>();
		TRoleEventData var_56 = new TRoleEventData();
		cache_vecnotvieweventdata.add(var_56);
	}
	static java.util.List<java.lang.Short> cache_vecuseeventid;
	static { 
		cache_vecuseeventid = new java.util.ArrayList<java.lang.Short>();
		short var_57 = (short)0;
		cache_vecuseeventid.add(var_57);
	}

	public void readFrom(TarsInputStream _is) {
		this.vecvieweventid = (java.util.List<java.lang.Short>) _is.read(cache_vecvieweventid, 0, false);
		this.vecnotvieweventdata = (java.util.List<TRoleEventData>) _is.read(cache_vecnotvieweventdata, 1, false);
		this.vecuseeventid = (java.util.List<java.lang.Short>) _is.read(cache_vecuseeventid, 2, false);
	}

}