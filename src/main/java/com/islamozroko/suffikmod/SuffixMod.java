package com.islamozroko.suffikmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents;
import java.util.Random;

public class SuffixMod implements ClientModInitializer {

    private static final String[] SMILEYS = {
        "--", "-__-", "o_o", "O_O", "0_0", "@@", "x_x", "X_X", "T_T", ";;", ":)", ":D", ":P", ":/", 
        "xD", "-.-", "..", ":)", "=(", "=)", ":(", "D:", ":3", "--+", "++", "*", "(o)(o)", "o_O", "O_o", 
        "0_0", "T_T", ";;", "@@", "x_x", "O_o", "o_O", "--", "-.-", ";n;", ":(", ":-(", ":-c", "u_u", "U_U", 
        "o_0", "0_o", "xP", "XD", ";D", "=D", "o", ":s", ":S", "--#", "--b", "-_-!", "-.-zZ", ":o", "8_8", 
        "8_o", "o_8", "0_8", "8_0", ":L", ":c", ":C", ":q", ":Q", ":p", ":b", ":d", ":B", ":", ":#", ":$", 
        ":!", ":?", ":&", ":@", "(o)(o)", "(o_o)", "(0_0)", "(X_X)", "(@@)", "(;;)", "(T_T)", "(--)", "(-.-)", 
        "(. .)", "(o.o)", "(O.O)", "(0.0)", "(x.x)", "(q_p)", "(p_q)", "(o_q)", "(q_o)", "(p_0)", "(0_p)", 
        "(8_q)", "(q_8)", "(o_p)", "(p_o)", ":oD", ":oP", ";o;", "8o8", "0o0", ".o.", ":&D", ":&P", ":@D", 
        ":@P", "!o!", "!0!", "!8!", "?o?", "?0?", "?8?", "(u_u)", "(u_n)", "(n_n)", "(n_u)", "(c_c)", "(c_o)", 
        "(o_c)", "(0_c)", "(c_0)", "(8_c)", "(c_8)", "(--)", "(--)", "(-.-)", "(-.-)", "(o_o*)", "(o_o)", 
        "(0_0)", "(0_0)", "(8_8)", "(8_8)", "(x_x)", "(x_x)", "(T_T)", "(*T_T)", "(;;)", "(@@)", "(@_@)", 
        "($_$)", "$_$"
    };

    private final Random random = new Random();

    @Override
    public void onInitializeClient() {
        // MODIFY_CHAT регистрирует событие для изменения текста
        ClientSendMessageEvents.MODIFY_CHAT.register((message) -> {
            if (message != null && !message.isEmpty()) {
                String randomSmiley = SMILEYS[random.nextInt(SMILEYS.length)];
                return message + " " + randomSmiley;
            }
            return message;
        });
    }
}
