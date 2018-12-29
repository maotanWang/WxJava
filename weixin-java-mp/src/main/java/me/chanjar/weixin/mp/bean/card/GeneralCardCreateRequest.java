package me.chanjar.weixin.mp.bean.card;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;

import java.io.Serializable;

/**
 * .
 * @author leeis
 * @Date 2018/12/29
 */
@Data
public class GeneralCardCreateRequest extends CardCreateRequest implements Serializable {
  @SerializedName("card_type")
  private String cardType = "GENERAL_COUPON";

  @SerializedName("general_coupon")
  private GeneralCard generalCoupon;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
