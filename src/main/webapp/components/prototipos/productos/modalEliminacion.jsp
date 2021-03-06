<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal fade" id="modalEliminacion" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Eliminar pastel</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
            </div>
            <div class="modal-body">
                ¿Deseas eliminar el producto <b>{{infoEliminacion.name}}</b>?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-pale" data-bs-dismiss="modal"><i data-feather="x"></i>&nbsp;<span class="align-middle">Cerrar</span></button>
                <button type="button" class="btn btn-mauvelous" ng-click="eliminar(infoEliminacion.index)"><i data-feather="trash-2"></i>&nbsp;<span class="align-middle">Eliminar</span></button>
            </div>
        </div>
    </div>
</div>