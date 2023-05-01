package com.ssafy.trip.plan.model.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ssafy.trip.plan.model.dto.PlaceDto;
import com.ssafy.trip.plan.model.dto.PlanDto;
import com.ssafy.trip.util.PageNavigation;

public interface PlanService {
	/** 여행 경로 추가 */
	public int insertPlan(PlanDto planDto) throws SQLException;

	/** 여행지 추가 */
	public int insertPlace(PlaceDto placeDto) throws SQLException;

	/** 여행 경로 삭제 */
	public void deletePlan(String id) throws SQLException;

	/** 여행 경로 리스트 출력 */
	public List<PlanDto> listPlan(Map<String, String> map) throws SQLException;
	
	/** 글 번호에 맞는 여행 경로 출력 */
	public PlanDto listPlanOne(int planId) throws SQLException;

	/** 여행 경로에 맞는 여행지 리스트 출력 */
	public List<PlaceDto> getPlace(int planId) throws SQLException;

	/** 여행 경로 id 가져오기 */
	public int getPlanId(Map<String, Object> param) throws SQLException;
	
	/** 조회수 증가 */
	public void updateHit(int planId) throws SQLException;
	
	/** 최단 경로 여행지 리스트 출력 */
	public List<PlaceDto> selectFastDistancePlace(int planId) throws SQLException;
	
	/** 여행 글 목록 네비게이션 */
	public PageNavigation makePageNavigation(Map<String, String> map) throws Exception;
}