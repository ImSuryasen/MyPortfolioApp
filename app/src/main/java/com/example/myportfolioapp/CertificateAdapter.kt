package com.example.myportfolioapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.certificates.view.*

class CertificateAdapter (private val list : ArrayList<certificate>) : RecyclerView.Adapter<CertificateAdapter.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val certificateImage : ImageView = view.cer_image
        val certificateName : TextView = view.cer_name
        val certificateId : TextView = view.cer_id
        val certificateLink : TextView = view.cer_link
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.certificates, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.certificateName.text = "Name : " + list[position].name
        holder.certificateId.text = "Issued By : " + list[position].cernumber //.cernumber.toString() -> if the cernumber was a integer value, just to convert it to string integer input because by default it takes the string input
        holder.certificateLink.text = "Issued Date : " + list[position].link
        holder.certificateImage.setImageResource(list[position].image)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    /*
    ArrayList<certificate>
    [
        certificate(cisco_image, "CPA_name", "id", "link") // stored at 0 index
        certificate(iit_image, "iit_name", "id", "link") // stored at 1 index

               ]
     *
     *
     *
     */

}