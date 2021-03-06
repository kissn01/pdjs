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
public class TTriggerTimeRange {

	@TarsStructProperty(order = 0, isRequire = false)
	public short shruleid = (short)0;
	@TarsStructProperty(order = 1, isRequire = false)
	public long utriggertime = 0L;
	@TarsStructProperty(order = 2, isRequire = false)
	public long ueventexpiretime = 0L;

	public short getShruleid() {
		return shruleid;
	}

	public void setShruleid(short shruleid) {
		this.shruleid = shruleid;
	}

	public long getUtriggertime() {
		return utriggertime;
	}

	public void setUtriggertime(long utriggertime) {
		this.utriggertime = utriggertime;
	}

	public long getUeventexpiretime() {
		return ueventexpiretime;
	}

	public void setUeventexpiretime(long ueventexpiretime) {
		this.ueventexpiretime = ueventexpiretime;
	}

	public TTriggerTimeRange() {
	}

	public TTriggerTimeRange(short shruleid, long utriggertime, long ueventexpiretime) {
		this.shruleid = shruleid;
		this.utriggertime = utriggertime;
		this.ueventexpiretime = ueventexpiretime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(shruleid);
		result = prime * result + TarsUtil.hashCode(utriggertime);
		result = prime * result + TarsUtil.hashCode(ueventexpiretime);
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
		if (!(obj instanceof TTriggerTimeRange)) {
			return false;
		}
		TTriggerTimeRange other = (TTriggerTimeRange) obj;
		return (
			TarsUtil.equals(shruleid, other.shruleid) &&
			TarsUtil.equals(utriggertime, other.utriggertime) &&
			TarsUtil.equals(ueventexpiretime, other.ueventexpiretime) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(shruleid, 0);
		_os.write(utriggertime, 1);
		_os.write(ueventexpiretime, 2);
	}


	public void readFrom(TarsInputStream _is) {
		this.shruleid = _is.read(shruleid, 0, false);
		this.utriggertime = _is.read(utriggertime, 1, false);
		this.ueventexpiretime = _is.read(ueventexpiretime, 2, false);
	}

}
