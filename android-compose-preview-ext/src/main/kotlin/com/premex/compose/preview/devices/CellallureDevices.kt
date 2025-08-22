package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cellallure device specifications for Android Compose previews.
 *
 * This extension provides Cellallure device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cellallure.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cellallure: Any
  get() = object {
      /** Cellallure Earn */
      val EARN = "spec:width=720,height=1280,unit=px,dpi=320"

  }
