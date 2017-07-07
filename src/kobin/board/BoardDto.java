package kobin.board;

public class BoardDto {
	private int boardNo;
	private String memberId;
	private String boardTitle;
	private String boardContent;
	private String regDate;
	private int readCount;
	private String boardType;
	private String filePath;
	private String photoPath;
	
	public BoardDto(){ }
	
	public BoardDto(int boardNo, String memberId, String boardTitle, 
			String boardContent, String regDate, int readCount,
			String boardType, String filePath, String photoPath) {
		super();
		this.boardNo = boardNo;
		this.memberId = memberId;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.regDate = regDate;
		this.readCount = readCount;
		this.boardType = boardType;
		this.filePath = filePath;
		this.photoPath = photoPath;
	}
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public String getBoardType() {
		return boardType;
	}
	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}	
}
