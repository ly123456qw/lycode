package ly.people_list_online.service;
/**
 * <h2>ִ�й���Peoples��ҵ���߼�</h2>
 * @author liuyan
 *
 */
public interface PeopleService {

	/**
	 * <h2>������Ա��Ϣ</h2>
	 * <p>�����ݿ������һ����Ա��¼����������ӽ����</p>
	 * @param iname
	 * @param isex
	 * @param iage
	 * @return "SUCCESS"����ɹ���"ERROR"����ʧ�ܡ�
	 */
	String doInsertPeople(String iname,String isex,Integer iage);
	
}
