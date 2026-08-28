package br.jus.tst.esocialjt.copilot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CopilotRequestDTO {
    private String mensagem;
    private String tenantId;
}
