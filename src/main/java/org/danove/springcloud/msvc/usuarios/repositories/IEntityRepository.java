package org.danove.springcloud.msvc.usuarios.repositories;

import org.danove.springcloud.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEntityRepository<E extends Usuario> extends JpaRepository<E, Long> {
}
