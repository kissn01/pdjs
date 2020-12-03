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
public class TMailItem {

	@TarsStructProperty(order = 0, isRequire = false)
	public long iID = 0L;
	@TarsStructProperty(order = 1, isRequire = false)
	public short nMailType = (short)0;
	@TarsStructProperty(order = 2, isRequire = false)
	public long lRetainTime = 0L;
	@TarsStructProperty(order = 3, isRequire = false)
	public long lShowTime = 0L;
	@TarsStructProperty(order = 4, isRequire = false)
	public byte cStatus = (byte)0;
	@TarsStructProperty(order = 5, isRequire = false)
	public String sTitle = "";
	@TarsStructProperty(order = 6, isRequire = false)
	public String sContent = "";
	@TarsStructProperty(order = 7, isRequire = false)
	public java.util.List<TAccessoryItem> vAccessoryItem = null;
	@TarsStructProperty(order = 8, isRequire = false)
	public long lSendTime = 0L;

	public long getIID() {
		return iID;
	}

	public void setIID(long iID) {
		this.iID = iID;
	}

	public short getNMailType() {
		return nMailType;
	}

	public void setNMailType(short nMailType) {
		this.nMailType = nMailType;
	}

	public long getLRetainTime() {
		return lRetainTime;
	}

	public void setLRetainTime(long lRetainTime) {
		this.lRetainTime = lRetainTime;
	}

	public long getLShowTime() {
		return lShowTime;
	}

	public void setLShowTime(long lShowTime) {
		this.lShowTime = lShowTime;
	}

	public byte getCStatus() {
		return cStatus;
	}

	public void setCStatus(byte cStatus) {
		this.cStatus = cStatus;
	}

	public String getSTitle() {
		return sTitle;
	}

	public void setSTitle(String sTitle) {
		this.sTitle = sTitle;
	}

	public String getSContent() {
		return sContent;
	}

	public void setSContent(String sContent) {
		this.sContent = sContent;
	}

	public java.util.List<TAccessoryItem> getVAccessoryItem() {
		return vAccessoryItem;
	}

	public void setVAccessoryItem(java.util.List<TAccessoryItem> vAccessoryItem) {
		this.vAccessoryItem = vAccessoryItem;
	}

	public long getLSendTime() {
		return lSendTime;
	}

	public void setLSendTime(long lSendTime) {
		this.lSendTime = lSendTime;
	}

	public TMailItem() {
	}

	public TMailItem(long iID, short nMailType, long lRetainTime, long lShowTime, byte cStatus, String sTitle, String sContent, java.util.List<TAccessoryItem> vAccessoryItem, long lSendTime) {
		this.iID = iID;
		this.nMailType = nMailType;
		this.lRetainTime = lRetainTime;
		this.lShowTime = lShowTime;
		this.cStatus = cStatus;
		this.sTitle = sTitle;
		this.sContent = sContent;
		this.vAccessoryItem = vAccessoryItem;
		this.lSendTime = lSendTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(iID);
		result = prime * result + TarsUtil.hashCode(nMailType);
		result = prime * result + TarsUtil.hashCode(lRetainTime);
		result = prime * result + TarsUtil.hashCode(lShowTime);
		result = prime * result + TarsUtil.hashCode(cStatus);
		result = prime * result + TarsUtil.hashCode(sTitle);
		result = prime * result + TarsUtil.hashCode(sContent);
		result = prime * result + TarsUtil.hashCode(vAccessoryItem);
		result = prime * result + TarsUtil.hashCode(lSendTime);
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
		if (!(obj instanceof TMailItem)) {
			return false;
		}
		TMailItem other = (TMailItem) obj;
		return (
			TarsUtil.equals(iID, other.iID) &&
			TarsUtil.equals(nMailType, other.nMailType) &&
			TarsUtil.equals(lRetainTime, other.lRetainTime) &&
			TarsUtil.equals(lShowTime, other.lShowTime) &&
			TarsUtil.equals(cStatus, other.cStatus) &&
			TarsUtil.equals(sTitle, other.sTitle) &&
			TarsUtil.equals(sContent, other.sContent) &&
			TarsUtil.equals(vAccessoryItem, other.vAccessoryItem) &&
			TarsUtil.equals(lSendTime, other.lSendTime) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(iID, 0);
		_os.write(nMailType, 1);
		_os.write(lRetainTime, 2);
		_os.write(lShowTime, 3);
		_os.write(cStatus, 4);
		if (null != sTitle) {
			_os.write(sTitle, 5);
		}
		if (null != sContent) {
			_os.write(sContent, 6);
		}
		if (null != vAccessoryItem) {
			_os.write(vAccessoryItem, 7);
		}
		_os.write(lSendTime, 8);
	}

	static java.util.List<TAccessoryItem> cache_vAccessoryItem;
	static { 
		cache_vAccessoryItem = new java.util.ArrayList<TAccessoryItem>();
		TAccessoryItem var_47 = new TAccessoryItem();
		cache_vAccessoryItem.add(var_47);
	}

	public void readFrom(TarsInputStream _is) {
		this.iID = _is.read(iID, 0, false);
		this.nMailType = _is.read(nMailType, 1, false);
		this.lRetainTime = _is.read(lRetainTime, 2, false);
		this.lShowTime = _is.read(lShowTime, 3, false);
		this.cStatus = _is.read(cStatus, 4, false);
		this.sTitle = _is.readString(5, false);
		this.sContent = _is.readString(6, false);
		this.vAccessoryItem = (java.util.List<TAccessoryItem>) _is.read(cache_vAccessoryItem, 7, false);
		this.lSendTime = _is.read(lSendTime, 8, false);
	}

}