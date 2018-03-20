package com.wenner.com.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenner.com.dto.EmpresaDTO;
import com.wenner.com.responses.Response;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
	
	@PostMapping
	public ResponseEntity<Response<EmpresaDTO>> cadastrar(@RequestBody EmpresaDTO empresaDTO) {
		Response<EmpresaDTO> response = new Response<EmpresaDTO>();
		
		empresaDTO.setId(1L);
		response.setData(empresaDTO);
		return ResponseEntity.ok(response);
	}

}
