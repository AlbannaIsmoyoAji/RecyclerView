package id.ac.polinema.recyclerview;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.GridLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;
        import android.os.Bundle;
        import java.util.ArrayList;
        import java.util.List;
        import id.ac.polinema.recyclerview.adapters.GridAdapter;
        import id.ac.polinema.recyclerview.adapters.LatihanAdapter;
        import id.ac.polinema.recyclerview.models.Latihan;
        import id.ac.polinema.recyclerview.models.TeamLogo;

public class LatihanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<Latihan> teams = new ArrayList<>();
        teams.add(new Latihan("https://upload.wikimedia.org/wikipedia/en/thumb/7/7f/RBC_Royal_Bank.svg/1200px-RBC_Royal_Bank.svg.png", "RBC News", "A City Living Under The Shadow"));
        teams.add(new Latihan("https://images.squarespace-cdn.com/content/v1/5436a303e4b03395a9c75ebc/1525311215317-QA6HMPP97IBSUFV3RR8N/ke17ZwdGBToddI8pDm48kDGihCofVLFFQ3A_62QlDaF7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1UdKJhKFH3AuJnhryvAnjP5ItMcsXfXrRYcAvHbZOeqcY3WUfc_ZsVm9Mi1E6FasEnQ/Appealing-Nytimes-Logo-43-On-Free-Logo-Design-with-Nytimes-Logo-945x1221.jpg.png", "NY Times", "One Problem dor Democratic Leaders"));
        teams.add(new Latihan("https://vignette.wikia.nocookie.net/tvfanon6528/images/0/0e/BBC_World_News_%282019-.n.v.%29.png/revision/latest?cb=20190715171938", "BBC World", "The Golden Secret to Better Breakfast"));
        teams.add(new Latihan("https://www.freepnglogos.com/uploads/nbc-png-logo/play-games-nbc-png-logo-16.png", "NBC Nightly", "How to Plan Your First Ski Vacation"));
        teams.add(new Latihan("https://upload.wikimedia.org/wikipedia/en/thumb/7/7f/RBC_Royal_Bank.svg/1200px-RBC_Royal_Bank.svg.png", "RBC News", "How Social Isolation Is Killing Us"));
        teams.add(new Latihan("https://vignette.wikia.nocookie.net/tvfanon6528/images/0/0e/BBC_World_News_%282019-.n.v.%29.png/revision/latest?cb=20190715171938", "BBC World", "Use Labels To Sort Messages in Facebook"));

        LatihanAdapter adapter = new LatihanAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
