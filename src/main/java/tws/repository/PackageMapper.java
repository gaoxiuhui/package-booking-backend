package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Packages;
@Mapper
public interface PackageMapper {
    //插入
    void insert(@Param("packages") Packages packages);
}
