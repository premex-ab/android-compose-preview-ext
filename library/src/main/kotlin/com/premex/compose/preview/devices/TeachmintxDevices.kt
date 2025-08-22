package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TeachmintX device specifications for Android Compose previews.
 *
 * This extension provides TeachmintX device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Teachmintx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Teachmintx: Any
  get() = object {
      /** TeachmintX 75W82B */
      val _75W82B = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
