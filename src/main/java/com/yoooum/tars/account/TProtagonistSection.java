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
public class TProtagonistSection {

	@TarsStructProperty(order = 0, isRequire = false)
	public int iid = 0;
	@TarsStructProperty(order = 1, isRequire = false)
	public java.util.List<TProtagonistDialogueData> vecdialoguedata = null;
	@TarsStructProperty(order = 2, isRequire = false)
	public byte cfinish = (byte)0;
	@TarsStructProperty(order = 3, isRequire = false)
	public int ibreakoffdialogueid = 0;
	@TarsStructProperty(order = 4, isRequire = false)
	public java.util.List<TCatPropDialogueData> veccatpropdiadata = null;

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public java.util.List<TProtagonistDialogueData> getVecdialoguedata() {
		return vecdialoguedata;
	}

	public void setVecdialoguedata(java.util.List<TProtagonistDialogueData> vecdialoguedata) {
		this.vecdialoguedata = vecdialoguedata;
	}

	public byte getCfinish() {
		return cfinish;
	}

	public void setCfinish(byte cfinish) {
		this.cfinish = cfinish;
	}

	public int getIbreakoffdialogueid() {
		return ibreakoffdialogueid;
	}

	public void setIbreakoffdialogueid(int ibreakoffdialogueid) {
		this.ibreakoffdialogueid = ibreakoffdialogueid;
	}

	public java.util.List<TCatPropDialogueData> getVeccatpropdiadata() {
		return veccatpropdiadata;
	}

	public void setVeccatpropdiadata(java.util.List<TCatPropDialogueData> veccatpropdiadata) {
		this.veccatpropdiadata = veccatpropdiadata;
	}

	public TProtagonistSection() {
	}

	public TProtagonistSection(int iid, java.util.List<TProtagonistDialogueData> vecdialoguedata, byte cfinish, int ibreakoffdialogueid, java.util.List<TCatPropDialogueData> veccatpropdiadata) {
		this.iid = iid;
		this.vecdialoguedata = vecdialoguedata;
		this.cfinish = cfinish;
		this.ibreakoffdialogueid = ibreakoffdialogueid;
		this.veccatpropdiadata = veccatpropdiadata;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(iid);
		result = prime * result + TarsUtil.hashCode(vecdialoguedata);
		result = prime * result + TarsUtil.hashCode(cfinish);
		result = prime * result + TarsUtil.hashCode(ibreakoffdialogueid);
		result = prime * result + TarsUtil.hashCode(veccatpropdiadata);
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
		if (!(obj instanceof TProtagonistSection)) {
			return false;
		}
		TProtagonistSection other = (TProtagonistSection) obj;
		return (
			TarsUtil.equals(iid, other.iid) &&
			TarsUtil.equals(vecdialoguedata, other.vecdialoguedata) &&
			TarsUtil.equals(cfinish, other.cfinish) &&
			TarsUtil.equals(ibreakoffdialogueid, other.ibreakoffdialogueid) &&
			TarsUtil.equals(veccatpropdiadata, other.veccatpropdiadata) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(iid, 0);
		if (null != vecdialoguedata) {
			_os.write(vecdialoguedata, 1);
		}
		_os.write(cfinish, 2);
		_os.write(ibreakoffdialogueid, 3);
		if (null != veccatpropdiadata) {
			_os.write(veccatpropdiadata, 4);
		}
	}

	static java.util.List<TProtagonistDialogueData> cache_vecdialoguedata;
	static { 
		cache_vecdialoguedata = new java.util.ArrayList<TProtagonistDialogueData>();
		TProtagonistDialogueData var_13 = new TProtagonistDialogueData();
		cache_vecdialoguedata.add(var_13);
	}
	static java.util.List<TCatPropDialogueData> cache_veccatpropdiadata;
	static { 
		cache_veccatpropdiadata = new java.util.ArrayList<TCatPropDialogueData>();
		TCatPropDialogueData var_14 = new TCatPropDialogueData();
		cache_veccatpropdiadata.add(var_14);
	}

	public void readFrom(TarsInputStream _is) {
		this.iid = _is.read(iid, 0, false);
		this.vecdialoguedata = (java.util.List<TProtagonistDialogueData>) _is.read(cache_vecdialoguedata, 1, false);
		this.cfinish = _is.read(cfinish, 2, false);
		this.ibreakoffdialogueid = _is.read(ibreakoffdialogueid, 3, false);
		this.veccatpropdiadata = (java.util.List<TCatPropDialogueData>) _is.read(cache_veccatpropdiadata, 4, false);
	}

}