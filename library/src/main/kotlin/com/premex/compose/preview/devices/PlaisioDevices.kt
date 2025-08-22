package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Plaisio device specifications for Android Compose previews.
 *
 * This extension provides Plaisio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Plaisio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Plaisio: Any
  get() = object {
      /** Plaisio Earth3G */
      val EARTH3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Plaisio Turbox_S3 */
      val TURBOX_S3 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
