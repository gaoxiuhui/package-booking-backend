package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.Packages;
import tws.repository.PackageMapper;

@Service
public class PackageService {
    @Autowired
    private PackageMapper packageMapper;
    // 插入  post  添加值
    public void insertPackage(Packages packages){
        packageMapper.insert(packages);
    }
}
