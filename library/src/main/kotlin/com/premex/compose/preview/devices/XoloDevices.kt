package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Xolo device specifications for Android Compose previews.
 *
 * This extension provides Xolo device specifications that can be used with @Preview annotations
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
      /** Xolo era1X */
      val ERA1X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Xolo Era5X */
      val ERA5X = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Xolo era_2 */
      val ERA_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Xolo Era_2V */
      val ERA_2V = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Xolo Era_3X */
      val ERA_3X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Xolo Era_4X */
      val ERA_4X = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Xolo Era_4X_2GB */
      val ERA_4X_2GB = "spec:width=720,height=1440,unit=px,dpi=320"

  }
