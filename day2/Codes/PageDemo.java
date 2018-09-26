//三元运算符在分页业务逻辑中使用
/*
	需求：给出一共46条数据，要求每一也最多10条数据，计算：一共有多少页。

*/
class PageDemo 
{
	public static void main(String[] args) 
	{
		int totalCount = 49;
		int pageSize = 10;
		//总页数
		int resultPagenumer = totalCount % pageSize ==0 ? totalCount/pageSize : totalCount/pageSize + 1; 
		System.out.println(resultPagenumer);
		//当前页
		int currentPage = 1;
		//上一页
		int prevPage = currentPage == 1 ? 1 : currentPage - 1;
		System.out.println(prevPage);
		//下一页
		int nextPage = currentPage == resultPagenumer ? resultPagenumer : currentPage + 1;
		System.out.println(nextPage);



	}
}
