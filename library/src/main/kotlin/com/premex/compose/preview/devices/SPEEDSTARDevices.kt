package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SPEEDSTAR device specifications for Android Compose previews.
 *
 * This extension provides SPEEDSTAR device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SPEEDSTAR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SPEEDSTAR: Any
  get() = object {
      /** SPEEDSTAR StarTab_A324G */
      val STARTAB_A324G = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
