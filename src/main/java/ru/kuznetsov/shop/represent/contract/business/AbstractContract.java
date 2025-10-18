package ru.kuznetsov.shop.represent.contract.business;

import ru.kuznetsov.shop.represent.dto.AbstractDto;

import java.util.List;

public interface AbstractContract<E extends AbstractDto> {

    E getById(Long id);

    List<E> getAll();

    boolean create(E entity);

    E update(E entity);

    void delete(Long id);
}
