package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VUCATIMES device specifications for Android Compose previews.
 *
 * This extension provides VUCATIMES device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VUCATIMES.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VUCATIMES: Any
  get() = object {
      /** VUCATIMES N10 */
      val N10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VUCATIMES N7 */
      val N7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VUCATIMES N8 */
      val N8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
