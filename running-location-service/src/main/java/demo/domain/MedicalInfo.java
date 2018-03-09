package demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Embeddable
@RequiredArgsConstructor
public class MedicalInfo {

    @Column(insertable = false, updatable = false)
    private final String runningId;

    //blood flow rate
    private long bfr;
    private long fmi;

    public MedicalInfo() {
        this.runningId = "";
    }
}
