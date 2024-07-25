package co.com.prueba.domain.usecase;

import co.com.prueba.domain.model.Cars.Request.CreateCarRequest;
import co.com.prueba.domain.model.Util.Constants;
import co.com.prueba.domain.usecase.util.Validations;

public class CarsValidations {

    public static String validateRequiredFields(CreateCarRequest req) {
        String code = null;
        if (Validations.isEmpty(req.getModelo()) ||
                Validations.isEmpty(req.getPrecio()) ||
                Validations.isEmpty(req.getKilometraje()) ||
                Validations.isEmpty(req.getMarcaid())) {
            return Constants.MISSING_PARAMS_CODE;
        }
        return null;
    }

    public static String validateFormatFields(CreateCarRequest req) {
        String code = null;
        if (Validations.isValidLongDescription(req.getDescripcion()) ||
                Validations.isValidLongModel(req.getModelo())) {
            return Constants.INVALID_LENGTH_FIELD;
        }
        return null;
    }
}
