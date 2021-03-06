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
public class TProtagTopicData {

	@TarsStructProperty(order = 0, isRequire = false)
	public int iid = 0;
	@TarsStructProperty(order = 1, isRequire = false)
	public long ulastusetopictime = 0L;
	@TarsStructProperty(order = 2, isRequire = false)
	public java.util.List<java.lang.Integer> vecdayusetopicitem = null;
	@TarsStructProperty(order = 3, isRequire = false)
	public java.util.List<TTopicDocInfo> vectopicuseinfo = null;
	@TarsStructProperty(order = 4, isRequire = false)
	public int ilasttopicdoc = 0;
	@TarsStructProperty(order = 5, isRequire = false)
	public int ilasttopicitemid = 0;

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public long getUlastusetopictime() {
		return ulastusetopictime;
	}

	public void setUlastusetopictime(long ulastusetopictime) {
		this.ulastusetopictime = ulastusetopictime;
	}

	public java.util.List<java.lang.Integer> getVecdayusetopicitem() {
		return vecdayusetopicitem;
	}

	public void setVecdayusetopicitem(java.util.List<java.lang.Integer> vecdayusetopicitem) {
		this.vecdayusetopicitem = vecdayusetopicitem;
	}

	public java.util.List<TTopicDocInfo> getVectopicuseinfo() {
		return vectopicuseinfo;
	}

	public void setVectopicuseinfo(java.util.List<TTopicDocInfo> vectopicuseinfo) {
		this.vectopicuseinfo = vectopicuseinfo;
	}

	public int getIlasttopicdoc() {
		return ilasttopicdoc;
	}

	public void setIlasttopicdoc(int ilasttopicdoc) {
		this.ilasttopicdoc = ilasttopicdoc;
	}

	public int getIlasttopicitemid() {
		return ilasttopicitemid;
	}

	public void setIlasttopicitemid(int ilasttopicitemid) {
		this.ilasttopicitemid = ilasttopicitemid;
	}

	public TProtagTopicData() {
	}

	public TProtagTopicData(int iid, long ulastusetopictime, java.util.List<java.lang.Integer> vecdayusetopicitem, java.util.List<TTopicDocInfo> vectopicuseinfo, int ilasttopicdoc, int ilasttopicitemid) {
		this.iid = iid;
		this.ulastusetopictime = ulastusetopictime;
		this.vecdayusetopicitem = vecdayusetopicitem;
		this.vectopicuseinfo = vectopicuseinfo;
		this.ilasttopicdoc = ilasttopicdoc;
		this.ilasttopicitemid = ilasttopicitemid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(iid);
		result = prime * result + TarsUtil.hashCode(ulastusetopictime);
		result = prime * result + TarsUtil.hashCode(vecdayusetopicitem);
		result = prime * result + TarsUtil.hashCode(vectopicuseinfo);
		result = prime * result + TarsUtil.hashCode(ilasttopicdoc);
		result = prime * result + TarsUtil.hashCode(ilasttopicitemid);
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
		if (!(obj instanceof TProtagTopicData)) {
			return false;
		}
		TProtagTopicData other = (TProtagTopicData) obj;
		return (
			TarsUtil.equals(iid, other.iid) &&
			TarsUtil.equals(ulastusetopictime, other.ulastusetopictime) &&
			TarsUtil.equals(vecdayusetopicitem, other.vecdayusetopicitem) &&
			TarsUtil.equals(vectopicuseinfo, other.vectopicuseinfo) &&
			TarsUtil.equals(ilasttopicdoc, other.ilasttopicdoc) &&
			TarsUtil.equals(ilasttopicitemid, other.ilasttopicitemid) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(iid, 0);
		_os.write(ulastusetopictime, 1);
		if (null != vecdayusetopicitem) {
			_os.write(vecdayusetopicitem, 2);
		}
		if (null != vectopicuseinfo) {
			_os.write(vectopicuseinfo, 3);
		}
		_os.write(ilasttopicdoc, 4);
		_os.write(ilasttopicitemid, 5);
	}

	static java.util.List<java.lang.Integer> cache_vecdayusetopicitem;
	static { 
		cache_vecdayusetopicitem = new java.util.ArrayList<java.lang.Integer>();
		int var_21 = 0;
		cache_vecdayusetopicitem.add(var_21);
	}
	static java.util.List<TTopicDocInfo> cache_vectopicuseinfo;
	static { 
		cache_vectopicuseinfo = new java.util.ArrayList<TTopicDocInfo>();
		TTopicDocInfo var_22 = new TTopicDocInfo();
		cache_vectopicuseinfo.add(var_22);
	}

	public void readFrom(TarsInputStream _is) {
		this.iid = _is.read(iid, 0, false);
		this.ulastusetopictime = _is.read(ulastusetopictime, 1, false);
		this.vecdayusetopicitem = (java.util.List<java.lang.Integer>) _is.read(cache_vecdayusetopicitem, 2, false);
		this.vectopicuseinfo = (java.util.List<TTopicDocInfo>) _is.read(cache_vectopicuseinfo, 3, false);
		this.ilasttopicdoc = _is.read(ilasttopicdoc, 4, false);
		this.ilasttopicitemid = _is.read(ilasttopicitemid, 5, false);
	}

}
