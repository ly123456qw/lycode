package ly.people_list_online.service;
/**
 * <h2>执行关于Peoples的业务逻辑</h2>
 * @author liuyan
 *
 */
public interface PeopleService {

	/**
	 * <h2>新增人员信息</h2>
	 * <p>在数据库中添加一个人员记录，并返回添加结果。</p>
	 * @param iname
	 * @param isex
	 * @param iage
	 * @return "SUCCESS"代表成功，"ERROR"代表失败。
	 */
	String doInsertPeople(String iname,String isex,Integer iage);
	
}
