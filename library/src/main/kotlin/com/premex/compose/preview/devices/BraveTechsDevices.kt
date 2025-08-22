package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BraveTechs device specifications for Android Compose previews.
 *
 * This extension provides BraveTechs device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BraveTechs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BraveTechs: Any
  get() = object {
      /** BraveTechs T3_Pro */
      val T3_PRO = "spec:width=800,height=1280,unit=px,dpi=180"

  }
