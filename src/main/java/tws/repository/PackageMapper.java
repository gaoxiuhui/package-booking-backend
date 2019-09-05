package tws.repository;

import org.apache.ibatis.annotations.Param;
import tws.entity.Packages;

public interface PackageMapper {
    //插入
    void insert(@Param("package") Packages packages);
}
