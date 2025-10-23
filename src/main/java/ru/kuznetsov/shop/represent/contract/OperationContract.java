package ru.kuznetsov.shop.represent.contract;

import ru.kuznetsov.shop.represent.dto.OperationDto;
import ru.kuznetsov.shop.represent.dto.OperationPayloadDto;
import ru.kuznetsov.shop.represent.enums.OperationType;

import java.util.List;

public interface OperationContract {

    boolean containsOperation(String operationId);

    OperationDto getOperation(String operationId);

    List<OperationPayloadDto> getOperationData(String operationId);

    List<OperationPayloadDto> getOperationData(OperationDto operation);

    void removeOperations(List<OperationDto> operationIds);

    void removeOperation(OperationDto operation);

    void addOperations(String objectJson,
                       String operationId,
                       OperationType type,
                       int result);

    List<Long> getEntityIdsByOperationId(String operationId);
}
