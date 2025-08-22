package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LINNEX device specifications for Android Compose previews.
 *
 * This extension provides LINNEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Linnex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Linnex: Any
  get() = object {
      /** LINNEX LX50 */
      val LX50 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
