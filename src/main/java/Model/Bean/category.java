package Model.Bean;

public class category {
	private int cid;
	private String cname;
	
	public category(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	
	public category() {
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	@Override
	public String toString() {
		return "category [cid=" + cid + ", cname=" + cname + "]";
	}
}
