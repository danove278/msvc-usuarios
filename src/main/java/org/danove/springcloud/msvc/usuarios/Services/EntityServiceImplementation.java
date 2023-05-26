package org.danove.springcloud.msvc.usuarios.Services;

import org.danove.springcloud.msvc.usuarios.models.entity.Usuario;
import org.danove.springcloud.msvc.usuarios.repositories.IEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EntityServiceImplementation<E extends Usuario, R extends IEntityRepository<E> > implements IEntityService<E>{

    @Autowired
    private R repo;

    @Transactional(readOnly = true)
    @Override
    public List<E> findAll() {
        return this.repo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<E> findByID(Long id) {
        return this.repo.findById(id);
    }

    @Override
    @Transactional
    public E create(E entity) {
        return this.repo.save(entity);
    }

    @Override
    @Transactional
    public void removeById(Long id) {
        this.repo.deleteById(id);
    }

    @Override
    @Transactional
    public void removeByObject(E entity) {
        this.repo.delete(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<E> findAll(Pageable pageable) {
        return this.repo.findAll(pageable);
    }

}
