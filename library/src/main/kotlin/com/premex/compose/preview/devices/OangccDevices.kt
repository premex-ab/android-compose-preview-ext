package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Oangcc device specifications for Android Compose previews.
 *
 * This extension provides Oangcc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Oangcc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Oangcc: Any
  get() = object {
      /** Oangcc A13_EEA */
      val A13_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Oangcc A13_US */
      val A13_US = "spec:width=800,height=1280,unit=px,dpi=200"

      /** Oangcc A9-EEA */
      val A9_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Oangcc A9_US */
      val A9_US = "spec:width=800,height=1280,unit=px,dpi=210"

      /** Oangcc Tab_A6 */
      val TAB_A6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Oangcc Tab_A6_EEA */
      val TAB_A6_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Oangcc TAB_A8_EEA_T */
      val TAB_A8_EEA_T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Oangcc TAB_A8_T */
      val TAB_A8_T = "spec:width=600,height=1024,unit=px,dpi=160"

  }
