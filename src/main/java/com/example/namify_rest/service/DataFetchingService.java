package com.example.namify_rest.service;

import com.example.namify_rest.model.AgifyData;
import com.example.namify_rest.model.DataResult;
import com.example.namify_rest.model.GenderizeData;
import com.example.namify_rest.model.NationalizeData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataFetchingService {
    private static final String AGIFY_API_URL = "https://api.agify.io/?name={name}";
    private static final String GENDERIZE_API_URL = "https://api.genderize.io/?name={name}";
    private static final String NATIONALIZE_API_URL = "https://api.nationalize.io/?name={name}";

    private final RestTemplate restTemplate;

    public DataFetchingService() {
        this.restTemplate = new RestTemplate();
    }

    public DataResult fetchAllData(String name) {
        DataResult result = new DataResult();

        // Fetch data from agify.io
        AgifyData agifyData = restTemplate.getForObject(AGIFY_API_URL, AgifyData.class, name);
        result.setAgifyData(agifyData);

        // Fetch data from genderize.io
        GenderizeData genderizeData = restTemplate.getForObject(GENDERIZE_API_URL, GenderizeData.class, name);
        result.setGenderizeData(genderizeData);

        // Fetch data from nationalize.io
        NationalizeData nationalizeData = restTemplate.getForObject(NATIONALIZE_API_URL, NationalizeData.class, name);
        result.setNationalizeData(nationalizeData);

        return result;
    }
}
