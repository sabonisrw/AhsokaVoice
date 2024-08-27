package com.AhsokaVoice.repositories;


import com.AhsokaVoice.models.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<ImageModel, Long> {

}
