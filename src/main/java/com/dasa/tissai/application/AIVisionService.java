package com.dasa.tissai.application;

import main.java.com.dasa.tissueai.domain.model.Measurement;

public class AIVisionService {

    public Measurement measureTissue(VisionSensor visionSensor, String imagePath) {
        double tissueLength = visionSensor.estimateLengthFromImage(imagePath);
        double weight = visionSensor.readWeightFromDisplay(imagePath);

        return new Measurement(tissueLength, weight);
    }
}
