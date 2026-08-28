package br.jus.tst.esocialjt.copilot;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/copilot")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CopilotController {

    private final CopilotService copilotService;

    /**
     * Endpoint de chat para processar linguagem natural.
     * Recebe texto do usuário e retorna resposta estruturada com ações sugeridas.
     */
    @PostMapping("/chat")
    public ResponseEntity<ChatMessageDTO> conversar(@RequestBody CopilotRequestDTO request) {
        ChatMessageDTO resposta = copilotService.conversar(request);
        return ResponseEntity.ok(resposta);
    }
}
