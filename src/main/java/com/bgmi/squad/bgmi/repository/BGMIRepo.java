package com.bgmi.squad.bgmi.repository;

import com.bgmi.squad.bgmi.bean.BGMIDetails;
import com.bgmi.squad.bgmi.bean.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BGMIRepo extends JpaRepository<BGMIDetails, Integer> {

}
