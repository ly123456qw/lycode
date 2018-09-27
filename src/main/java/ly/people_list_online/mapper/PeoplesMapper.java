package ly.people_list_online.mapper;

import ly.people_list_online.modal.Peoples;

public interface PeoplesMapper {
    int deleteByPrimaryKey(String peopleId);

    int insert(Peoples record);

    int insertSelective(Peoples record);

    Peoples selectByPrimaryKey(String peopleId);

    int updateByPrimaryKeySelective(Peoples record);

    int updateByPrimaryKey(Peoples record);
}