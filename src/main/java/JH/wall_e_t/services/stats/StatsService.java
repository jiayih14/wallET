package JH.wall_e_t.services.stats;

import JH.wall_e_t.dto.GraphDTO;
import JH.wall_e_t.dto.StatsDTO;

public interface StatsService {

    GraphDTO getChartData();

    StatsDTO getStats();
}
