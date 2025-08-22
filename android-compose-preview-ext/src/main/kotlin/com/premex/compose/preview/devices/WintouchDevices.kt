package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WINTOUCH device specifications for Android Compose previews.
 *
 * This extension provides WINTOUCH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wintouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wintouch: Any
  get() = object {
      /** WINTOUCH A20 */
      val A20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** WINTOUCH A50 */
      val A50 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WINTOUCH K19 */
      val K19 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** WINTOUCH Q705 */
      val Q705 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
