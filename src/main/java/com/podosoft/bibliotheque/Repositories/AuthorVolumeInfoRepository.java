package com.podosoft.bibliotheque.Repositories;

import com.podosoft.bibliotheque.Models.Joined.AuthorVolumeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorVolumeInfoRepository extends JpaRepository<AuthorVolumeInfo, Long> {
}
