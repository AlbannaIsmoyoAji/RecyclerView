package id.ac.polinema.recyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.recyclerview.R;
import id.ac.polinema.recyclerview.models.Exercise;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ViewHolder> {

    private Context context;
    private List<Exercise> items;
    private static final int LOGO_GANJIL = 1;
    private static final int LOGO_GENAP = 2;

    public ExerciseAdapter(Context context, List<Exercise> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ExerciseAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        if(viewType == LOGO_GENAP){
            view = LayoutInflater.from(context).inflate(R.layout.item_exercise, parent, false);
        }
        else if(viewType == LOGO_GANJIL){
            view = LayoutInflater.from(context).inflate(R.layout.item_exercise_reversed, parent, false);
        }
        return new ExerciseAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseAdapter.ViewHolder holder, int position) {
        Exercise item = items.get(position);
        holder.judul.setText(item.getJudul());
        Picasso.get().load(item.getLogo()).into(holder.logoImage);
        holder.nameText.setText(item.getName());

    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return (position % 4 == 3 || position % 4 == 0) ? LOGO_GENAP : LOGO_GANJIL;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView judul;
        ImageView logoImage;
        TextView nameText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judul_view);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}
