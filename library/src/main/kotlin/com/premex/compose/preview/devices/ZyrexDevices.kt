package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * zyrex device specifications for Android Compose previews.
 *
 * This extension provides zyrex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zyrex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zyrex: Any
  get() = object {
      /** zyrex ZT216_1 */
      val ZT216_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** zyrex ZT216_2 */
      val ZT216_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** zyrex ZT216_23 */
      val ZT216_23 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** zyrex ZT216_5 */
      val ZT216_5 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** zyrex ZT_216 */
      val ZT_216 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
