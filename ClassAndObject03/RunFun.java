package classAndObject3;

public class RunFun {
	// Main Method
	public static void main(String[] args) {
		ArticleSimplified articleOne = new ArticleSimplified("机器之心","Machine Learning",
				"零基础ML建模,自动机器学习平台R2 Learn开放免费试用");
		ArticleSimplified articleTwo = new ArticleSimplified("码思客","Java","类加载与Class对象");
		ArticleSimplified articleThree = new ArticleSimplified("知乎日报","News","变味一时爽，一直变味一直爽");
		
		articleOne.operator();
		articleTwo.operator();
		articleThree.operator();
	}

}
