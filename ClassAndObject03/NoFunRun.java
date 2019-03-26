package classAndObject3;

public class NoFunRun {
	public static void main(String[] args) {
		// Three articles
		ArticleTestModel articleOne = new ArticleTestModel();
		ArticleTestModel articleTwo = new ArticleTestModel();
		ArticleTestModel articleThree = new ArticleTestModel();
		// First
		articleOne.author = "机器之心";
		articleOne.from = "Machine Learning";
		articleOne.title = "零基础ML建模,自动机器学习平台R2 Learn开放免费试用";
		articleOne.like = 18;
		articleOne.reply = 2;
		// Second
		articleTwo.author = "码思客";
		articleTwo.from = "Java";
		articleTwo.title = "类加载与Class对象";
		articleTwo.like = 6;
		articleTwo.reply = 0;
		// Third
		articleThree.author = "知乎日报";
		articleThree.from = "News";
		articleThree.title = "变味一时爽，一直变味一直爽";
		articleThree.like = 331;
		articleThree.reply = 53;
		// Copy
		articleOne.like += 1;
		articleOne.reply += 1;
		System.out.println("分享文章 《" + articleOne.title + "》");
		System.out.println("收藏文章 《" + articleOne.title + "》");
		System.out.println("Likes: " + articleOne.like);
		System.out.println("Replies: " + articleOne.reply);
		// Copy
		articleTwo.like += 1;
		articleTwo.reply += 1;
		System.out.println("分享文章 《" + articleTwo.title + "》");
		System.out.println("收藏文章 《" + articleTwo.title + "》");
		System.out.println("Likes: " + articleTwo.like);
		System.out.println("Replies: " + articleTwo.reply);
		// Copy
		articleThree.like += 1;
		articleThree.reply += 1;
		System.out.println("分享文章 《" + articleThree.title + "》");
		System.out.println("收藏文章 《" + articleThree.title + "》");
		System.out.println("Likes: " + articleThree.like);
		System.out.println("Replies: " + articleThree.reply);
	}

}
