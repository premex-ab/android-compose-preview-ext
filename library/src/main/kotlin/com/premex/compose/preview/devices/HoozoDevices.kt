package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hoozo device specifications for Android Compose previews.
 *
 * This extension provides Hoozo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hoozo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hoozo: Any
  get() = object {
      /** Hoozo MR768 */
      val MR768 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Hoozo T10A */
      val T10A = "spec:width=1200,height=2000,unit=px,dpi=180"

  }
