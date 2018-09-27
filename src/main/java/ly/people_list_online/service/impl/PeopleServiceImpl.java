package ly.people_list_online.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ly.people_list_online.mapper.PeoplesMapper;
import ly.people_list_online.modal.Peoples;
import ly.people_list_online.service.PeopleService;

@Service
public class PeopleServiceImpl implements PeopleService {
	
	@Autowired
	private PeoplesMapper pm;

	@Override
	public String doInsertPeople(String iname, String isex, Integer iage) {
		// TODO 自动生成的方法存根
		Peoples ps=new Peoples();
		ps.setPeoplesId(UUID.randomUUID().toString());
		ps.setPeoplesName(iname);
		ps.setPeoplesAge(iage);
		ps.setPeoplesSex(isex);
		System.out.println(iname);
		try {
			return pm.insert(ps)>0?"SUCCESS":"ERROR";
		} catch (Exception e) {
			
			return "ERROR";
		}
	}

	public PeoplesMapper getPm() {
		return pm;
	}

	public void setPm(PeoplesMapper pm) {
		this.pm = pm;
	}

}
