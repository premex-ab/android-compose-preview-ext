package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OANGCC device specifications for Android Compose previews.
 *
 * This extension provides OANGCC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OANGCC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OANGCC: Any
  get() = object {
      /** OANGCC A6_EEA */
      val A6_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** OANGCC A6_US */
      val A6_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** OANGCC Tab-A8_EEA */
      val TAB_A8_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
