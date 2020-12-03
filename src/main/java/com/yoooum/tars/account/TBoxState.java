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
public class TBoxState {

	@TarsStructProperty(order = 0, isRequire = false)
	public int eAwardState = 0;

	public int getEAwardState() {
		return eAwardState;
	}

	public void setEAwardState(int eAwardState) {
		this.eAwardState = eAwardState;
	}

	public TBoxState() {
	}

	public TBoxState(int eAwardState) {
		this.eAwardState = eAwardState;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(eAwardState);
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
		if (!(obj instanceof TBoxState)) {
			return false;
		}
		TBoxState other = (TBoxState) obj;
		return (
			TarsUtil.equals(eAwardState, other.eAwardState) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(eAwardState, 0);
	}


	public void readFrom(TarsInputStream _is) {
		this.eAwardState = _is.read(eAwardState, 0, false);
	}

}