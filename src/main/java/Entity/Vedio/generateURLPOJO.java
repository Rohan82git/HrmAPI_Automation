package Entity.Vedio;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class generateURLPOJO {
    @Builder
    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public class generateURL_Root{
        public String originalFilename;
        public String fileType;
        public String mimeType;
    }
}
