package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ditecma device specifications for Android Compose previews.
 *
 * This extension provides Ditecma device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ditecma.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ditecma: Any
  get() = object {
      /** Ditecma M1092RV5 */
      val M1092RV5 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
