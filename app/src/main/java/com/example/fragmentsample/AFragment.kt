package com.example.fragmentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    // レイアウトを返すには、XML で定義したレイアウト リソースからインフレートできます。
    // これを行うため、onCreateView() から LayoutInflater オブジェクトが提供されます。
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, // 親のViewGroup
                              savedInstanceState: Bundle? // フラグメントが再開された場合にフラグメントの前のインスタンスに関する情報を提供する Bundle
    ): View? {
        return inflater.inflate(R.layout.fragment_a, container, false)
    }
}