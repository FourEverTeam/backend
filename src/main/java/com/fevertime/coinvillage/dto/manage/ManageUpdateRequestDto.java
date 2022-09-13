package com.fevertime.coinvillage.dto.manage;

import com.fevertime.coinvillage.domain.Job.Job;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ManageUpdateRequestDto {
    private Job job;
}
