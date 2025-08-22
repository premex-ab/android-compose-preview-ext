package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNISCOPE device specifications for Android Compose previews.
 *
 * This extension provides UNISCOPE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UNISCOPE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UNISCOPE: Any
  get() = object {
      /** UNISCOPE s6w */
      val S6W = "spec:width=800,height=1280,unit=px,dpi=160"

  }
