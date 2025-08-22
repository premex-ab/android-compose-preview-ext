package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XOLO device specifications for Android Compose previews.
 *
 * This extension provides XOLO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xolo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xolo: Any
  get() = object {
      /** XOLO XE2X */
      val XE2X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** XOLO XE2X3GB */
      val XE2X3GB = "spec:width=720,height=1280,unit=px,dpi=320"

      /** XOLO XOLO_era_4K */
      val XOLO_ERA_4K = "spec:width=720,height=1280,unit=px,dpi=320"

  }
