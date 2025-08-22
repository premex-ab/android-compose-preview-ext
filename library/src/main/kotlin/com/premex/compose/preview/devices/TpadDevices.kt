package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TPAD device specifications for Android Compose previews.
 *
 * This extension provides TPAD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tpad: Any
  get() = object {
      /** TPAD TPAD-T30B */
      val TPAD_T30B = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
