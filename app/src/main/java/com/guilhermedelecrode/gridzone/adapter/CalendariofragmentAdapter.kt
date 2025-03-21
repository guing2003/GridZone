import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.model.Calendario

class CalendarioFragmentAdapter(private val listaCalendario: List<Calendario>) :
    RecyclerView.Adapter<CalendarioFragmentAdapter.CalendarioViewHolder>() {


    class CalendarioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val imgPiloto: ImageView = itemView.findViewById(R.id.imagem_piloto_fragment)
        val nomeEquipe: TextView = itemView.findViewById(R.id.nome_calendario_fragment)
        val data: TextView = itemView.findViewById(R.id.data_calendario_fragment)



    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarioViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.calendario_item_layout, parent, false)
        return CalendarioViewHolder(view)
    }


    override fun onBindViewHolder(holder: CalendarioViewHolder, position: Int) {
        val calendario = listaCalendario[position]
        //holder.imgCalendario.text =
        holder.nomeEquipe.text = calendario.nome
        holder.data.text = calendario.data


    }


    override fun getItemCount() = listaCalendario.size
}
