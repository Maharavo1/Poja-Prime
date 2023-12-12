package com.hei.school.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hei.school.PojaGenerated;
import com.hei.school.repository.model.Dummy;

@PojaGenerated
@Repository
public interface DummyRepository extends JpaRepository<Dummy, String> {

  @Override
  List<Dummy> findAll();
}
