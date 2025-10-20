package ru.kuznetsov.shop.represent.contract.business;

import ru.kuznetsov.shop.represent.dto.AbstractDto;

import java.util.Collection;
import java.util.List;

public interface AbstractContract<E extends AbstractDto> {

    E getById(Long id);

    List<E> getAll();

    E create(E entity);

    Collection<E> createBatch(Collection<E> entities);

    E update(E entity);

    void delete(Long id);
}
