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
public class TDBBagResource {

	@TarsStructProperty(order = 0, isRequire = false)
	public int iResID = 0;
	@TarsStructProperty(order = 1, isRequire = false)
	public int iCount = 0;

	public int getIResID() {
		return iResID;
	}

	public void setIResID(int iResID) {
		this.iResID = iResID;
	}

	public int getICount() {
		return iCount;
	}

	public void setICount(int iCount) {
		this.iCount = iCount;
	}

	public TDBBagResource() {
	}

	public TDBBagResource(int iResID, int iCount) {
		this.iResID = iResID;
		this.iCount = iCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(iResID);
		result = prime * result + TarsUtil.hashCode(iCount);
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
		if (!(obj instanceof TDBBagResource)) {
			return false;
		}
		TDBBagResource other = (TDBBagResource) obj;
		return (
			TarsUtil.equals(iResID, other.iResID) &&
			TarsUtil.equals(iCount, other.iCount) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(iResID, 0);
		_os.write(iCount, 1);
	}


	public void readFrom(TarsInputStream _is) {
		this.iResID = _is.read(iResID, 0, false);
		this.iCount = _is.read(iCount, 1, false);
	}

}