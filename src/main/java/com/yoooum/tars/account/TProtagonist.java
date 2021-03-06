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
public class TProtagonist {

	@TarsStructProperty(order = 0, isRequire = false)
	public int iid = 0;
	@TarsStructProperty(order = 1, isRequire = false)
	public short nlovepoint = (short)0;
	@TarsStructProperty(order = 2, isRequire = false)
	public java.util.List<TProtagonistChapter> vecprotagonistchapter = null;

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public short getNlovepoint() {
		return nlovepoint;
	}

	public void setNlovepoint(short nlovepoint) {
		this.nlovepoint = nlovepoint;
	}

	public java.util.List<TProtagonistChapter> getVecprotagonistchapter() {
		return vecprotagonistchapter;
	}

	public void setVecprotagonistchapter(java.util.List<TProtagonistChapter> vecprotagonistchapter) {
		this.vecprotagonistchapter = vecprotagonistchapter;
	}

	public TProtagonist() {
	}

	public TProtagonist(int iid, short nlovepoint, java.util.List<TProtagonistChapter> vecprotagonistchapter) {
		this.iid = iid;
		this.nlovepoint = nlovepoint;
		this.vecprotagonistchapter = vecprotagonistchapter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(iid);
		result = prime * result + TarsUtil.hashCode(nlovepoint);
		result = prime * result + TarsUtil.hashCode(vecprotagonistchapter);
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
		if (!(obj instanceof TProtagonist)) {
			return false;
		}
		TProtagonist other = (TProtagonist) obj;
		return (
			TarsUtil.equals(iid, other.iid) &&
			TarsUtil.equals(nlovepoint, other.nlovepoint) &&
			TarsUtil.equals(vecprotagonistchapter, other.vecprotagonistchapter) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(iid, 0);
		_os.write(nlovepoint, 1);
		if (null != vecprotagonistchapter) {
			_os.write(vecprotagonistchapter, 2);
		}
	}

	static java.util.List<TProtagonistChapter> cache_vecprotagonistchapter;
	static { 
		cache_vecprotagonistchapter = new java.util.ArrayList<TProtagonistChapter>();
		TProtagonistChapter var_17 = new TProtagonistChapter();
		cache_vecprotagonistchapter.add(var_17);
	}

	public void readFrom(TarsInputStream _is) {
		this.iid = _is.read(iid, 0, false);
		this.nlovepoint = _is.read(nlovepoint, 1, false);
		this.vecprotagonistchapter = (java.util.List<TProtagonistChapter>) _is.read(cache_vecprotagonistchapter, 2, false);
	}

}
