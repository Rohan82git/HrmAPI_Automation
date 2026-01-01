package Entity.Vedio;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class VideoPOJO {

    @Builder
    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public class vedioRoot{
        public String questionId;
        public String type;
        public String skill;
        public String jobRoleId;
        public String experience;
        public String jobApplicationId;
        public Integer timeSpent;
        public Integer fullScreenExitCount;
        public Integer tabSwitchCount;
        public String candidateAnswer;
        public CopyPasteAnalysis copyPasteAnalysis;
        public boolean hasCopyPasteAnalysis;

        @Builder
        @Getter
        @Setter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public class CopyBreakdown{
            public QuestionCopies questionCopies;
            public OptionCopies optionCopies;
            public FullQuestionCopies fullQuestionCopies;
        }

        @Builder
        @Getter
        @Setter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public class CopyPasteAnalysis{
            public Integer totalDuration;
            public Integer totalCopyEvents;
            public Integer questionCopyCount;
            public Integer optionCopyCount;
            public Integer fullQuestionCopyCount;
            public boolean hasQuestionCopying;
            public boolean hasOptionCopying;
            public boolean hasFullQuestionCopying;
            public Integer riskScore;
            public String riskLevel;
            public boolean isSuspicious;
            public CopyBreakdown copyBreakdown;
            public String sessionId;
            public String analysisVersion;
            public String timestamp;
        }

        @Builder
        @Getter
        @Setter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public class FullQuestionCopies{
            public Integer count;
            public Integer averageLength;
            public ArrayList<Object> timestamps;
        }

        @Builder
        @Getter
        @Setter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public class OptionCopies{
            public Integer count;
            public Integer averageLength;
            public ArrayList<Object> timestamps;
        }

        @Builder
        @Getter
        @Setter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public class QuestionCopies{
            public Integer count;
            public Integer averageLength;
            public ArrayList<Object> timestamps;
        }
    }

}
