package ru.lechif.HiChatDden.utility.db;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
public abstract class Auditable<U> {
    @CreatedBy
    protected U createBy;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createDate;
    @LastModifiedBy
    protected U updateBy;
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected U updateDate;
}