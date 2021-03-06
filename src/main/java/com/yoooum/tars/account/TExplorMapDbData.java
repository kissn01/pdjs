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
public class TExplorMapDbData {

	@TarsStructProperty(order = 0, isRequire = false)
	public short shmapid = (short)0;
	@TarsStructProperty(order = 1, isRequire = false)
	public int icount = 0;
	@TarsStructProperty(order = 2, isRequire = false)
	public byte ctrigboss = (byte)0;

	public short getShmapid() {
		return shmapid;
	}

	public void setShmapid(short shmapid) {
		this.shmapid = shmapid;
	}

	public int getIcount() {
		return icount;
	}

	public void setIcount(int icount) {
		this.icount = icount;
	}

	public byte getCtrigboss() {
		return ctrigboss;
	}

	public void setCtrigboss(byte ctrigboss) {
		this.ctrigboss = ctrigboss;
	}

	public TExplorMapDbData() {
	}

	public TExplorMapDbData(short shmapid, int icount, byte ctrigboss) {
		this.shmapid = shmapid;
		this.icount = icount;
		this.ctrigboss = ctrigboss;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(shmapid);
		result = prime * result + TarsUtil.hashCode(icount);
		result = prime * result + TarsUtil.hashCode(ctrigboss);
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
		if (!(obj instanceof TExplorMapDbData)) {
			return false;
		}
		TExplorMapDbData other = (TExplorMapDbData) obj;
		return (
			TarsUtil.equals(shmapid, other.shmapid) &&
			TarsUtil.equals(icount, other.icount) &&
			TarsUtil.equals(ctrigboss, other.ctrigboss) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(shmapid, 0);
		_os.write(icount, 1);
		_os.write(ctrigboss, 2);
	}


	public void readFrom(TarsInputStream _is) {
		this.shmapid = _is.read(shmapid, 0, false);
		this.icount = _is.read(icount, 1, false);
		this.ctrigboss = _is.read(ctrigboss, 2, false);
	}

}
