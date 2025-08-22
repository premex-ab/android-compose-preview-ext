package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COOLPAD device specifications for Android Compose previews.
 *
 * This extension provides COOLPAD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COOLPAD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COOLPAD: Any
  get() = object {
      /** COOLPAD COOLPAD_C202 */
      val COOLPAD_C202 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** COOLPAD COOLPAD_C203 */
      val COOLPAD_C203 = "spec:width=720,height=1640,unit=px,dpi=320"

  }
