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
public class TRoleSpecailEvent {

	@TarsStructProperty(order = 0, isRequire = false)
	public java.util.List<TRoleSpecailEventChain> vrolespecailevent = null;

	public java.util.List<TRoleSpecailEventChain> getVrolespecailevent() {
		return vrolespecailevent;
	}

	public void setVrolespecailevent(java.util.List<TRoleSpecailEventChain> vrolespecailevent) {
		this.vrolespecailevent = vrolespecailevent;
	}

	public TRoleSpecailEvent() {
	}

	public TRoleSpecailEvent(java.util.List<TRoleSpecailEventChain> vrolespecailevent) {
		this.vrolespecailevent = vrolespecailevent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(vrolespecailevent);
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
		if (!(obj instanceof TRoleSpecailEvent)) {
			return false;
		}
		TRoleSpecailEvent other = (TRoleSpecailEvent) obj;
		return (
			TarsUtil.equals(vrolespecailevent, other.vrolespecailevent) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		if (null != vrolespecailevent) {
			_os.write(vrolespecailevent, 0);
		}
	}

	static java.util.List<TRoleSpecailEventChain> cache_vrolespecailevent;
	static { 
		cache_vrolespecailevent = new java.util.ArrayList<TRoleSpecailEventChain>();
		TRoleSpecailEventChain var_60 = new TRoleSpecailEventChain();
		cache_vrolespecailevent.add(var_60);
	}

	public void readFrom(TarsInputStream _is) {
		this.vrolespecailevent = (java.util.List<TRoleSpecailEventChain>) _is.read(cache_vrolespecailevent, 0, false);
	}

}
