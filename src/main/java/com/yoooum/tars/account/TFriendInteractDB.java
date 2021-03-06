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
public class TFriendInteractDB {

	@TarsStructProperty(order = 0, isRequire = false)
	public TFriendRecruitDB strecruitfriend = null;

	public TFriendRecruitDB getStrecruitfriend() {
		return strecruitfriend;
	}

	public void setStrecruitfriend(TFriendRecruitDB strecruitfriend) {
		this.strecruitfriend = strecruitfriend;
	}

	public TFriendInteractDB() {
	}

	public TFriendInteractDB(TFriendRecruitDB strecruitfriend) {
		this.strecruitfriend = strecruitfriend;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(strecruitfriend);
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
		if (!(obj instanceof TFriendInteractDB)) {
			return false;
		}
		TFriendInteractDB other = (TFriendInteractDB) obj;
		return (
			TarsUtil.equals(strecruitfriend, other.strecruitfriend) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		if (null != strecruitfriend) {
			_os.write(strecruitfriend, 0);
		}
	}

	static TFriendRecruitDB cache_strecruitfriend;
	static { 
		cache_strecruitfriend = new TFriendRecruitDB();
	}

	public void readFrom(TarsInputStream _is) {
		this.strecruitfriend = (TFriendRecruitDB) _is.read(cache_strecruitfriend, 0, false);
	}

}
