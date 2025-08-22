package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VANKYO device specifications for Android Compose previews.
 *
 * This extension provides VANKYO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VANKYO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VANKYO: Any
  get() = object {
      /** VANKYO MatrixPad-X36 */
      val MATRIXPAD_X36 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VANKYO P10 */
      val P10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VANKYO P31 */
      val P31 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** VANKYO P31-E_EEA */
      val P31_E_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** VANKYO S10 */
      val S10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VANKYO S10_EEA */
      val S10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VANKYO S10_ROW */
      val S10_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VANKYO S20 */
      val S20 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** VANKYO S20_2020 */
      val S20_2020 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** VANKYO S20_EEA */
      val S20_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** VANKYO S20_EEA_2020 */
      val S20_EEA_2020 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** VANKYO S21 */
      val S21 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VANKYO S30 */
      val S30 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** VANKYO S30_2020 */
      val S30_2020 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** VANKYO S30_EEA */
      val S30_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** VANKYO S30_EEA_2020 */
      val S30_EEA_2020 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** VANKYO S7 */
      val S7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VANKYO S7_EEA */
      val S7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VANKYO S8 */
      val S8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VANKYO S8_EEA */
      val S8_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VANKYO Vankyo_S10 */
      val VANKYO_S10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** VANKYO Vankyo_S10_EEA */
      val VANKYO_S10_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** VANKYO VANKYO_S7 */
      val VANKYO_S7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VANKYO VANKYO_S7_EEA */
      val VANKYO_S7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VANKYO VANKYO_S8 */
      val VANKYO_S8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VANKYO VANKYO_S8_EEA */
      val VANKYO_S8_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VANKYO Z1 */
      val Z1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VANKYO Z1_EEA */
      val Z1_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VANKYO Z4 */
      val Z4 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VANKYO Z4_EEA */
      val Z4_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
