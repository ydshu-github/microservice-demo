package com.iflytek.cloud.rpc.provider.dao;


import com.iflytek.cloud.rpc.provider.model.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoDao extends JpaRepository<Demo,Long> {
}
