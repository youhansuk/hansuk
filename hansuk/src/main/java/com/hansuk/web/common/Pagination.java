package com.hansuk.web.common;

public class Pagination {
    
	
	private int listSize = 10;     //한 페이지 목록 개수
	private int rangeSize =10;
	private int page;          //현재페이지
	private int range;            //현재 페이지 범위 정보
	private int listCnt;            //게시물 총 개수
	private int pageCnt;          //총 페이지 범위 개수
	private int startPage;         //시작번호
	private int startList;         
	private int endPage;           //끝 번호
	private boolean prev;           //이전 페이지
	private boolean next;           //다음 페이지
	
	public int getListSize() {
		return listSize;
	}
	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
	public int getRangeSize() {
		return rangeSize;
	}
	public void setRangeSize(int rangeSize) {
		this.rangeSize = rangeSize;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getListCnt() {
		return listCnt;
	}
	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}
	public int getPageCnt() {
		return pageCnt;
	}
	public void setPageCnt(int pageCnt) {
		this.pageCnt = pageCnt;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getStartList() {
		return startList;
	}
	public void setStartList(int startList) {
		this.startList = startList;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	
	
	//페이징
	public void pageInfo(int page,int range, int listCnt) {
		this.page = page;
		this.range = range;
		this.listCnt = listCnt;
		
		
		// 전체 페이지수
		this.pageCnt = (int) Math.ceil(listCnt/listSize);
		
		//시작 페이지
		this.startPage = (range - 1) * rangeSize + 1 ;
		
		//끝 페이지
		this.endPage = range * rangeSize;
		
		//3ㅔ시판 시작번호
		this.startList = (page - 1) * listSize;
		
		//이전버튼
		this.prev = range == 1? false : true;
		
		//다음버튼
		this.next = endPage > pageCnt ? false : true;
		if(this.endPage > this.pageCnt) {
			this.endPage = this.pageCnt;
			this.next = false;
			
			
		}
		
		
	}
}
