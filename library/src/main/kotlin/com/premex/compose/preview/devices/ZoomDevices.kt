package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZOOM device specifications for Android Compose previews.
 *
 * This extension provides ZOOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zoom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zoom: Any
  get() = object {
      /** ZOOM ULTRA */
      val ULTRA = "spec:width=600,height=1024,unit=px,dpi=213"

      /** ZOOM ULTRA_Plus */
      val ULTRA_PLUS = "spec:width=600,height=1024,unit=px,dpi=220"

  }
