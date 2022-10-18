package dev.mmccall.multicalc;

import dev.mmccall.multicalc.math.Expression;
import org.jetbrains.annotations.NotNull;

public class HistoryEntry implements HTMLRenderable {
    public HistoryEntry(@NotNull Expression input) {
        this.input = input;
        this.output = input.evaluate();
    }

    @Override
    public String toHTML() {
        return String.format("""
                    <div style="border-bottom: 0.1rem dotted black">
                        <div style="width: fit-content; margin-right: auto; padding: 0.5rem;">
                            %s
                        </div>
                    </div>
                    <div style="border-bottom: 0.1rem dotted black">
                        <div style="width: fit-content; margin-left: auto; padding: 0.5rem;">
                            %s
                        </div>
                    </div>
                """, HTML.math(input.toHTML()), HTML.math(output.toHTML()));
    }

    @NotNull Expression input;
    @NotNull Expression output;
}
