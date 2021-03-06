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
public class TPetSkillDb {

	@TarsStructProperty(order = 0, isRequire = true)
	public short nskillid = (short)0;
	@TarsStructProperty(order = 1, isRequire = true)
	public short nlvl = (short)0;

	public short getNskillid() {
		return nskillid;
	}

	public void setNskillid(short nskillid) {
		this.nskillid = nskillid;
	}

	public short getNlvl() {
		return nlvl;
	}

	public void setNlvl(short nlvl) {
		this.nlvl = nlvl;
	}

	public TPetSkillDb() {
	}

	public TPetSkillDb(short nskillid, short nlvl) {
		this.nskillid = nskillid;
		this.nlvl = nlvl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(nskillid);
		result = prime * result + TarsUtil.hashCode(nlvl);
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
		if (!(obj instanceof TPetSkillDb)) {
			return false;
		}
		TPetSkillDb other = (TPetSkillDb) obj;
		return (
			TarsUtil.equals(nskillid, other.nskillid) &&
			TarsUtil.equals(nlvl, other.nlvl) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(nskillid, 0);
		_os.write(nlvl, 1);
	}


	public void readFrom(TarsInputStream _is) {
		this.nskillid = _is.read(nskillid, 0, true);
		this.nlvl = _is.read(nlvl, 1, true);
	}

}
