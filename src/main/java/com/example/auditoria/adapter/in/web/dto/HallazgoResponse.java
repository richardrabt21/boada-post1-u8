package com.example.auditoria.adapter.in.web.dto;

import com.example.auditoria.domain.entity.HallazgoAuditoria;
import java.time.LocalDate;

public record HallazgoResponse(String id, String titulo, String descripcion, String areaResponsable, String severidad, LocalDate fechaDeteccion, String estado) {
    public static HallazgoResponse fromDomain(HallazgoAuditoria h) {
        return new HallazgoResponse(
            h.getId().toString(), h.getTitulo(), h.getDescripcion(), h.getAreaResponsable(), 
            h.getSeveridad().name(), h.getFechaDeteccion(), h.getEstado().name()
        );
    }
}