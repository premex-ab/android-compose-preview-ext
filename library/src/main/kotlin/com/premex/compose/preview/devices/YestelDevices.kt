package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Yestel device specifications for Android Compose previews.
 *
 * This extension provides Yestel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yestel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yestel: Any
  get() = object {
      /** Yestel T13_T_EEA */
      val T13_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Yestel T5_0 */
      val T5_0 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Yestel T5_EEA_0 */
      val T5_EEA_0 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Yestel X2_T_EEA */
      val X2_T_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Yestel X2_T_US */
      val X2_T_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Yestel X7_EEA */
      val X7_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
