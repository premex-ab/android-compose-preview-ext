package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ADVANCE device specifications for Android Compose previews.
 *
 * This extension provides ADVANCE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ADVANCE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ADVANCE: Any
  get() = object {
      /** ADVANCE HL9000 */
      val HL9000 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** ADVANCE NP6050 */
      val NP6050 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** ADVANCE NP6070 */
      val NP6070 = "spec:width=1200,height=1920,unit=px,dpi=340"

      /** ADVANCE Pr5747 */
      val PR5747 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVANCE PR5860 */
      val PR5860 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ADVANCE Pr6146 */
      val PR6146 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVANCE PR6149 */
      val PR6149 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVANCE PR6152 */
      val PR6152 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ADVANCE PR6152-ADV */
      val PR6152_ADV = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVANCE SP4702 */
      val SP4702 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** ADVANCE SP4703 */
      val SP4703 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ADVANCE SP4871 */
      val SP4871 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ADVANCE SP4872 */
      val SP4872 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ADVANCE SP5702 */
      val SP5702 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** ADVANCE SP5705 */
      val SP5705 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ADVANCE SP5712 */
      val SP5712 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** ADVANCE SP5713 */
      val SP5713 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** ADVANCE Sp5730 */
      val SP5730 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ADVANCE SP5732 */
      val SP5732 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** ADVANCE SP5736 */
      val SP5736 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ADVANCE SP5760 */
      val SP5760 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** ADVANCE SP5775 */
      val SP5775 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** ADVANCE SP5776 */
      val SP5776 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** ADVANCE SP7248 */
      val SP7248 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVANCE SP7348 */
      val SP7348 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** ADVANCE Tablet_adv_v1 */
      val TABLET_ADV_V1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVANCE TR3947 */
      val TR3947 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVANCE TR5994 */
      val TR5994 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVANCE TR5996 */
      val TR5996 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVANCE TR6948 */
      val TR6948 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVANCE TR7988 */
      val TR7988 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVANCE TR7989 */
      val TR7989 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVANCE TR7990 */
      val TR7990 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVANCE TR7998 */
      val TR7998 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ADVANCE TR8990 */
      val TR8990 = "spec:width=600,height=1024,unit=px,dpi=200"

  }
