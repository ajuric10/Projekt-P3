package ffos.ajuric_20.pasmineapk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


//Za zakomentiratu Filter metodu treba vratiti "implements Filterable"
public class PasmineAdapter extends RecyclerView.Adapter<PasmineAdapter.Red>  {

    private List<Pasmine> podaci;
    private List<Pasmine> noviPodaci;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public PasmineAdapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci = new ArrayList<>();
    }

    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        noviPodaci = new ArrayList<>(podaci);
        View view = mInflater.inflate(R.layout.red, roditelj, false);
        return new Red(view);
    }


    @Override
    public void onBindViewHolder(Red red, int position) {
        Pasmine p = podaci.get(position);

        red.naziv.setText(p.getNazivPasmine());
        red.kategorija.setText(p.getKategorijaVelicine());
        red.vijek.setText(p.getZivotniVijek());
        red.drzava.setText(p.getDrzava());
        red.anotacija.setText(p.getSveAnotacije());

    }

    @Override
    public int getItemCount() {
        return podaci==null ? 0 : podaci.size();
    }


    // Pohranjuje i reciklira pogled kako se prolazi kroz listu
    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView naziv;
        private TextView kategorija;
        private TextView vijek;
        private TextView drzava;
        private TextView anotacija;

        Red(View itemView) {
            super(itemView);

            naziv = itemView.findViewById(R.id.naziv);
            kategorija = itemView.findViewById(R.id.kategorija);
            vijek = itemView.findViewById(R.id.vijek);
            drzava = itemView.findViewById(R.id.drzava);
            anotacija = itemView.findViewById(R.id.anotacija);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }


    public Pasmine getItem(int id) {
        return podaci.get(id);
    }

    public void setPodaci(List<Pasmine> itemList) {
        this.podaci = itemList;
    }


    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }


    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }


};




