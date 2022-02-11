package com.ssafy.api.response;

import java.util.List;

import com.ssafy.db.entity.Study;
import com.ssafy.db.entity.User;
import com.ssafy.db.entity.UserHomework;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("UserHomeworkListResponse")
public class UserHomeworkListRes {
	@ApiModelProperty(name = "user homework 정보")
	List<UserHomework> userHomeworkList;
	
	public static UserHomeworkListRes of(List<UserHomework> userHomeworkList) {
		UserHomeworkListRes res = new UserHomeworkListRes();
		res.userHomeworkList = userHomeworkList;
		return res;
	}
}