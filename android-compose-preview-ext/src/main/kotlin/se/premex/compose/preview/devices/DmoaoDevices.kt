package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DMOAO device specifications for Android Compose previews.
 *
 * This extension provides DMOAO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dmoao.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dmoao: Any
  get() = object {
      /** DMOAO D11_EEA */
      val D11_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DMOAO D3_EEA */
      val D3_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DMOAO D3_US */
      val D3_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DMOAO D5_EEA */
      val D5_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DMOAO D5-T-EEA */
      val D5_T_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DMOAO D5-T-US */
      val D5_T_US = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DMOAO D5_US */
      val D5_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DMOAO D6_EEA */
      val D6_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DMOAO D6_US */
      val D6_US = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DMOAO DMOAO_D2_EEA */
      val DMOAO_D2_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DMOAO DMOAO_D2_US */
      val DMOAO_D2_US = "spec:width=800,height=1280,unit=px,dpi=200"

  }
