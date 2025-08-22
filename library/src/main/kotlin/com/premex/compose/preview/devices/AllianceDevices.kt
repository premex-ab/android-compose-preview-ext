package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Alliance device specifications for Android Compose previews.
 *
 * This extension provides Alliance device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alliance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alliance: Any
  get() = object {
      /** Alliance DTP9731 */
      val DTP9731 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
