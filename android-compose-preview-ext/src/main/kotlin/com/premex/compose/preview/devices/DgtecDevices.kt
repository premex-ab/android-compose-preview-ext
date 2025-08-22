package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dgtec device specifications for Android Compose previews.
 *
 * This extension provides Dgtec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dgtec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dgtec: Any
  get() = object {
      /** Dgtec DG101HSTB */
      val DG101HSTB = "spec:width=800,height=1280,unit=px,dpi=160"

  }
