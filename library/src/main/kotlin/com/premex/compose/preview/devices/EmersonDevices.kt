package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Emerson device specifications for Android Compose previews.
 *
 * This extension provides Emerson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Emerson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Emerson: Any
  get() = object {
      /** Emerson EID-1400 */
      val EID_1400 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
