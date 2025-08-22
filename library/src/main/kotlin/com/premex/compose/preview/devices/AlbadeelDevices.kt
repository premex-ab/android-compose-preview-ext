package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Albadeel device specifications for Android Compose previews.
 *
 * This extension provides Albadeel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Albadeel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Albadeel: Any
  get() = object {
      /** Albadeel longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Albadeel redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
