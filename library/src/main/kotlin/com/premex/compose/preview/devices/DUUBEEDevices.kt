package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DUUBEE device specifications for Android Compose previews.
 *
 * This extension provides DUUBEE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DUUBEE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DUUBEE: Any
  get() = object {
      /** DUUBEE DT1052 */
      val DT1052 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
