//��Ԫ������ڷ�ҳҵ���߼���ʹ��
/*
	���󣺸���һ��46�����ݣ�Ҫ��ÿһҲ���10�����ݣ����㣺һ���ж���ҳ��

*/
class PageDemo 
{
	public static void main(String[] args) 
	{
		int totalCount = 49;
		int pageSize = 10;
		//��ҳ��
		int resultPagenumer = totalCount % pageSize ==0 ? totalCount/pageSize : totalCount/pageSize + 1; 
		System.out.println(resultPagenumer);
		//��ǰҳ
		int currentPage = 1;
		//��һҳ
		int prevPage = currentPage == 1 ? 1 : currentPage - 1;
		System.out.println(prevPage);
		//��һҳ
		int nextPage = currentPage == resultPagenumer ? resultPagenumer : currentPage + 1;
		System.out.println(nextPage);



	}
}
