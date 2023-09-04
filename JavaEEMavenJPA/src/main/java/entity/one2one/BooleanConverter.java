package entity.one2one;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BooleanConverter implements AttributeConverter<Boolean, Integer>  {
	// 存入資料庫欄位的參數 (true -> 1 ; false -> -1)
	@Override
	public Integer convertToDatabaseColumn(Boolean attribute) {
		System.out.println("BooleanConverter 存入資料庫欄位的參數 (true -> 1 ; false -> -1): " + attribute);
		if(Boolean.TRUE.equals(attribute)) {
			return 1;
		} else {
			return -1;
		}
	}
	
	// 查詢資料庫欄位回傳的參數 (1 -> true ; false -> -1) 
	@Override
	public Boolean convertToEntityAttribute(Integer dbData) {
		System.out.println("BooleanConverter 查詢資料庫欄位回傳的參數 (1 -> true ; false -> -1): " + dbData);
		if(dbData == null) {
			return Boolean.FALSE;
		} else {
			if(dbData == 1) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		}		
	}	
	
}
