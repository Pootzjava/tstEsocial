package br.jus.tst.esocialjt.copilot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessageDTO {
    private String role; // "user" ou "assistant"
    private String content;
    private Map<String, Object> actionData; // Dados estruturados se for uma ação (ex: criar evento)
    private String actionType; // Tipo de ação sugerida
    private List<SuggestionDTO> suggestions;
}

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SuggestionDTO {
    private String label;
    private String command;
}
