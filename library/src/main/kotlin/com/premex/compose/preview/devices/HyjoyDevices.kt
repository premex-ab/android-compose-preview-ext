package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hyjoy device specifications for Android Compose previews.
 *
 * This extension provides Hyjoy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hyjoy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hyjoy: Any
  get() = object {
      /** Hyjoy P11 */
      val P11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Hyjoy P11_EEA */
      val P11_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
