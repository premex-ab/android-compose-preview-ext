package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IRIS device specifications for Android Compose previews.
 *
 * This extension provides IRIS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IRIS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IRIS: Any
  get() = object {
      /** IRIS anaheim */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** IRIS beomil */
      val BEOMIL = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** IRIS G7060 */
      val G7060 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** IRIS G7100 */
      val G7100 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** IRIS G8060 */
      val G8060 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** IRIS IS2PLUS */
      val IS2PLUS = "spec:width=480,height=800,unit=px,dpi=240"

      /** IRIS IS2S */
      val IS2S = "spec:width=480,height=854,unit=px,dpi=240"

      /** IRIS IS6Plus */
      val IS6PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** IRIS N30 */
      val N30 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** IRIS NEXT_P */
      val NEXT_P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** IRIS NEXT_P_PLUS */
      val NEXT_P_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** IRIS Next_P_PRO */
      val NEXT_P_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** IRIS NEXT_U */
      val NEXT_U = "spec:width=720,height=1440,unit=px,dpi=320"

      /** IRIS SW4H_FF */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** IRIS SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** IRIS umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** IRIS V10 */
      val V10 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** IRIS V50 */
      val V50 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** IRIS VOX_4s */
      val VOX_4S = "spec:width=480,height=854,unit=px,dpi=240"

      /** IRIS Vox_5S */
      val VOX_5S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** IRIS VOX_Alpha */
      val VOX_ALPHA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** IRIS VOX_Alpha_Plus */
      val VOX_ALPHA_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** IRIS VOX_Energy */
      val VOX_ENERGY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** IRIS VOX_POP_plus */
      val VOX_POP_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** IRIS VOX_POP_Pro */
      val VOX_POP_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** IRIS VOX_STEEL_Plus */
      val VOX_STEEL_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** IRIS VOX_STEEL_Plus_V2 */
      val VOX_STEEL_PLUS_V2 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
