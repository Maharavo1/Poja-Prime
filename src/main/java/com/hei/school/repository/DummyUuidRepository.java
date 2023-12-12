package com.hei.school.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hei.school.PojaGenerated;
import com.hei.school.repository.model.DummyUuid;

@PojaGenerated
@Repository
public interface DummyUuidRepository extends JpaRepository<DummyUuid, String> {

  @Override
  Optional<DummyUuid> findById(String id);
}
