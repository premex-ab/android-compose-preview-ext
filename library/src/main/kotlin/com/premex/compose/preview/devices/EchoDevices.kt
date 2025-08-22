package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Echo device specifications for Android Compose previews.
 *
 * This extension provides Echo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Echo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Echo: Any
  get() = object {
      /** Echo ECHO_HORIZON_LITE */
      val ECHO_HORIZON_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

  }
