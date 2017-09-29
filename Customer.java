import java.lang.*;
public class Customer {
	public String cname;
	public String feedback;
	public int cno;
	public void cno(int cno){
		this.cno=cno;
	}
	public int getCno()
	{
		return cno;
	}
	public void setFeedback(String feedback){
		this.feedback=feedback;
	}
	public String getFeedback(){
		return feedback;
	}
	public void setCname(String cname){
		this.cname=cname;
	}
	public String getCname(){
		return cname;
	}
}
