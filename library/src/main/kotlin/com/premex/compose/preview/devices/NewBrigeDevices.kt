package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NewBrige device specifications for Android Compose previews.
 *
 * This extension provides NewBrige device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NewBrige.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NewBrige: Any
  get() = object {
      /** NewBrige NBTB101b */
      val NBTB101B = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
