package com.hansuk.web.model;

public class BoardVO {
   
	public int idx;
	public int dk_book_idx;
	public int gradations;;
	public String question;
	public String answer;
	public String use_yn;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getDk_book_idx() {
		return dk_book_idx;
	}
	public void setDk_book_idx(int dk_book_idx) {
		this.dk_book_idx = dk_book_idx;
	}
	public int getGradations() {
		return gradations;
	}
	public void setGradations(int gradations) {
		this.gradations = gradations;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	@Override
	public String toString() {
		return "BoardVO [idx=" + idx + ", dk_book_idx=" + dk_book_idx + ", gradations=" + gradations + ", question="
				+ question + ", answer=" + answer + ", use_yn=" + use_yn + "]";
	}
    
    
}
