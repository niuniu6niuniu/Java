package classAndObject3;

public class ArticleSimplified {
	// Member Variables
	private String author;
	private String from;
	private String title;
	private int like;
	private int reply;
	
	// Default Constructor
	public ArticleSimplified() {}
	
	// Constructor
	public ArticleSimplified(String author,String from,String title) {
		this.author = author;
		this.from = from;
		this.title = title;
		this.like = 0;
		this.reply = 0;
	}
	
	// Method
	public void operator() {
		this.like += 1;
		this.reply += 1;
		System.out.println("分享文章： 《" + this.title + "》");
		System.out.println("收藏文章： 《" + this.title + "》");
	}
}
