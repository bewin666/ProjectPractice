package cn.com.project.mapper;

import org.apache.ibatis.annotations.Select;

import cn.com.project.model.AdminInfo;

public interface TestMapper {
	@Select("select admin_name from admin_info")
	String findName();
}
