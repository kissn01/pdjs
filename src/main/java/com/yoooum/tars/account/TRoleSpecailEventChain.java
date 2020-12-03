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
public class TRoleSpecailEventChain {

	@TarsStructProperty(order = 0, isRequire = false)
	public short ushid = (short)0;
	@TarsStructProperty(order = 1, isRequire = false)
	public byte cstatus = (byte)0;
	@TarsStructProperty(order = 2, isRequire = false)
	public java.util.List<TRoleEventData> veventdata = null;

	public short getUshid() {
		return ushid;
	}

	public void setUshid(short ushid) {
		this.ushid = ushid;
	}

	public byte getCstatus() {
		return cstatus;
	}

	public void setCstatus(byte cstatus) {
		this.cstatus = cstatus;
	}

	public java.util.List<TRoleEventData> getVeventdata() {
		return veventdata;
	}

	public void setVeventdata(java.util.List<TRoleEventData> veventdata) {
		this.veventdata = veventdata;
	}

	public TRoleSpecailEventChain() {
	}

	public TRoleSpecailEventChain(short ushid, byte cstatus, java.util.List<TRoleEventData> veventdata) {
		this.ushid = ushid;
		this.cstatus = cstatus;
		this.veventdata = veventdata;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(ushid);
		result = prime * result + TarsUtil.hashCode(cstatus);
		result = prime * result + TarsUtil.hashCode(veventdata);
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
		if (!(obj instanceof TRoleSpecailEventChain)) {
			return false;
		}
		TRoleSpecailEventChain other = (TRoleSpecailEventChain) obj;
		return (
			TarsUtil.equals(ushid, other.ushid) &&
			TarsUtil.equals(cstatus, other.cstatus) &&
			TarsUtil.equals(veventdata, other.veventdata) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(ushid, 0);
		_os.write(cstatus, 1);
		if (null != veventdata) {
			_os.write(veventdata, 2);
		}
	}

	static java.util.List<TRoleEventData> cache_veventdata;
	static { 
		cache_veventdata = new java.util.ArrayList<TRoleEventData>();
		TRoleEventData var_59 = new TRoleEventData();
		cache_veventdata.add(var_59);
	}

	public void readFrom(TarsInputStream _is) {
		this.ushid = _is.read(ushid, 0, false);
		this.cstatus = _is.read(cstatus, 1, false);
		this.veventdata = (java.util.List<TRoleEventData>) _is.read(cache_veventdata, 2, false);
	}

}