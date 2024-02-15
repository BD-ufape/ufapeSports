<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Relations\BelongsTo;

class Pagamento extends Model
{
    use HasFactory;

    protected $fillable = [
        'nome_titular',
        'data_vencimento_cartao',
        'numero_cartao',
        'endereco_entrega',
        'total',
    ];

    public function compra(): BelongsTo
    {
        return $this->belongsTo(Compra::class);
    }
}
