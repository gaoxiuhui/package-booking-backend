package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Packages;
import tws.service.PackageService;

import java.net.URI;

@RestController
@RequestMapping("/package")
public class PackageController {

    @Autowired
    private PackageService packageService;

    // 插入  post  添加值
    @PostMapping("")
    public ResponseEntity<Packages> insert(@RequestBody Packages packages) {
        packageService.insertPackage(packages);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
