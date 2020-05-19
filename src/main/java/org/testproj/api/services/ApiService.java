package org.testproj.api.services;

import java.util.function.BiFunction;

import org.springframework.stereotype.Service;
import org.testproj.api.models.Operand;
import org.testproj.api.models.OperationResult;

@Service
public class ApiService {

	public OperationResult sum(Operand op) throws Exception {	
		return new OperationResult(getResult(op,(a,b)->a+b)+"");
	}

	public OperationResult diff(Operand op) throws Exception {
		return new OperationResult(getResult(op,(a,b)->a-b)+"");
	}
	
	private Integer getResult(Operand op, BiFunction<Integer,Integer,Integer> operation) throws Exception {
		Integer x;
		Integer y;
		try {
			x= Integer.parseInt(op.getX());
			y= Integer.parseInt(op.getY());
		}catch(Exception e){
			throw new Exception("integer value allowed in x and y string field"); 
		}
		return operation.apply(x,y);
	}

}
