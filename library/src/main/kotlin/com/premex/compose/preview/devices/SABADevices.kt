package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SABA device specifications for Android Compose previews.
 *
 * This extension provides SABA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SABA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SABA: Any
  get() = object {
      /** SABA longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SABA redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
