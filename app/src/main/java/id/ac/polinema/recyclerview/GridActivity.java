package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.GridAdapter;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class GridActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid);

		RecyclerView teamsView = findViewById(R.id.rv_teams);

		List<TeamLogo> teams = new ArrayList<>();
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));
		teams.add(new TeamLogo("https://seeklogo.com/images/M/manchester-united-logo-F14DA1FCCD-seeklogo.com.png", "Man. United"));
		teams.add(new TeamLogo("https://seeklogo.com/images/C/chelsea-fc-logo-E96F8E4F92-seeklogo.com.png", "Chelsea"));
		teams.add(new TeamLogo("https://seeklogo.com/images/T/Tottenham_Hotspur-logo-0303D43FA4-seeklogo.com.png", "Tottenham"));
		teams.add(new TeamLogo("https://seeklogo.com/images/A/arsenal-fc-logo-1E7333F23E-seeklogo.com.png", "Arsenal"));
		teams.add(new TeamLogo("https://seeklogo.com/images/A/afc-bournemouth-logo-FAA541D485-seeklogo.com.png", "Afc Bournemouth"));
		teams.add(new TeamLogo("https://seeklogo.com/images/N/norwich-city-fc-logo-00D8B4333F-seeklogo.com.png", "Norwich"));
		teams.add(new TeamLogo("https://seeklogo.com/images/W/watford-fc-logo-7CF21B8C10-seeklogo.com.png", "Watford"));
		teams.add(new TeamLogo("https://seeklogo.com/images/E/everton-football-club-logo-2D8779FBA9-seeklogo.com.png", "Everton"));
		teams.add(new TeamLogo("https://seeklogo.com/images/N/newcastle-utd-fc-logo-9A813A7446-seeklogo.com.png", "Newcastle"));
		teams.add(new TeamLogo("https://seeklogo.com/images/B/burnley-football-club-logo-A999E3A51D-seeklogo.com.png", "Burnley"));
		teams.add(new TeamLogo("https://seeklogo.com/images/W/wolves-logo-54BADC5EB5-seeklogo.com.png", "Wolves"));
		teams.add(new TeamLogo("https://seeklogo.com/images/L/leicester-city-fc-logo-FD9C3CA26E-seeklogo.com.png", "Leicester"));
		teams.add(new TeamLogo("https://seeklogo.com/images/W/west-ham-utd-logo-86820B6A00-seeklogo.com.png", "West Ham United"));
		teams.add(new TeamLogo("https://seeklogo.com/images/C/crystal-palace-fc-logo-6F4DFE5EF9-seeklogo.com.png", "Crystal Palace"));
		teams.add(new TeamLogo("https://seeklogo.com/images/S/southampton-fc-logo-4B19787C71-seeklogo.com.png", "Southampton"));
		teams.add(new TeamLogo("https://seeklogo.com/images/B/brighton-hove-albion-f-c-logo-3368C7D2CB-seeklogo.com.png", "Brighton"));
		teams.add(new TeamLogo("https://seeklogo.com/images/A/aston-villa-football-club-logo-87EA15CC94-seeklogo.com.png", "Aston Villa"));
		teams.add(new TeamLogo("https://seeklogo.com/images/S/sheffield-utd-fc-logo-CD59BF0954-seeklogo.com.png", "Sheff utd"));

		GridAdapter adapter = new GridAdapter(this, teams);
		teamsView.setAdapter(adapter);

		RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
		teamsView.setLayoutManager(layoutManager);
	}
}
