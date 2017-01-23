package com.lzy.common;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

/**
 * 
 * @author Kristijan Georgiev
 * 
 *         Custom converter class that enables usage of LocalDateTime with the
 *         DB
 *
 */

@Converter(autoApply = true)
public class LocalDateTimeAttributeConverter implements AttributeConverter<LocalDate, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalDate localDate) {
		return (localDate == null ? null : Date.valueOf(localDate));
	}

	@Override
	public LocalDate convertToEntityAttribute(Date date) {
		return (date == null ? null : date.toLocalDate());
	}
}
