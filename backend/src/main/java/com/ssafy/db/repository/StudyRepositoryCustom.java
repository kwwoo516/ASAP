package com.ssafy.db.repository;

import java.util.List;
import java.util.Optional;

import com.ssafy.api.request.StudyPutReq;
import com.ssafy.db.entity.Study;

public interface StudyRepositoryCustom {
	Optional<List<Study>> findByUserno(int userno);
	void updateStudy(StudyPutReq studyPutInfo, String interests);
	long countRecruteUser(int studyno);
}
