package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Precision device specifications for Android Compose previews.
 *
 * This extension provides Precision device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Precision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Precision: Any
  get() = object {
      /** Precision PBTAB-100 */
      val PBTAB_100 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
