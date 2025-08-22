package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EXO device specifications for Android Compose previews.
 *
 * This extension provides EXO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EXO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EXO: Any
  get() = object {
      /** EXO EXO_Wave_i716 */
      val EXO_WAVE_I716 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EXO EXO_Wave_i726 */
      val EXO_WAVE_I726 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EXO Wave_i007Kids */
      val WAVE_I007KIDS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EXO Wave_i007T */
      val WAVE_I007T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EXO Wave_i101G */
      val WAVE_I101G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** EXO Wave_i101MC */
      val WAVE_I101MC = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** EXO Wave_i101T4 */
      val WAVE_I101T4 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** EXO Wave_i101u */
      val WAVE_I101U = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
