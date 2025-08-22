package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Palm device specifications for Android Compose previews.
 *
 * This extension provides Palm device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Palm.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Palm: Any
  get() = object {
      /** Palm Pepito */
      val PEPITO = "spec:width=720,height=1280,unit=px,dpi=320"

  }
