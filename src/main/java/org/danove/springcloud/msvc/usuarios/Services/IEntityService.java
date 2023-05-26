package org.danove.springcloud.msvc.usuarios.Services;

import org.danove.springcloud.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IEntityService<E> {
    List<E> findAll();

    Optional<E> findByID(Long id);

    E create(E entity);

    void removeById(Long id);

    void removeByObject(E entity);


    // import org.springframework.data.domain.Page;
// import org.springframework.data.domain.Pageable;
    Page<E> findAll(Pageable pageable);
}