package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NETGREEN device specifications for Android Compose previews.
 *
 * This extension provides NETGREEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Netgreen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Netgreen: Any
  get() = object {
      /** NETGREEN M11QF8 */
      val M11QF8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** NETGREEN M15QF6 */
      val M15QF6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** NETGREEN M15QF6AR */
      val M15QF6AR = "spec:width=800,height=1280,unit=px,dpi=213"

      /** NETGREEN M16QF11 */
      val M16QF11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** NETGREEN M16QF11AR */
      val M16QF11AR = "spec:width=800,height=1280,unit=px,dpi=160"

      /** NETGREEN M16QF9AR */
      val M16QF9AR = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** NETGREEN M16QF9ES */
      val M16QF9ES = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
