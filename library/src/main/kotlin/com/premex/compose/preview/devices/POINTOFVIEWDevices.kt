package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POINT_OF_VIEW device specifications for Android Compose previews.
 *
 * This extension provides POINT_OF_VIEW device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.POINTOFVIEW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.POINTOFVIEW: Any
  get() = object {
      /** POINT_OF_VIEW TAB-P10232-3G */
      val TAB_P10232_3G = "spec:width=800,height=1280,unit=px,dpi=213"

  }
